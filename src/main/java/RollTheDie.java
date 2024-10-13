import java.util.Random;

public class RollTheDie {
    public static void main(String[] args) {
        System.out.println("Time to play the game! Let's Start");

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        for (int i = 1; i <= maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace += die;

            System.out.printf("Roll #%d: You rolled a %d. ", i, die);

            if (currentSpace == lastSpace) {
                System.out.println("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.println("You passed space " + lastSpace + ". You lose!");
                break;
            } else if (i == maxRolls) {
                System.out.println("You're on space " + currentSpace + ". Didn't make it to " + lastSpace + " spaces. You lose!");
            } else {
                System.out.printf("You're on space %d. %d spaces to go.%n", currentSpace, lastSpace - currentSpace);
            }
        }
    }
}
