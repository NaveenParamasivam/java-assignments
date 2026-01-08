package jfs_task02.inheritance;

public class MainClass {
    public static void main(String[] args){
        Employee emp = new Employee(40,"Angel",1,40000.0);
        emp.displayEmployeeDetails();
        Employee emp1 = new Employee(30,"Jose",2,30000.0);
        emp1.displayEmployeeDetails();
    }
}
