import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    @Test
    void givendistanceAndTime_ShouldReturnTheTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    void givenDistanceAndTime_shouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

//    @Test
//    void givenMultipleRide_ShouldReturnTotalFare() {
//        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
//        Ride[] rides = {new Ride(2.0, 5),
//                new Ride(0.1, 1)
//        };
//        double fare = invoiceGenerator.calculateFare(rides);
//        Assert.assertEquals(30, fare, 0.0);


}
