public class Route {
    private String startAddress;
    private  String distinationAddress;
    private double tripPrice;

    public Route(String startAddress, String distinationAddress, double tripPrice) {
        this.startAddress = startAddress;
        this.distinationAddress = distinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDistinationAddress() {
        return distinationAddress;
    }

    public void setDistinationAddress(String distinationAddress) {
        this.distinationAddress = distinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
