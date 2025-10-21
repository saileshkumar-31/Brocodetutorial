import java.util.Scanner;
public class madlibsgame {
    public static void main (String[] args){
        //MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (description) : ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a noun (animal): ");
        String noun = scanner.nextLine();

        System.out.print("Enter an adjective (emotion): ");
        String adjective3 = scanner.nextLine();

        System.out.print("Enter a noun (person): ");
        String noun2= scanner.nextLine();

        System.out.print("Enter an adjective (emotion): ");
        String adjective1 =  scanner.nextLine();

        System.out.print("Enter a verb (present tense): ");
        String verb = scanner.nextLine();

        System.out.println("\n");
        System.out.println("\n");

        System.out.println("I am " + noun2 + " saw this movie on netflix.");
        System.out.println("It was a "+ adjective +  " movie");
        System.out.println("A particular scene made me " + verb + " in fear ");
        System.out.println("I expected it to be a " + noun +"a killing machine.");
        System.out.println("But after the intermission " + noun + " was said to be the guardian");
        System.out.println(" who thought it would be the guardian of that village");
        System.out.println("It literally ate the villagers alive, this made me very " + adjective3);
        System.out.println("After watching the movie i felt " + adjective1);

        scanner.close();
    }
}
