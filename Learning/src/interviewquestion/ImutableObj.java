package interviewquestion;

public class ImutableObj {

	public static void main(String...strings){
		User user = new User(10);
		
		UseMut mut = new UseMut(user);
		mut.getUser().setId(1);
		
		System.out.println(mut.getUser().use.getId());
		
	}
	
	
}



final class UseMut{
	
	private User use;
	
	UseMut(User use)
	{
		this.use = use;
	}
	
	public User getUser() {
		return new User(use);
	}
	
}



class User {

	private int id;

	User use;
	
	public User(int id) {
		
		this.id= id;
	}	
	
	public User(User use) {
		this.use = use;
	}
	
	
	
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
