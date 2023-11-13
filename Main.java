import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Route r1=new Route("Street1","Start2",40);
        Route r2=new Route("Street3","Start4",60);
        Car c1=new Car(111,r1,0);
        Car c2=new Car(222,r2,10);
        ArrayList<Passenger> p=new ArrayList<Passenger>();
SubscribersPassengers s1=new SubscribersPassengers("roaa","112233");
NonSubscriberspassengers s2=new NonSubscriberspassengers("ali","445566");

        p.add(s1);
        p.add(s2);

try{
s1.rCar(c1);
s2.rCar(c2);
    for (int i = 0; i < p.size();i++)
    {
        p.get(i).displayInfo();

    }

}
catch (Exception e){
    System.out.println(e.getMessage());
}

    }
}