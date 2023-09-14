package Collections.task1;

import collections.task1.YellowSubmarine;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YellowSubmarineTests {

    @Nested
    class Task1Tests {

        @Test
        void testTextCleaner() {
            //Given
            YellowSubmarine yellowSubmarine = new YellowSubmarine();

            //When
            String newText = yellowSubmarine.textCleaner();

            //Then
            assertFalse(newText.matches("(.*)[,\n](.*)"));
        }

        @Test
        void testTextSplitter() {
            //Given
            YellowSubmarine yellowSubmarine = new YellowSubmarine();
            String cleanedText = yellowSubmarine.textCleaner();

            //When
            String[] textWords = yellowSubmarine.textSplitter(cleanedText);

            //Then
            assertTrue(textWords.length > 0);
        }

        @Test
        void testWordCounter() {
            //Given
            YellowSubmarine yellowSubmarine = new YellowSubmarine();
            String cleanedText = yellowSubmarine.textCleaner();
            String[] textWords = yellowSubmarine.textSplitter(cleanedText);

            //When
            yellowSubmarine.countWord(textWords);

            //Then
        }
    }
}
