package regex.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailScrapperTests {

    @Test
    void shouldFetchEmail() {
        //Given
        String text = "test 2667843 (test_email@griddynamics.com) test 67483 some string";
        EmailScrapper emailScrapper = new EmailScrapper();

        //When
        String email = emailScrapper.scrapEmail(text);

        //Then
        assertEquals("test_email@griddynamics.com", email);
    }

    @Test
    void shouldNotFetchEmail() {
        //Given
        String text = "test 2667843  test 67483 some string";
        EmailScrapper emailScrapper = new EmailScrapper();

        //When
        String email = emailScrapper.scrapEmail(text);

        //Then
        assertTrue(email.isEmpty());
    }
}
