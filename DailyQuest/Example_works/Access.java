package Example_works;

public class Access {

    public int age=10;
    String name="Sudeep";
    private long phone=8971733627L;

    public void printAge(){
        System.out.println("Age is: "+this.age);
    }

    void printName(){
        System.out.println("Name is: "+this.name);
    }

    private void printPhone(){
        System.out.println("Age is: "+this.phone);
    }
    static Access getInstance(){
        Access obj=new Access();
        return obj;
    }
}
