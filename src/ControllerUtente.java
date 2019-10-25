import java.util.ArrayList;

public class ControllerUtente {
	
	ArrayList list = new ArrayList();
	
	public ControllerUtente(ArrayList ls) {
		
		this.list = ls;
		
	}

	public ArrayList getList() {
		return list;
	}
	
	public Utente getUser(ArrayList list, int i) {
		
		return (Utente) list.get(i);
	}
	
	public int getIde(ArrayList list, int i) {
		
		return  getUser(list, i).getId() ;
	}
	
	public String getUsername(ArrayList list, int i) {
		
		return getUser(list,i).getUsername();
	}
	
	public String getPassword(ArrayList list,int i) {
		
		return getUser(list,i).getPassword();
	}
	
	public String getEmail(ArrayList list, int i) {
		
		return getUser(list,i).getEmail();
	}
	
	public void setId(ArrayList list, int i, int num) {
		
		getUser(list,i).setId(num);
	}
	
	public void setUsername(ArrayList list, int i, String name) {
		
		getUser(list,i).setUsername(name);
	}
	
	public void setPassword(ArrayList list, int i, String pass) {
		
		getUser(list,i).setPassword(pass);
	}
	
	public void getEmail(ArrayList list, int i, String mail) {
		
		getUser(list,i).setEmail(mail);
	}

	
}
