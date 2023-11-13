public class NonSubscriberspassengers extends Passenger{

    public NonSubscriberspassengers(String name, String ID) {
        super(name, ID);

    }

    private boolean discount;
    @Override
    public void rCar(Car car) throws Exception{
        if (car.getMaxCap()==0){
            throw new Exception("Cannot reserve a car with zero capacity.");
        }
  if(discount=true)
        {
setTripCost(car.getFixedRoute().getTripPrice()-(car.getFixedRoute().getTripPrice()*0.1));
  }
else{
    setTripCost(car.getFixedRoute().getTripPrice());
  }}

    @Override
    public void displayInfo() {
        System.out.println("code "+ getReservedCar().getCode());
        System.out.println("price"+ getReservedCar().getFixedRoute().getTripPrice());
        System.out.println("cost"+getTripCost());
    }
}
