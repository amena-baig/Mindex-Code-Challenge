package com.mindex.challenge.service.impl;

//Imports
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompensationServiceImpl implements CompensationService
{
    private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Autowired
    private CompensationRepository compensationRepository;

    @Autowired
    private EmployeeService employeeService;

    @Override
    public Compensation create(Compensation compensation){
        LOG.debug("Creating employee [{}]", compensation);

        Employee employee = employeeService.read(compensation.getEmployee().getEmployeeId());
        compensation.setEmployee(employee);
        compensationRepository.insert(compensation);

        return compensation;
    }

    @Override
    public Compensation read(String id)
    {
        LOG.debug("Reading compensation with id [{}]", id);

        Employee employee = employeeService.read(id);
        Compensation compensation = compensationRepository.findByEmployee(employee);

        if(compensation == null)
        {
            LOG.error("Employee with id {" + id + "} has no compensation record.");
        }

        return compensation;
    }
}
