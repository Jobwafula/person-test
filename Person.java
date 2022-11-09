package test;

public class Person {

    public static int age;
    public Person(int age){
        super();
        this.age = age;

    }

    public int display(int age){

        return this.age;
    }

    public static void main(String[] args) {
        Person objperson = new Person(0);
        
        men objMen = new men(0);
        System.out.println("age :"+objperson.display(0));
        System.out.println("height :"+objMen.display(0));
        
    }
}
