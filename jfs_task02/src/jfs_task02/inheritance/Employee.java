package jfs_task02.inheritance;

public class Employee extends Person {
    int employeeId;
    double salary;
    Employee(int age,String name,int employeeId,double salary){
        super(age,name);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public void displayEmployeeDetails(){
        System.out.print("Employee Details\nEmployee ID: "+this.employeeId+"\nName: "+super.name+"\nAge: "+super.age+"\nSalary: "+this.salary+".\n");
    }


}
