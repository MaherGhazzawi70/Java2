package Dreieck;
import java.util.Scanner;
public class Dreieck{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreiben Sie die länger von der Pyramide : ");
        int number = scanner.nextInt();
       dreieck(number); 
       System.out.println("Wie lange muss den Tannenbaum sein : ");
       int TannenBaum = scanner.nextInt();
       dreieck(number); 
       for(int i = 0; i < TannenBaum; i++){
            for(int j = 0; j < number - 1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
         }
       scanner.close();
    }
    public static void dreieck(int hoher){
       for(int i = 0; i < hoher; i++){
        for(int s = 0; s < hoher - i - 1; s++){
          System.out.print(" ");  
        }
        int stars = i * 2 + 1;
        for(int j = 0; j < stars; j++){
            System.out.print("*");
        }
        System.out.println(" ");
       }
    }
}