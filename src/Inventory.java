import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Inventory {
	
		static ArrayList<Item> items;
	
	 	Item item1 = new Item("MILO", 10, 4.5);
	   
	    Item item2 = new Item("TELUR", 30, 10);
	   
	    Item item3 = new Item("KEROPOK", 12, 3);
	    
	    boolean displayerror1 = false;
		boolean displayerror2 = false;

	    
	  
	  public Inventory() {
	    items = new ArrayList<Item>();
	    items.add(item1);
	    items.add(item2);
	    items.add(item3);

	  }

	  public void addItem(Item item) {
		  if(!item.getName().isBlank() && item.getQuantity() > 0 && item.getPrice() > 0 ) {
			  items.add(item);
			  
			  JOptionPane.showMessageDialog(null, "ADD ITEM SUCCESFUL", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
			  
		  }else {
			  JOptionPane.showMessageDialog(null, "PLEASE PUT THE APPROPIRATE VALUE", "INFORMATION", JOptionPane.ERROR_MESSAGE); 
		  }
	  }
	  
	  public void removeItem(String name) {
	    for (int i = 0; i < items.size(); i++) {
	      if (items.get(i).getName().equals(name)) {
	        items.remove(i);
	        
	        displayerror1 = false;
	        	        
			JOptionPane.showMessageDialog(null, "REMOVE ITEM SUCCESFUL", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
	        break;
	        
	      }else {
	    	  displayerror1 = true;
	      }
	    }
	    
	    displayError(displayerror1, displayerror2);
	    
	  }

	  public void updateItem(String name, int quantity, double price) {
	    for (Item item : items) {
	      if (item.getName().equals(name) && quantity >0 && price > 0) {
	        item.setQuantity(quantity);
	        item.setPrice(price);
	        
	        displayerror2 = false;
	        
	        JOptionPane.showMessageDialog(null, "UPDATE SUCCESFUL", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
	        break;
	        
	      }else {
	    	  displayerror2 = true;
	      }
	    }
	    
	    displayError(displayerror1, displayerror2);
	    
	  }

	  public void displayInventory() {
		  
	    System.out.println("Name\t\tQuantity\tPrice");
	    for (Item item : items) {
	     System.out.println(item.getName() + "\t\t" + item.getQuantity() + "\t\tRM " + item.getPrice());
	    }
	  }	
	  
	  public void displayError( boolean displayerr1 , boolean displayerr2) {
		  
		  if(displayerr1 == true) {
			  JOptionPane.showMessageDialog(null, "REMOVE FAIL \n THE PRODUCT ISN'T ON THE DATABASE", "INFORMATION", JOptionPane.ERROR_MESSAGE);
			  displayerror1 = false;
		  }
		  
		  if(displayerr2 == true) {
			  JOptionPane.showMessageDialog(null, "UPDATE FAIL \n THE PRODUCT ISN'T ON THE DATABASE", "INFORMATION", JOptionPane.ERROR_MESSAGE);
			  displayerror2 = false;
		  }
	  }
}
