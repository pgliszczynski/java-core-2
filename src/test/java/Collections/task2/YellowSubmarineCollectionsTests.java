package Collections.task2;

import collections.task1.YellowSubmarine;
import collections.task2.YellowSubmarineCollections;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.fail;

public class YellowSubmarineCollectionsTests {

    private static YellowSubmarineCollections yellowSubmarineCollections;

    @BeforeAll
    public static void prepareText() {
        YellowSubmarine yellowSubmarine = new YellowSubmarine();
        String cleanedText = yellowSubmarine.textCleaner();
        yellowSubmarineCollections = new YellowSubmarineCollections(yellowSubmarine.textSplitter(cleanedText));
    }

    @Test
    void testCountWords() {
        //Given
        Set<String> textWithoutDuplicates = yellowSubmarineCollections.removeDuplicates();

        //When
        yellowSubmarineCollections.countWords(textWithoutDuplicates);

        //Then
        fail();
    }

    @Test
    void testRemoveDuplicates() {
        //Given

        //When
        Set<String> textWithoutDuplicates = yellowSubmarineCollections.removeDuplicates();

        //Then
        for(String word : textWithoutDuplicates) {
            System.out.println(word);
        }
        fail();
    }

    @Test
    void testSortWordByLength() {
        //Given

        //When
        Set<String> wordsSorted = yellowSubmarineCollections.sortByLength();

        //Then
        for(String word : wordsSorted) {
            System.out.println(word);
        }
        fail();
    }
}
