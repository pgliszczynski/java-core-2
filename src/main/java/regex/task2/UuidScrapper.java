package regex.task2;

import regex.task1.UuidFinder;

public class UuidScrapper extends UuidFinder {

    public String scrapUuid(String text) {
        if (findUuid(text)) {
            return matcher.group(1);
        }
        return "";
    }
}
