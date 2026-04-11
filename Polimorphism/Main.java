package Polimorphism;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Animals fish = new Fish("Fish", "Nemo", 2, true, "Saltwater, Sea", "Eggs");
        Animals bird = new Birds("Canary", "Zoro", 1, true,"Home and wild", "Eggs");
        Animals reptil = new Reptils("Crocodile", "Rino",5,true,"Scales","Eggs");
        Animals mammal = new Mammifere("Lion", "Simba", 3, true, "Walks on four legs", "Live birth"); 
        ArrayList<Animals> animalsZoo = new ArrayList<>();
        animalsZoo.add(fish);
        animalsZoo.add(bird);
        animalsZoo.add(reptil);
        animalsZoo.add(mammal); 
        for(Animals eachanimal : animalsZoo){
            eachanimal.info();
            System.out.println("Environment: " + eachanimal.getEnvironment());
            System.out.println("Food type: " + eachanimal.foodType());
                System.out.println("--------------------------------------------------");
        }
    }
}