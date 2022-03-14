package com.mindex.challenge.data;
/*
    Object class for type ReportingStructure
 */
public class ReportingStructure {

    //Fields
    private Employee employee;
    private int numberofReports;

    //Default constructor
    public ReportingStructure()
    {
        employee = null;
        numberofReports = 0;
    }

    //Overloaded constructor
    public ReportingStructure(Employee employee, int numberofReports)
    {
        this.employee = employee;
        this.numberofReports = numberofReports;
    }

    //Get method for employee
    public Employee getEmployee()
    {
        return this.employee;
    }

    //Get method for numberOfReports
    public int getNumberofReports()
    {
        return this.numberofReports;
    }

    //Set method for employee
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //Set method for numberOfReports
    public void setNumberofReports(int numberofReports) {
        this.numberofReports = numberofReports;
    }

    //Overridden equals(Object obj) method
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof ReportingStructure)
        {
            if(obj == this)
            {
                return true;
            }
            ReportingStructure temp = (ReportingStructure) obj;
            return (this.getEmployee().getEmployeeId().equals(temp.employee.getEmployeeId()))
                    && (this.numberofReports == temp.getNumberofReports());
        }
        return false;
    }

    //Overridden toString() method
    @Override
    public String toString()
    {
        return "Employee: " + this.employee.getFirstName() + " " + this.employee.getLastName()
                + " (id: " + this.employee.getEmployeeId() + ")"
             + "\nNumber of Reports: " + this.numberofReports
             + "\n";
    }
}
