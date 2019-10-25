
public class Utente {
	
	private int id;
	private String username;
	private String password;
	private String email;
	
	
	
	public Utente(int num, String usname, String pass, String mail) {
		
		this.id = num;
		this.username = usname;
		this.password = pass;
		this.email = mail;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
