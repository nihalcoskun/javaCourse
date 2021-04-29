package homework3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " updated.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted.");
	}
	
	public void updateImage(User user) {
       System.out.println("Your profile has been successfully updated");
	}
	
	public void addDescription(User user) {
		System.out.println("Your profile has been successfully updated ");
	}
}