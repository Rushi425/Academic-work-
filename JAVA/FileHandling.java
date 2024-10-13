import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileHandling {
    public static void main(String[] args) {
        try {
            // Specify the file path
            File f = new File("C:\\Users\\acer\\Desktop\\java_EX\\ABCD.txt");

            // Check if the file is created or already exists
            if (f.createNewFile()) {
                System.out.println("Successfully file is created");
            } else {
                System.out.println("File already exists");
            }

            // Writing to the file
            FileWriter w = new FileWriter(f);
            w.write("Java programming is fun.");
            w.close();
            System.out.println("Writing to the file completed successfully");

            // Reading from the file
            FileReader r = new FileReader(f);
            int character;
            System.out.println("Reading from the file:");
            while ((character = r.read()) != -1) {  // Read character by character
                System.out.print((char) character);  // Print each character
            }
            r.close();
            System.out.println("\nFile read successfully");

            // Uncomment to delete the file
            // if (f.delete()) {
            //     System.out.println("File is deleted successfully");
            // } else {
            //     System.out.println("Failed to delete the file");
            // }

        } catch (IOException i) {
            System.out.println("An exception occurred: " + i.getMessage());
        }
    }
}
