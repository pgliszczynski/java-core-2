package collections.task2;

import java.util.*;

public class YellowSubmarineCollections {
    private final List<String> textWords;

    public YellowSubmarineCollections(String[] textWords) {
        this.textWords = Arrays.asList(textWords);
    }

    public Set<String> removeDuplicates() {
        return new HashSet<>(textWords);
    }

    public void countWords(Set<String> words) {
        for(String currentWord : words) {
            int count = Collections.frequency(textWords, currentWord);
            System.out.println(currentWord + " occurred " + count + " times");
        }
    }

    public Set<String> sortByLength() {
        Comparator<String> lengthComparator =
                Comparator.comparing(String::length)
                            .thenComparing(Comparator.naturalOrder());

        Set<String> sortedWords = new TreeSet<>(lengthComparator);
        sortedWords.addAll(textWords);
        return sortedWords;
    }
}
