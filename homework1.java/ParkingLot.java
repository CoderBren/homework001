package homework1;
// Brendon Price        Homework 1 

public class ParkingLot {
    public ParkingSpot[] spots;
                                                                    // square brackets for an array
    

    public ParkingLot(){                                                // New constructor
        this.spots = new ParkingSpot[10];                              // take a class name and bring one of those classes into existence - make an array with 10 parking spots 
        for (int i = 0; i < 10; i++){                                  // For i in range (10)
            if (i <= 1){
                spots[i] = new ParkingSpot(true);
            }                                                               // create a loop to substantiate 
            else{
                this.spots[i] = new ParkingSpot(false);                                                               // arrays are objects
}}}


// implement method meaning implement a function 
// using a tool called tostring allows you to print an object

public String toString(){

int standardSpots = 0;
int handicapSpots = 0;

for (int i = 0; i < spots.length; i++) {
    
    ParkingSpot spot = spots[i];
    if (spot.parkedCar == null){
        if (spot.handicap){
            handicapSpots++ ;}
        else{
            standardSpots++ ; 
        
        
}}}
    
return handicapSpots + " " + standardSpots;




    }
        }

