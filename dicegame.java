package ex03.dice;
import java.util.Random;
import java.util.Scanner;

public class dicegame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6)+1;
        int sum = (int)(dice1 + dice2);


        System.out.printf("What is your name?\n> ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Total value: " + sum);

        if(sum > 7) System.out.println(name + " won!");
        else System.out.println(name + " lost...");
    }
}
