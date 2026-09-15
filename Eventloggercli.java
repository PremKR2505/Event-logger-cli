import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eventloggercli {
    private static final String LOG_FILE = "event_log.txt";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the Event Logger it runs quite simply in the command line!");
    while (true) {
            System.out.println("\n1. Log event");
            System.out.println("2. View logs");
            System.out.println("3. Undo last event");
            System.out.println("4. Clear all logs");
            System.out.println("5. Exit");
            System.out.print("> ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                System.out.print("Description: ");
                String description = scanner.nextLine().trim();
                if (description.isEmpty()) {
                    System.out.println("Description can't be empty.");
                } else {
                    logevent(description);
                }
            } else if (choice.equals("2")) {
                viewlogs();
            } else if (choice.equals("3")) {
                undolastevent();
            } else if (choice.equals("4")) {
                clearlogs(scanner);
            } else if (choice.equals("5")) {
                System.out.println("Bye.");
                scanner.close();
                return;
            } else {
                System.out.println("Enter 1-5.");
            }
        }
    }

    private static void logevent(String description) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] " + description;

        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(logEntry);
            System.out.println("Logged.");
        } catch (IOException e) {
            System.out.println("Couldn't write to log file: " + e.getMessage());
        }
    }



    