package Algoritmik;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Algoritmik {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Schreiben Sie ein Wort und ich werde es rückwärts schreiben :  ");
        String answer = scanner.next();
        reverseword(answer);
        String[]  games = {"Crimson Desert","Assasin's creed Shadows","Pragmata","resident evil requiem"};
        String randomgame = games[rand.nextInt(games.length)];
        int[] Numbers = {5,3,2,4,1,6,9,8,7,10};
        System.out.println(randomgame);
        Bubblesort(Numbers);
        scanner.close();  
    }
    public static void reverseword(String answer){
        String reverse = "";
        for(int i = answer.length(); i > 0; i--){
            reverse += answer.charAt(i - 1);
        }
        System.out.println(reverse);
    }
    public static void Bubblesort(int[] numbers){
      for(int i = 0; i < numbers.length;i++){
        for(int j = 0; j < numbers.length - 1 - i; j++){
           if(numbers[j] > numbers[j + 1]){
             int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
           }
        }
    }
    System.out.println( "Sortierte Zahlen : " + Arrays.toString(numbers));
 }
}