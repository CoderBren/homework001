package homework1;
public class ParkingTester {          
    public static void main(String[] args){
    ParkingLot lot = new ParkingLot();
    System.out.println(lot.toString());

    // Instantiate InfinitiA
    Car InfinitiA = new Car("A", "Infiniti", true);

    // Park Infiniti A in handicap spot 
    lot.spots[0].parkedCar = InfinitiA;
    System.out.println(lot.toString());

    // Instantiate CadiliacB
    Car CadiliacB = new Car("B", "Cadiliac", false);

    // Park Cadiliac B in standard spot 
    lot.spots[4].parkedCar = CadiliacB;
    System.out.println(lot.toString());

     // Remove Infiniti A from handicap spot 
     lot.spots[0].parkedCar = null;
     System.out.println(lot.toString());

}}
