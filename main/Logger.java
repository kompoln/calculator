import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String operation, ComplexNumber result) {
        try (FileWriter writer = new FileWriter("calculator.log", true)) {
            writer.write("Operation: " + operation + ", Result: " + result + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
