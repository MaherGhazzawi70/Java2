package Polimorphism;
public abstract class Animals{
    protected String type;
    protected String name;
    protected int age;
    protected boolean isAlive;
    public Animals(String type, String name, int age, boolean isAlive){
        this.type = type;
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }
    public abstract String getEnvironment();
    public abstract String foodType();

    public void eat(){
        System.out.println(this.name + " is eating " + foodType());
    }
    public void sleep(){
        System.out.println(this.name + " is sleeping in" + getEnvironment());
    }
    public void breathe(){
        System.out.println(this.name + " is breathing in " + getEnvironment());
    }
    public void info(){
        System.out.println("Type: " + this.type);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Is alive: " + this.isAlive);
    } 
}