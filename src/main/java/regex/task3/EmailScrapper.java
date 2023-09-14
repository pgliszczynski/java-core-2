package regex.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailScrapper {

    public String scrapEmail(String text) {
        Pattern pattern = Pattern.compile("[(](.*)[)]");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
}
