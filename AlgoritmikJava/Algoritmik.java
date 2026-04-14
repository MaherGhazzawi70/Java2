package AlgoritmikJava;
import java.util.Scanner;
public class Algoritmik{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Schreiben Sie die Anzahl der Fibonacci-Zahlen, die Sie generieren möchten:");
         int max = scanner.nextInt();
            fibonacci(max);
            System.out.println("Schreiben Sie einen Wort, um ein Polindrom zu prüfen :");
            String Polindrom = scanner.next();
            polindrom(Polindrom);
            System.out.println("Schreiben Sie eine Zahl für Fakultät:");
            int number = scanner.nextInt();
            System.out.println(number + "! = " + fakultet(number));
    }

    public static void fibonacci(int max){
        int firstnumber = 0;
        int secondnumber = 1;
        for(int i = 0; i < max; i++ ){
            System.out.print(firstnumber + " ");
            int temp = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = temp;
        }
        System.out.println();
    }
    public static void polindrom(String Polindrom){
            String reverse = "";
            for(int i = Polindrom.length(); i > 0; i--){
                reverse += Polindrom.charAt(i - 1);
            }
           if(Polindrom.equals(reverse)){
                System.out.println("Das Wort " + Polindrom + " ist ein Polindrom");
            }else{
                System.out.println("Das Wort " + Polindrom + " ist kein Polindrom");
            }
        }

        public static int fakultet(int number){
            if(number == 1){
                return 1;
            }
            return number * fakultet(number - 1);
        }
        public static string helloWorld(string HelloWorld){
            
        }
}