package com.mindex.challenge.service.impl;

//Imports
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService
{
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureServiceImpl.class);

    @Autowired
    private EmployeeService employeeService;

    @Override
    public ReportingStructure read(String id)
    {
        LOG.debug("Reading reportingStructure with id: [{}]", id);

        Employee employee = employeeService.read(id);
        int numberOfReports = countNumberOfReports(employee);

        ReportingStructure reportingStructure = new ReportingStructure();
        reportingStructure.setEmployee(employee);
        reportingStructure.setNumberofReports(numberOfReports);

        return reportingStructure;
    }

    //Recursive function for counting reports associated with a given employee
    //Includes children of employee's direct reports
    public int countNumberOfReports(Employee employee)
    {
        List<Employee> directReports = employee.getDirectReports();
        if(directReports == null)
        {
            return 0;
        }
        int counter = directReports.size();
        for(Employee e : directReports)
        {
           counter += 1 + countNumberOfReports(e);
        }
        return counter;
    }
}
