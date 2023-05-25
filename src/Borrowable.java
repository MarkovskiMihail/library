
public interface Borrowable {
	
	public void borrowItem() throws AvailabilityExceprion;
	public void returnItem() throws AvailabilityExceprion;
	public boolean isAvailable();
	public int getId();
}
