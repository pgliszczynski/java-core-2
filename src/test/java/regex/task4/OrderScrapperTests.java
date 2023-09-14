package regex.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderScrapperTests {

    @Test
    void shouldFetchSingleDigitOrderNumber() {
        //Given
        String text = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 " +
                "poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: " +
                "[Integration_test_Contract], total number of orders successfully processed: [2]\n";
        OrderScrapper orderScrapper = new OrderScrapper();

        //When
        int orders = orderScrapper.scrapOrders(text);

        //Then
        assertEquals(2, orders);
    }

    @Test
    void shouldFetchDoubleDigitOrderNumber() {
        //Given
        String text = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 " +
                "poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: " +
                "[Integration_test_Contract], total number of orders successfully processed: [32]\n";
        OrderScrapper orderScrapper = new OrderScrapper();

        //When
        int orders = orderScrapper.scrapOrders(text);

        //Then
        assertEquals(32, orders);
    }

    @Test
    void shouldNotFetchOrderNumber() {
        //Given
        String text = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 " +
                "poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: " +
                "[Integration_test_Contract]\n";
        OrderScrapper orderScrapper = new OrderScrapper();

        //When
        int orders = orderScrapper.scrapOrders(text);

        //Then
        assertEquals(0, orders);
    }
}
