package collections.task1;

import java.util.Arrays;

public class YellowSubmarine {
    private final static String TEXT = "In the town where I was born\n" +
            "Lived a man who sailed to sea\n" +
            "And he told us of his life\n" +
            "In the land of submarines\n" +
            "So we sailed on to the sun\n" +
            "'Til we found a sea of green\n" +
            "And we lived beneath the waves\n" +
            "In our yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "And our friends are all aboard\n" +
            "Many more of them live next door\n" +
            "And the band begins to play\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "Full steam ahead, Mister Boatswain, full steam ahead\n" +
            "Full steam ahead it is, Sergeant\n" +
            "(Cut the cable, drop the cable)\n" +
            "Aye-aye, sir, aye-aye\n" +
            "Captain, captain\n" +
            "As we live a life of ease (a life of ease)\n" +
            "Every one of us (every one of us)\n" +
            "Has all we need (has all we need)\n" +
            "Sky of blue (sky of blue)\n" +
            "And sea of green (sea of green)\n" +
            "In our yellow (in our yellow)\n" +
            "Submarine (submarine, aha)\n" +
            "We all live in a yellow submarine\n" +
            "A yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "A yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine\n" +
            "We all live in a yellow submarine\n" +
            "Yellow submarine, yellow submarine";

    public String textCleaner() {
        return TEXT.replaceAll("[,()]", "")
                .replace("\n", " ")
                .toLowerCase();
    }

    public String[] textSplitter(String text) {
        return text.split(" ");
    }

    public void countWord(String[] textWords) {
        boolean[] alreadyOccurred = new boolean[textWords.length];
        Arrays.fill(alreadyOccurred, false);

        for(int i = 0; i < textWords.length; i++) {
            String currentWord = textWords[i];
            int count = 1;

            if(alreadyOccurred[i]) {
                continue;
            }

            for(int j = i+1; j < textWords.length; j++) {
                if(currentWord.equals(textWords[j])) {
                    alreadyOccurred[j] = true;
                    count++;
                }
            }
            alreadyOccurred[i] = true;
            System.out.println(currentWord + " occurred " + count + " times");
        }
    }
}