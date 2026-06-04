import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login {
	
	
	 static ArrayList<Admin> admins = new ArrayList<>();
	 static ArrayList<Staff> staffs = new ArrayList<>();
	 
	 Admin admin1 = new Admin("admin", "password");
	
	 boolean displayerror1 = false;
	 boolean displayerror2 = false;
	 
	 public Login() {
		    admins = new ArrayList<Admin>();
		    staffs = new ArrayList<Staff>();
		    admins.add(admin1);
	
		  }
	 
	 public void add(Staff staff) {
		  
			 if(!staff.username.isBlank() && !staff.password.isBlank()) {
				 staffs.add(staff);
				 
				 JOptionPane.showMessageDialog(null, "ADD STAFF SUCCESSFUL", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); 
			 }
			 else {
				  JOptionPane.showMessageDialog(null, "PLEASE FILL IN THE INFORMATION NEEDED", "INFORMATION", JOptionPane.ERROR_MESSAGE);
		  }
	 }

	  public void uselogin(String user, String pass)  {
	
	    
	    String username = user;
	    String password = pass;
	    
	    int loginSuccess = login(username, password);
	    
	    if (loginSuccess == 1) {
	    	JOptionPane.showMessageDialog(null, "LOGIN SUCCESFUL", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
	    	
	    	MainGUI frame2 = new MainGUI();
	    	
			frame2.show();
			
	    }
	    else if(loginSuccess == 2) {
	    	JOptionPane.showMessageDialog(null, "LOGIN SUCCESFUL", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
	    	
	    	MainStaffGUI2 frame3 = new MainStaffGUI2();
	    	
			frame3.show();
	    }
	    else {
	    	
	    	JOptionPane.showMessageDialog(null, "LOGIN UNSUCCESFUL", "LOGIN", JOptionPane.ERROR_MESSAGE);
	      }
	    }
	    
	    static int login(String username, String password) {
	        for (Admin user : admins) {
	          if (user.username.equals(username) && user.password.equals(password)) {
	            return 1;
	          }
	        }
	        for(Staff staff: staffs) {
	        	if (staff.username.equals(username) && staff.password.equals(password)) {
	 	            return 2;
	 	        }
	        }
	        return 0;
	      }
	    
	    public void displaylogin() {
			  
		    System.out.println("USERNAME\t\tPASSWORD");
		    for (Admin user : admins) {
		     System.out.println(user.getUsername() + "\t\t\t" + user.getPassword());
		    }
		    
		    for (Staff staff : staffs) {
			     System.out.println(staff.getUsername() + "\t\t\t" + staff.getPassword());
			    }
		  }
	    
	    public void removeLogin(String username) {
		    for (int i = 0; i < staffs.size(); i++) {
		      if (staffs.get(i).getUsername().equals(username)) {
		        staffs.remove(i);
		        displayerror1 = false;
		        	        
				JOptionPane.showMessageDialog(null, "REMOVE STAFF SUCCESFUL", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
		        break;
		        
		      }else {
		    	  displayerror1 = true;
		      }
		    }
		    
		    displayError();
		    
		  }
	    
	    public void updateLogin(String username, String password) {
		    for (Staff staff : staffs) {
		      if (staff.getUsername().equals(username) && !password.isBlank()) {
		    	  
		        staff.setPassword(password);
		        displayerror2 = false;
		        
		        JOptionPane.showMessageDialog(null, "UPDATE STAFF SUCCESFUL", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
		        break;
		        
		      }else {
		    	  displayerror2 = true;
		      }
		    }
		    
		    displayError();
		    
		  }
	    
	    public void displayError() {
			  
			  if(displayerror1 == true) {
				  JOptionPane.showMessageDialog(null, "REMOVE FAIL \n THE USERNAME ISN'T ON THE DATABASE", "INFORMATION", JOptionPane.ERROR_MESSAGE);
				  displayerror1 = false;
			  }
			  
			  if(displayerror2 == true) {
				  JOptionPane.showMessageDialog(null, "UPDATE FAIL \n THE USERNAME ISN'T ON THE DATABASE", "INFORMATION", JOptionPane.ERROR_MESSAGE);
				  displayerror2 = false;
			  }
		  }
}


