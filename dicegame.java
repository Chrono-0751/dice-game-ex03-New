package ex03.dice;
import java.util.Random;

public class dicegame {
    public static void main(String[] args) {

        Random random = new Random();

        int dice1 = random.nextInt(6)+1;
        int dice2 = random.nextInt(6)+1;
        int sum = (int)(dice1 + dice2);

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Total value: " + sum);

        if(sum > 7) System.out.println("You won");
        else System.out.println("You lost");
    }
}
