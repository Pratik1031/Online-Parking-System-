package parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSystem 
{
	 private List<ParkingSpot> parkingSpots;
	    private Map<String, UserRegistration> users;

	    public ParkingSystem() {
	        this.parkingSpots = new ArrayList<>();
	        this.users = new HashMap<>();
	    }

	    public void addUser(UserRegistration user) {
	        users.put(user.getEmail(), user);
	    }

	    public void addParkingSpot(ParkingSpot spot) {
	        parkingSpots.add(spot);
	    }

	    public List<ParkingSpot> searchAvailableSpots() {
	        List<ParkingSpot> availableSpots = new ArrayList<>();
	        for (ParkingSpot spot : parkingSpots) {
	            if (spot.isAvailable()) {
	                availableSpots.add(spot);
	            }
	        }
	        return availableSpots;
	    }

	    public boolean bookSpot(UserRegistration user, int spotNumber) {
	        for (ParkingSpot spot : parkingSpots) {
	            if (spot.getSpotNumber() == spotNumber && spot.isAvailable()) {
	                spot.setAvailable(false);
	                user.addBookedSpot(spotNumber);
	                return true;
	            }
	        }
	        return false;
	    }

	    public void cancelBooking(UserRegistration user, int spotNumber) {
	        for (ParkingSpot spot : parkingSpots) {
	            if (spot.getSpotNumber() == spotNumber && !spot.isAvailable()) {
	                spot.setAvailable(true);
	                user.removeBookedSpot(spotNumber);
	                break;
	            }
	        }
	    }
}
