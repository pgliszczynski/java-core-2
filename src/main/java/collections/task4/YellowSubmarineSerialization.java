package collections.task4;

import java.io.*;
import java.util.stream.Collectors;

public class YellowSubmarineSerialization {
    private String text = "";

    public void readText(String fileName) {
        try(BufferedReader bufferedReader =
                new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(new File(fileName))))) {
            text = bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean textContains(String string) throws BeatlesException {
        if (text.contains(string)) {
            return true;
        } else {
            throw new BeatlesException();
        }
    }

    public void printText() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }
}
