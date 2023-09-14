package regex.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UuidFinderTests {

    @Test
    void shouldFindUuid() {
        //Given
        String text = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO " +
                " OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract " +
                "customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 " +
                "poNum=Test_TS5155079515 lineCount=3\n";
        UuidFinder uuidFinder = new UuidFinder();

        //When
        boolean wasFound = uuidFinder.findUuid(text);

        //Then
        assertTrue(wasFound);
    }

    @Test
    void shouldNotFindUuid() {
        //Given
        String text = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO " +
                " OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract " +
                "customerName=0005084863 orderUUID= " +
                "poNum=Test_TS5155079515 lineCount=3\n";
        UuidFinder uuidFinder = new UuidFinder();

        //When
        boolean wasFound = uuidFinder.findUuid(text);

        //Then
        assertFalse(wasFound);
    }
}
