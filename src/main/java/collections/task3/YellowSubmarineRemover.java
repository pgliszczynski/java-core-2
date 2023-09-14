package collections.task3;

import java.util.Arrays;
import java.util.List;

public class YellowSubmarineRemover {
    private List<String> textWords;

    public YellowSubmarineRemover(String[] textWords) {
        this.textWords = Arrays.asList(textWords);
    }

    public void removeYellowSubmarine() {
        textWords.removeAll(Arrays.asList("Yellow", "Submarine"));
    }

    public void printWords() {
        textWords.forEach(System.out::println);
    }

    public List<String> getTextWords() {
        return textWords;
    }
}
