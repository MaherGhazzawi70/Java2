package Polimorphism;
public class Reptils extends Animals {
    private String skinType;
    private String reproduction;
    public Reptils(String type, String name, int age, boolean isAlive, String skinType, String reproduction){
        super(type, name, age, isAlive);
        this.skinType = skinType;
        this.reproduction = reproduction;
    }
    @Override
    public String getEnvironment() {
        return "Wald, Sümpfe, Wüste";
    }
    @Override
    public String foodType(){
        return "Insekten, kleine Tiere";
    }
    public void info(){
        super.info();
        System.out.println("Skin type: " + this.skinType);
        System.out.println("Reproduction: " + this.reproduction);
    }
}