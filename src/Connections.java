import java.sql.*;
import java.util.ArrayList;

public class Connections {
	
	public static void main(String[] args) throws SQLException{
		
		Connection cn;  //Connessione al DB
		Statement st;  //Permette di costruire le Query
		ResultSet rs;  //Consente di avere il risultato della Query
		String sql;    //Stringa contenente il codice
		
		ArrayList ls = new ArrayList();
		
		//Connessione
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch(ClassNotFoundException e) {
			
			System.out.println("ClassNotFoundException: ");
			System.err.println(e.getMessage());
			
		} //fine try/catch
		
		//Creo la connessione al DB
		
		cn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/aaa?user=root"); //aaa è il nome del DB
		
		sql = "SELECT * FROM utenti";
		
		//QUERY
		
		try {
			st=cn.createStatement(); //creo statement su connessione
			
			rs = st.executeQuery(sql); //faccio la query su uno statement
			
			while(rs.next() == true) {
				
				Utente user = new Utente (rs.getInt("idUtente"),rs.getString("username"),rs.getString("password"),rs.getString("email"));
				ls.add(user);
				
			}
			
		} catch(SQLException e) {
			
			System.out.println("errore:" + e.getMessage());
			
		}
		
		ControllerUtente ctrl = new ControllerUtente (ls);
		
		
		for(int i=0; i<ls.size(); i++) {
			
			System.out.println("ID: " + ctrl.getIde(ls, i) + "\tUsername: " + ctrl.getUsername(ls, i) + "\tEmail: " + ctrl.getEmail(ls, i));
		}
		
		String newname = "sia";
		
		try {
			st=cn.createStatement(); //creo statement su connessione
			
			//modifico username di sia
			
			
			sql = "UPDATE utenti SET username = '" + newname + "' WHERE idUtente = 2";
			rs = st.executeQuery(sql); //faccio la query su uno statement
				
			System.out.println("Modifca effettuata;");
				
			
			
		} catch(SQLException e) {
			
			System.out.println("errore:" + e.getMessage());
			
		}
		
		for(int i=0; i<ls.size(); i++) {
			
			System.out.println("ID: " + ctrl.getIde(ls, i) + "\tUsername: " + ctrl.getUsername(ls, i) + "\tEmail: " + ctrl.getEmail(ls, i));
		} 
		
		Utente newUser = new Utente(ls.size(), "dino","dino","dino@dino.dino");
		
		int flag = 0;
		for (int i=0;i<ls.size();i++) {
			
			if(newUser.getUsername().equals(ctrl.getUsername(ls, i))) {
				
				flag = 1;
			}
		}
		
		System.out.println("\n"+flag+"\n");
		
		if(flag == 0) {
		
			try {
			
				st = cn.createStatement();
			
				//aggiungo un'altra persona
					
				sql = "INSERT INTO utenti (idUtente,email,password,username) VALUES ('"+newUser.getId()+"','"+newUser.getEmail()+"','"+newUser.getPassword()+"','"+newUser.getUsername()+"')";
				rs=st.executeQuery(sql);
				System.out.println("Inserimento effettuato;");
			
				}catch(SQLException e){
			
				System.out.println("Errore: " + e.getMessage());
			}
		}else {
			System.out.println("Errore: Nome utente già inserito.");
		}
		
		cn.close();
		
	}

}
