package regex.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UuidFinder {

    public boolean findUuid(String text) {
        Pattern pattern = Pattern.compile("orderUUID=([^ ]{36})");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
