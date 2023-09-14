package regex.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UuidFinder {

    protected final Pattern pattern;
    protected Matcher matcher;

    public UuidFinder() {
        this.pattern = Pattern.compile("orderUUID=([^ ]{36})");;
    }

    public boolean findUuid(String text) {
        matcher = pattern.matcher(text);
        return matcher.find();
    }
}
