package hw9.homework9;

public class Employee {
    private String firstName;
    private String secondName;
    private String department;
    private double salary;
    public String getFullName() {return firstName + " " + secondName;}



    public Employee(String firstName, String secondName, String department, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
    }
    public Employee(Employee employee) {
        this.firstName = employee.firstName;
        this.secondName = employee.secondName;
        this.department = employee.department;
        this.salary = employee.salary;
    }

    public  String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО: " + getFirstName() + " " + getSecondName() + ", отдел: " + department + ", зарплата: " + salary;
    }

}