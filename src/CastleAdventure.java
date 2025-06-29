import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Part 1: Enter the Castle
        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Enter the 5 secret numbers to unlock the castle:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
            }
        }

        if (isCodeCorrect) {
            System.out.println("the door lock is open... Welcome to the Castle!");
        } else {
            System.out.println("Wrong code! The door stays closed.");
        }

//Part 2: Solve the Magic Board
        int[] magicBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int sum = 0;

        for (int num : magicBoard) {
            sum += num;
        }

        System.out.println("\nThe sum of the magic numbers is: " + sum);
        System.out.println("\nThe next room is open");

        //Part 3: Defeat the Iron Dragon
        int[] dragonAttacks = {8, 16, 24, 32, 40};
        boolean allEven = true;

        for (int attack : dragonAttacks) {
            if (attack % 2 != 0) {
                allEven = false;
                break;
            }
        }

        if (allEven) {
            System.out.println("\nAll attacks are even numbers! Shield activated!");
        } else {
            System.out.println("\nWarning! Odd attack!");
        }

        // Part 4: Find the Magic Key
        System.out.print("\nWhat is your favorite number? ");
        int favoriteNumber = scanner.nextInt();
        boolean found = false;

        // Verification in secretCode
        for (int num : secretCode) {
            if (num == favoriteNumber) {
                found = true;
                break;
            }
        }

        // If not found, verification in magicBoard
        if (!found) {
            for (int num : magicBoard) {
                if (num == favoriteNumber) {
                    found = true;
                    break;
                }
            }
        }

        // If not found, verification in dragonAttacks
        if (!found) {
            for (int num : dragonAttacks) {
                if (num == favoriteNumber) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Your key has been found! Magic is on your side!");
        } else {
            System.out.println("You need more magic...");
        }

        scanner.close();
    }
    }


