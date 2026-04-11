package Polimorphism;
public class Birds extends Animals {
private String flying;
private String reproduction;
public Birds(String type, String name, int age, boolean isAlive, String flying, String reproduction){
    super(type, name, age, isAlive);
    this.flying = flying;
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
        System.out.println("Flying: " + this.flying);
        System.out.println("Reproduction: " + this.reproduction);
    }
}