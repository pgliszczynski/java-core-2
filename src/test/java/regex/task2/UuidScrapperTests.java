package regex.task2;

import org.junit.jupiter.api.Test;
import regex.task1.UuidFinder;

import static org.junit.jupiter.api.Assertions.*;

public class UuidScrapperTests {

    @Test
    void shouldFetchUuid() {
        //Given
        String text = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO " +
                " OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract " +
                "customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 " +
                "poNum=Test_TS5155079515 lineCount=3\n";
        UuidScrapper uuidScrapper = new UuidScrapper();

        //When
        String uuid = uuidScrapper.scrapUuid(text);

        //Then
        assertEquals("d34149d8-88ab-4791-bb0a-46c96e034200", uuid);
    }

    @Test
    void shouldNotFetchUuid() {
        //Given
        String text = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO " +
                " OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract " +
                "customerName=0005084863 orderUUID= " +
                "poNum=Test_TS5155079515 lineCount=3\n";
        UuidScrapper uuidScrapper = new UuidScrapper();

        //When
        String uuid = uuidScrapper.scrapUuid(text);

        //Then
        assertTrue(uuid.isEmpty());
    }
}
