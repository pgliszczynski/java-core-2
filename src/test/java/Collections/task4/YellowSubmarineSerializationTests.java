package Collections.task4;

import collections.task4.YellowSubmarineSerialization;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class YellowSubmarineSerializationTests {

    @Test
    void shouldReadFile() {
        //Given
        String filename = "yellow-submarine.txt";
        YellowSubmarineSerialization yellowSubmarineSerialization = new YellowSubmarineSerialization();

        //When
        yellowSubmarineSerialization.readText(filename);
        yellowSubmarineSerialization.printText();

        //Then
        assertNotEquals(0, yellowSubmarineSerialization.getText().length());
    }
}
