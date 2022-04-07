package Test;

class Person{
    public String name="Person";
    public Person(){
        sayName();
    }
    public void sayName(){
        System.out.println(name);
    }
}
class Student extends Person {
    public String name ="Student";
    public void sayName(){
        System.out.println(name);
    }
        }
class Test1{
    public static void main(String[] args) {
        new Student();
    }
}