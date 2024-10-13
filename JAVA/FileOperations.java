import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the filename from the user
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Writing to the file...");
            writer.write("This is the first line written to the file.\n");
            writer.write("This is the second line.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Append to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            System.out.println("Appending to the file...");
            writer.write("This line is appended.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading from the file...");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}
