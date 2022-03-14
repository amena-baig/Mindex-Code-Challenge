package com.mindex.challenge.data;
/*
    Object class for type Compensation
 */
public class Compensation
{
    //Fields
    private Employee employee;
    private String salary;
    private String effectiveDate;

    //Default constructor
    public Compensation()
    {
        employee = null;
        salary = "";
        effectiveDate = "";
    }

    //Overloaded constructor
    public Compensation(Employee employee, String salary, String effectiveDate)
    {
        this.employee = employee;
        this.salary = salary;
        this.effectiveDate = effectiveDate;
    }

    //Get method for employee
    public Employee getEmployee()
    {
        return this.employee;
    }

    //Get method for salary
    public String getSalary()
    {
        return this.salary;
    }

    //Get method for effectiveDate
    public String getEffectiveDate()
    {
        return this.effectiveDate;
    }

    //Set method for employee
    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    //Set method for salary
    public void setSalary(String salary)
    {
        this.salary = salary;
    }

    //Set method for effectiveDate

    public void setEffectiveDate(String effectiveDate)
    {
        this.effectiveDate = effectiveDate;
    }

//    //Overridden equals(Object obj) method
//    public boolean equals(Object obj)
//    {
//        if(obj instanceof Compensation)
//        {
//            if(obj == this)
//            {
//                return true;
//            }
//            Compensation temp = (Compensation) obj;
//            return (this.employee.getEmployeeId().equals(temp.employee.getEmployeeId()))
//                && (this.salary.equals(temp.getSalary()))
//                && (this.effectiveDate.equals(temp.getEffectiveDate()));
//        }
//        return false;
//    }

//    //Overridden toString() method
//    public String toString()
//    {
//        return "Employee: " + this.employee.getFirstName() + " " + this.employee.getLastName()
//                + " (id: " + this.employee.getEmployeeId() + ")"
//             + "\nSalary: " + this.salary
//             + "\nEffective date: " + this.effectiveDate
//             + "\n";
//    }

}
