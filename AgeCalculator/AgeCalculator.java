package AgeCalculator;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculator {
    public static void main(String[] args) {
        System.out.println("Age Calculator");
        sagalt();
    }
    public static void sagalt(){
    Scanner sc = new Scanner(System.in);
    LocalDate heute = LocalDate.now();
    System.out.println("in welches Jahr bist du geboren ? : ");
    int year = sc.nextInt();

    System.out.println("in welchen Monat bist du geboren ? : ");
    int month = sc.nextInt();

    System.out.println("in welchen Tag bist du geboren ? : ");
    int day = sc.nextInt();

    LocalDate geburtstag = LocalDate.of(year, month, day);
    Period alter = Period.between(geburtstag, heute);
    System.out.println("Du bist " + alter.getYears() + " Jahre alt." + alter.getMonths() + " Monate alt." + alter.getDays() + " Tage alt.");
    sc.close();
 }
}