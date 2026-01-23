import java.io.*;

public class FileHandlingUtility {

    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void modifyFile(String fileName, String newContent) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "codtech_internship.txt";

        writeFile(fileName,
                "CODTECH Internship\nJava File Handling Utility\n");

        readFile(fileName);

        modifyFile(fileName,
                "\nCompletion Certificate will be issued on internship end date.");

        readFile(fileName);
    }
}
