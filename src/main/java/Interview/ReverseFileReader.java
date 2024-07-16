package Interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

public class ReverseFileReader {
    private List<String> lines;
    private int currentLine;

    public ReverseFileReader(String filePath) throws IOException {
        try {
            lines = Files.readAllLines(Paths.get(filePath));
            currentLine = lines.size() - 1;
        } catch (NoSuchFileException e) {
            System.err.println("The specified file does not exist: " + filePath);
            throw e;
        }
    }
    public String readLine() throws IOException     {
        if (currentLine < 0) {
            return null;
        }
        return lines.get(currentLine--);
    }

    public static void main(String[] args) {
        try {
            ReverseFileReader reader = new ReverseFileReader("src/main/java/Interview/test.txt");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*

The requirement specification for this project is detailed in this section, and your submission to QASystems must implement/adhere to all of these.
To make the Reverse File Reader requirements clear, each requirement will be detailed inside a text
box, and identified with REQXXy, where XX is a number between 1 and 99, and y is an optional
identifying letter e.g:

                        Requirements
REQ01: The project will be coded to be compatible with Java 8 (X)
REQ02: The project will be implemented as a single Java class (X)
REQ03a: The constructor for the class will accept one argument that identifies
the file to read.(X)
REQ03b: The public method will have this signature:
public String readLine() throws IOException(X)
REQ04: The file to read will be set up by the object constructor when the
object is created.(X)
REQ05: The readLine method will return a single line from the file, not including a newline character on the end. (X)
REQ05a: The first call to readLine will return the last line from the file. (x)
REQ05b: Each subsequent call to readLine will return the previous line in the file.(X)
REQ05c: The order of the characters in the returned string will be the same as in the file, i.e. the line itself is not reversed.(X)
REQ06: Java Reflection will not be used.(X)

* */