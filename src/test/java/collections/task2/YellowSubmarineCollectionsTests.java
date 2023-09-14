package collections.task2;

import collections.task1.YellowSubmarine;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    }

    @Test
    void testSortWordByLength() {
        //Given

        //When
        Set<String> wordsSorted = yellowSubmarineCollections.sortByLength();

        Iterator<String> iterator = wordsSorted.iterator();
        boolean isSorted = true;
        while(iterator.hasNext()) {
            String actualWord = iterator.next();
            System.out.println(actualWord);

            if(iterator.hasNext()) {
                isSorted = iterator.next().length() >= actualWord.length();
            }
        }

        //Then
        assertTrue(isSorted);
    }
}
