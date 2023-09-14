package collections.task2;

import java.util.*;

public class YellowSubmarineCollections {
    private final List<String> textWords;

    public YellowSubmarineCollections(String[] textWords) {
        this.textWords = Arrays.asList(textWords);
    }

    public Set<String> removeDuplicates() {
        return new HashSet<String>(textWords);
    }

    public void countWords(Set<String> words) {
        for(String currentWord : words) {
            int count = Collections.frequency(textWords, currentWord);
            System.out.println(currentWord + " occurred " + count + " times");
        }
    }

    public Set<String> sortByLength() {
        Comparator<String> lengthComparator = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        return new TreeSet<String>(lengthComparator);
    }
}
