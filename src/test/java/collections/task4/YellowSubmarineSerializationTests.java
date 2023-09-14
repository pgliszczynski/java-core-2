package collections.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void shouldNotReadFile() {
        //Given
        String filename = "test.txt";
        YellowSubmarineSerialization yellowSubmarineSerialization = new YellowSubmarineSerialization();

        //When
        yellowSubmarineSerialization.readText(filename);

        //Then
        assertEquals(0, yellowSubmarineSerialization.getText().length());
    }

    @Test
    void shouldFindString() throws BeatlesException {
        //Given
        String filename = "yellow-submarine.txt";
        YellowSubmarineSerialization yellowSubmarineSerialization = new YellowSubmarineSerialization();
        yellowSubmarineSerialization.readText(filename);

        //When
        boolean wasFound = yellowSubmarineSerialization.textContains("yellow submarine");

        //Then
        assertTrue(wasFound);
    }

    @Test
    void shouldNotFindString() {
        //Given
        String filename = "yellow-submarine.txt";
        YellowSubmarineSerialization yellowSubmarineSerialization = new YellowSubmarineSerialization();
        yellowSubmarineSerialization.readText(filename);

        //When

        //Then
        assertThrows(BeatlesException.class, () -> yellowSubmarineSerialization.textContains("Show must go on!"));
    }
}
