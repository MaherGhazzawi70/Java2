package Polimorphism;
public class Fish extends Animals {
    private String waterType;
    private String reproduction;
    public Fish(String type, String name, int age, boolean isAlive, String waterType, String reproduction){
        super(type, name, age, isAlive);
        this.waterType = waterType;
        this.reproduction = reproduction;
    }
    public void info(){
        super.info();
        System.out.println("Water type: " + this.waterType);
        System.out.println("Reproduction: " + this.reproduction);
    }
    @Override
    public String getEnvironment() {
        return "Meer, Flüsse, Seen";
    }
    @Override
    public String foodType(){
        return "Pflanzen und kleine Tiere";
    }
}