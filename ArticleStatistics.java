
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArticleStatistics {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a filename.");
            return;
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            File file = new File(args[0]);
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();

                lines++;
                characters += line.length();

                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {
                    words += trimmedLine.split("\\s+").length;
                }
            }

            input.close();

            System.out.println("Total characters: " + characters);
            System.out.println("Total words: " + words);
            System.out.println("Total lines: " + lines);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + args[0]);
        }
    }
}
