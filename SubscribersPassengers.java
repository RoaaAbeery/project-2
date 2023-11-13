public class SubscribersPassengers extends Passenger{

    public SubscribersPassengers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void rCar(Car car) throws Exception{
        if (car.getMaxCap()==0){
            throw new Exception("Cannot reserve a car with zero capacity.");
        }

        setTripCost(car.getFixedRoute().getTripPrice()/2);
    }

    @Override
    public void displayInfo() {
        System.out.println("code "+ getReservedCar().getCode());
        System.out.println("price"+ getReservedCar().getFixedRoute().getTripPrice());
        System.out.println("cost"+getTripCost());
    }
}
