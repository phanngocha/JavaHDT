package MAIN;
import PERSONS.EmployeeFullTime;
import PERSONS.EmployeePartTime;
public class mainPERSONS {
    public static void main(String[] args) {
        EmployeeFullTime employeeFullTime = new EmployeeFullTime();
        employeeFullTime.fulltime();
        employeeFullTime.tinhluong();
        employeeFullTime.inluong();

        EmployeePartTime employeePartTime = new EmployeePartTime();
        employeePartTime.parttime();
        employeePartTime.tinhluong();
        employeePartTime.inluong();
    }
}