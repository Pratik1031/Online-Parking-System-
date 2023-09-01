package parking;

import java.util.List;
import java.util.Scanner;

public class OnlineParkingSystemMain 
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        ParkingSystem parkingSystem = new ParkingSystem();
        System.out.println("Enter Available Parking Spot");
        int avlSpot=scanner.nextInt();

        
       for (int i = 1; i <= avlSpot; i++) 
       {
    	   parkingSystem.addParkingSpot(new ParkingSpot(i));
    	   
    	   
	   }

        System.out.println("Enter a 1st user ");
        System.out.println("Entere a User Name : ");
        String nameU=scanner.nextLine();
        System.out.println("entere a Email :");
        String emailU=scanner.nextLine();
        System.out.println("entere  a password ");
        String passU=scanner.nextLine();        
        UserRegistration user1 = new UserRegistration(nameU, emailU, passU);
        System.out.println("Enter a 2nd user ");
        System.out.println("Entere a User Name : ");
        String nameU_2=scanner.nextLine();
        System.out.println("entere a Email :");
        String emailU_2=scanner.nextLine();
        System.out.println("entere  a password ");
        String passU_2=scanner.nextLine();        
        UserRegistration user2 = new UserRegistration(nameU_2, emailU_2,passU_2);

        
        parkingSystem.addUser(user1);
        parkingSystem.addUser(user2);


        List<ParkingSpot> availableSpots = parkingSystem.searchAvailableSpots();
        System.out.println("Available Parking Spots:");
        for (ParkingSpot spot : availableSpots) {
            System.out.println("Spot Number: " + spot.getSpotNumber());
        }
     
        int spotToBook = 1;
        boolean isBooked = parkingSystem.bookSpot(user1, spotToBook);
        if (isBooked) {
            System.out.println(user1.getName()+" booked spot " + spotToBook);
        } else {
            System.out.println("Spot " + spotToBook + " is not available for booking");
        }

       
        spotToBook = 2;
        isBooked = parkingSystem.bookSpot(user2, spotToBook);
        if (isBooked) {
            System.out.println(user2.getName()+" booked spot " + spotToBook);
        } else {
            System.out.println("Spot " + spotToBook + " is not available for booking");
        }

        
        parkingSystem.cancelBooking(user1, 1);
        System.out.println(user1.getName()+" canceled their booking for spot 1");

       
        availableSpots = parkingSystem.searchAvailableSpots();
        System.out.println("Available Parking Spots:");
        for (ParkingSpot spot : availableSpots) {
            System.out.println("Spot Number: " + spot.getSpotNumber());
        }
    }
}
