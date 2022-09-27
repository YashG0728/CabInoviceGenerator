import java.util.Objects;

public class InvoiceSummary {
    private final int numOfRide;
    private final double totalFare;
    private final double averageFare;

    public InvoiceSummary(int numOfRide, double totalFare) {
        this.numOfRide = numOfRide;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numOfRide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRide == that.numOfRide && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.averageFare, averageFare) == 0;
    }
}
