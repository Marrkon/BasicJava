package genericAndInterfaces;
import java.io.IOException;

public interface TextPrint {
    default void printText(String text) {
        System.out.println(text);
    }
    static void printText2(String text, String text2) throws IOException { System.out.println(text + text2); }
}