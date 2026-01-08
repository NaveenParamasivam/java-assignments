package jfs_task02;

public class Person {
    String name;
     int age =18;
    Person(String name){

        this.name = name;
    }
    Person(int age, String name){
        this.age = age;
        this.name =name;
    }
    public void displayResult(){
        System.out.printf("\nName: %s\nAge: %d\n",name,age);
    }

    public static void main(String[] args){
        Person person1 = new Person("Arul");
        Person person2 = new Person(20,"Rahul");

        person1.displayResult();
        person2.displayResult();
    }
}
