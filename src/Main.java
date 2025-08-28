import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("Yasir");

        // Song library
        List<Song> library = new ArrayList<>();
        // Pop songs
        library.add(new Song("AT PEACE", "Karan Aujla", 2.4, "pop", "happy"));
        library.add(new Song("HIGH ROLLERZ", "SMG", 3.1, "pop", "happy"));
        library.add(new Song("LOVE STORY", "Taylor Swift", 3.5, "pop", "sad"));
        library.add(new Song("SUNSHINE", "Adele", 4.0, "pop", "happy"));
        library.add(new Song("DREAMS", "Selena Gomez", 3.2, "pop", "sad"));
        // Rock songs
        library.add(new Song("PAL PAL", "AFUSIC", 3.2, "rock", "happy"));
        library.add(new Song("ROCKSTAR", "Nickelback", 4.0, "rock", "happy"));
        library.add(new Song("NIGHTFALL", "Linkin Park", 3.8, "rock", "sad"));
        library.add(new Song("FIREBALL", "Deep Purple", 4.2, "rock", "happy"));
        library.add(new Song("BROKEN HEART", "Foo Fighters", 3.9, "rock", "sad"));
        // Jazz songs
        library.add(new Song("MOOD INDIGO", "Duke Ellington", 5.0, "jazz", "sad"));
        library.add(new Song("TAKE FIVE", "Dave Brubeck", 4.5, "jazz", "happy"));
        library.add(new Song("MY FUNNY VALENTINE", "Chet Baker", 5.2, "jazz", "sad"));
        library.add(new Song("BLUE IN GREEN", "Miles Davis", 6.0, "jazz", "sad"));
        library.add(new Song("FEELING GOOD", "Nina Simone", 4.0, "jazz", "happy"));

        boolean running = true;

        while (running) {
            System.out.println("\n--- Music Menu ---");
            System.out.println("1. See all songs");
            System.out.println("2. See songs by genre");
            System.out.println("3. See songs by mood");
            System.out.println("4. Get song recommendations by genre");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.println("All Songs:");
                for (Song s : library) s.play();
            } else if (choice == 2) {
                System.out.print("Enter genre (pop/rock/jazz): ");
                String genre = scanner.nextLine().toLowerCase();
                System.out.println("Songs in " + genre + ":");
                for (Song s : library)
                    if (s.getGenre().equalsIgnoreCase(genre)) s.play();
            } else if (choice == 3) {
                System.out.print("Enter mood (happy/sad): ");
                String mood = scanner.nextLine().toLowerCase();
                System.out.println("Songs with mood " + mood + ":");
                for (Song s : library)
                    if (s.getMood().equalsIgnoreCase(mood)) s.play();
            } else if (choice == 4) {
                System.out.print("Enter genre for recommendations: ");
                String recGenre = scanner.nextLine().toLowerCase();
                System.out.println("Recommended " + recGenre + " songs:");
                for (Song s : library)
                    if (s.getGenre().equalsIgnoreCase(recGenre)) s.play();
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
