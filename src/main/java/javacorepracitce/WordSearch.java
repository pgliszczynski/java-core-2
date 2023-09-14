package javacorepracitce;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearch {

    public List<String> findWords(String text) {
        Pattern pattern = Pattern.compile("\\bde\\w*");
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }

        return words;
    }
}
