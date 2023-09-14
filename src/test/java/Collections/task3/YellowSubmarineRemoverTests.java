package Collections.task3;

import collections.task1.YellowSubmarine;
import collections.task3.YellowSubmarineRemover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YellowSubmarineRemoverTests {

    @Test
    void shouldRemoveYellowSubmarine() {
        //Given
        YellowSubmarine yellowSubmarine = new YellowSubmarine();
        String cleanedText = yellowSubmarine.textCleaner();
        YellowSubmarineRemover yellowSubmarineRemover =
                new YellowSubmarineRemover(yellowSubmarine.textSplitter(cleanedText));

        //When
        yellowSubmarineRemover.removeYellowSubmarine();
        yellowSubmarineRemover.printWords();

        //Then
        assertAll(() -> assertFalse(yellowSubmarineRemover.getTextWords().contains("Yellow")),
                () -> assertFalse(yellowSubmarineRemover.getTextWords().contains("Submarine")));
    }
}
