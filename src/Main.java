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
        library.add(new Song("HIGH ON YOU", "SMG", 3.5, "pop", "sad"));
        library.add(new Song("WISHES", "TALWINDER", 4.0, "pop", "happy"));
        library.add(new Song("BARISHAIN", "ANU JAIN", 3.2, "pop", "sad"));
        // Rock songs
        library.add(new Song("PAL PAL", "AFUSIC", 3.2, "rock", "happy"));
        library.add(new Song("12 SAAL", "BILAL SAEED", 4.0, "rock", "happy"));
        library.add(new Song("EMPLIFIER", "IMRAN KHAN", 3.8, "rock", "sad"));
        library.add(new Song("KAUN TALHA", "TALHA ANJUM", 4.2, "rock", "happy"));
        library.add(new Song("MAHI YA", "IMRAN KHAN", 3.9, "rock", "sad"));
        // Jazz songs
        library.add(new Song("DURI", "ATIF ASLAM", 5.0, "jazz", "sad"));
        library.add(new Song("TU JANY NA", "ATIF ASLAM", 4.5, "jazz", "happy"));
        library.add(new Song("ADAT", "ATIF", 5.2, "jazz", "sad"));
        library.add(new Song("REGARDLESS", "ASIM AZHAR", 6.0, "jazz", "sad"));
        library.add(new Song("PANIYON SA", "ATIF ASLAM", 4.0, "jazz", "happy"));

        while (true) {
            System.out.println("\n--- Music Menu ---");
            System.out.println("1. See all songs");
            System.out.println("2. See songs by genre");
            System.out.println("3. See songs by mood");
            System.out.println("4. Get song recommendations by genre");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("All Songs:");
                    for (Song s : library) s.play();
                    break;
                case 2:
                    System.out.print("Enter genre (pop/rock/jazz): ");
                    String genre = scanner.nextLine().toLowerCase();
                    System.out.println("Songs in " + genre + ":");
                    for (Song s : library)
                        if (s.getGenre().equalsIgnoreCase(genre)) s.play();
                    break;
                case 3:
                    System.out.print("Enter mood (happy/sad): ");
                    String mood = scanner.nextLine().toLowerCase();
                    System.out.println("Songs with mood " + mood + ":");
                    for (Song s : library)
                        if (s.getMood().equalsIgnoreCase(mood)) s.play();
                    break;
                case 4:
                    System.out.print("Enter genre for recommendations: ");
                    String recGenre = scanner.nextLine().toLowerCase();
                    System.out.println("Recommended " + recGenre + " songs:");
                    for (Song s : library)
                        if (s.getGenre().equalsIgnoreCase(recGenre)) s.play();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
