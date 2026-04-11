package Polimorphism;
public class Mammifere extends Animals {
    private String walking;
    private String reproduction;
    public Mammifere(String type, String name, int age, boolean isAlive, String walking, String reproduction){
        super(type, name, age, isAlive);
        this.walking = walking;
        this.reproduction = reproduction;
    }
    public void info(){
        super.info();
        System.out.println("Walking: " + this.walking);
        System.out.println("Reproduction: " + this.reproduction);
    }
    @Override
    public String getEnvironment() {
        return "Walt,Meer,Bergen,Wüste";
    }
    @Override
    public String foodType(){
        return "Pflanzen und Fleisch";
    }

}