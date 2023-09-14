package regex.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderScrapper {

    public int scrapOrders(String text) {
        Pattern pattern = Pattern.compile("total number of orders successfully processed:\\s\\[(\\d*)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }
}
