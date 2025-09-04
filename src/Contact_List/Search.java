package Contact_List;

import java.util.ArrayList;

public class Search {
	public static void searchByNID(ArrayList<Contacts> contact, String nid) {
		boolean found = false;
		for(int i = 0; i < contact.size(); i++) {
			if(contact.get(i).getNID().equals(nid)) {
				System.out.println(contact.get(i).getName() + "\t" + contact.get(i).getPHN()+ "\n");
				found = true;
			}
		}
		if(found == false) {
			System.out.println("Not Found!");
		}
	}
	
	public static void searchByOperator(ArrayList<Contacts> contact, String searchop) {
		boolean found = false;
		for(int i = 0; i < contact.size(); i++) {
			if(contact.get(i).getOP().equals(searchop)) {
				System.out.println(contact.get(i).getName() + "\t" + contact.get(i).getNID() + "\t" + contact.get(i).getPHN()+ "\t" + contact.get(i).getOP() + "\n");
				found = true;
			}
		}
		if(found == false) {
			System.out.println("Not Found!");
		}
	}
	
	public static void searchByNumber(ArrayList<Contacts> contact, String sbnumber) {
		boolean found = false;
		for(int i = 0; i < contact.size(); i++) {
			if(contact.get(i).getPHN().contains(sbnumber)) {
				System.out.println(contact.get(i).getPHN());
				found = true;
			}
		}
		if(found == false) {
			System.out.println("Not Found!");
		}
	}
	
	
}
