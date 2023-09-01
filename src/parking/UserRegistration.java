package parking;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	 public String name;
	    private String email;
	    private String password;

	    public long phnno;

	    public String carno;


	    private List<Integer> bookedSpots;

	    public UserRegistration(String name, String email, String password)
	    {
	        this.name = name;
	        this.email = email;
	        this.password = password;
	        this.bookedSpots = new ArrayList<>();
	        System.out.println("User Registered Succesfully !");
	    }

	    public UserRegistration(String name, String email, String password, long phnno, String carno, List<Integer> bookedSpots) {
	        this.name = name;
	        this.email = email;
	        this.password = password;
	        this.phnno = phnno;
	        this.carno = carno;
	        this.bookedSpots = bookedSpots;
	        System.out.println("Fully Registerd User !");
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public List<Integer> getBookedSpots() {
	        return bookedSpots;
	    }

	    public long getPhnno() {
	        return phnno;
	    }

	    public void setPhnno(long phnno) {
	        this.phnno = phnno;
	    }

	    public String getCarno() {
	        return carno;
	    }

	    public void setCarno(String carno) {
	        this.carno = carno;
	    }

	    public void addBookedSpot(int spotNumber) {
	        bookedSpots.add(spotNumber);
	    }

	    public void removeBookedSpot(int spotNumber) {
	        bookedSpots.remove(Integer.valueOf(spotNumber));
	    }
}
