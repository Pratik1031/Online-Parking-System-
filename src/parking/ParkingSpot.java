package parking;

public class ParkingSpot {
	 private int spotNumber;
	    private boolean isAvailable;

	    public ParkingSpot(int spotNumber) {
	        this.spotNumber = spotNumber;
	        this.isAvailable = true;
	    }

	    public int getSpotNumber() {
	        return spotNumber;
	    }

	    public void setSpotNumber(int spotNumber) {
	        this.spotNumber = spotNumber;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }
}
