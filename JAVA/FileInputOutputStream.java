import java.io.*;
import java.util.Scanner;

public class FileInputOutputStream {
    public static void main(String[] args) {
        // File where the data will be stored
        String filename = "student_info.txt";

        // Input using DataInputStream (wrapped around System.in)
        try (DataInputStream input = new DataInputStream(System.in)) {

            // Collect student details from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the following details:");

            System.out.print("Roll No: ");
            @SuppressWarnings("deprecation")
            String rollNo = input.readLine();

            System.out.print("Class: ");
            @SuppressWarnings("deprecation")
            String studentClass = input.readLine();

            System.out.print("Age: ");
            @SuppressWarnings("deprecation")
            String age = input.readLine();

            System.out.print("Weight: ");
            @SuppressWarnings("deprecation")
            String weight = input.readLine();

            System.out.print("Height: ");
            @SuppressWarnings("deprecation")
            String height = input.readLine();

            System.out.print("City: ");
            @SuppressWarnings("deprecation")
            String city = input.readLine();

            System.out.print("Phone: ");
            @SuppressWarnings("deprecation")
            String phone = input.readLine();
            scanner.close();

            // Writing data to a file using FileOutputStream
            try (FileOutputStream fos = new FileOutputStream(filename)) {
                String studentData = "Roll No: " + rollNo + "\n" +
                        "Class: " + studentClass + "\n" +
                        "Age: " + age + "\n" +
                        "Weight: " + weight + "\n" +
                        "Height: " + height + "\n" +
                        "City: " + city + "\n" +
                        "Phone: " + phone + "\n";

                // Convert the data to bytes and write it to the file
                fos.write(studentData.getBytes());
                System.out.println("\nStudent information has been saved to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }

            // Reading data back from the file using FileInputStream
            try (FileInputStream fis = new FileInputStream(filename)) {
                System.out.println("\nRetrieving student information from the file:");
                int content;
                while ((content = fis.read()) != -1) {
                    System.out.print((char) content); // Cast byte to character
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading from the file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
