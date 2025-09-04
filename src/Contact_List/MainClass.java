package Contact_List;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	public static String opr(String number) {
		String op = null;
		if(number.startsWith("0911") || number.startsWith("0912") || number.startsWith("0913") || number.startsWith("0914")
				|| number.startsWith("0915") ||number.startsWith("0916") || number.startsWith("0917") || number.startsWith("0918")
				|| number.startsWith("0919") || number.startsWith("0990") || number.startsWith("0991") || number.startsWith("0992")
				|| number.startsWith("0993") || number.startsWith("0994") || number.startsWith("0996")|| number.startsWith("0910")){
			op = "IRMC";
		}else if(number.startsWith("0930") || number.startsWith("0931") || number.startsWith("0932") || number.startsWith("0933")
				|| number.startsWith("0934") ||number.startsWith("0935") || number.startsWith("0936") || number.startsWith("0937")
				|| number.startsWith("0938") || number.startsWith("0939") || number.startsWith("0900") || number.startsWith("0901")
				|| number.startsWith("0902") || number.startsWith("0903") || number.startsWith("0904") || number.startsWith("0905")) {
			op = "IRANCELL";
		}else if(number.startsWith("0920")|| number.startsWith("0921") || number.startsWith("0922") || number.startsWith("0923")) {
			op = "RIGHTEL";
		}
		return op;
	}
	
	public static void show(ArrayList<Contacts> contact) {
		sortByName(contact);
		for(int i = 0; i < contact.size(); i++) {
			System.out.println(contact.get(i).getName() + "\t" + contact.get(i).getNID() + "\t" + contact.get(i).getPHN()+ "\t" + contact.get(i).getOP() + "\n");
		}
	}
	
	public static void sortByName(ArrayList<Contacts> contact) {
		int n = contact.size();
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(contact.get(j).getName().compareToIgnoreCase(contact.get(j + 1).getName())>0) {
					Contacts temp = contact.get(j);
					contact.set(j, contact.get(j + 1));
	                contact.set(j + 1, temp);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Contacts> contact = new ArrayList<>();
		
		boolean flag = true;
		while(flag != false) {
			System.out.println("Choose your operate: \"add\" \"sbnid\" \"sbop\" \"sbn\" \"show\" \"exit\" ");
			String operate = input.nextLine().toLowerCase();
			switch (operate) {
			case "add":
				System.out.println("Enter Contact Name");
				String name = input.nextLine();
				System.out.println("Enter National ID");
				String ID = input.nextLine();
				System.out.println("Enter Phone Number");
				String number = input.nextLine();
				
				boolean exist = false;
				
				if(!name.isEmpty() && !ID.isEmpty() && !number.isEmpty() && opr(number) != null) {
					for(int i = 0; i < contact.size(); i++) {
						if(contact.get(i).getPHN().equals(number)) {
							exist = true;
							break;
						}
					}
					if(exist == false) {
						contact.add(new Contacts(name, ID, number, opr(number)));
					}else {
						System.out.println("This number is already exist!");
					}
				}else if(opr(number) == null){
					System.out.println("this number cant submit");
				}
				break;
			case "sbnid":
				System.out.println("Enter National ID");
				String nid = input.nextLine();
				Search.searchByNID(contact, nid);
				break;
			case "sbop":
				System.out.println("Enter Operator \nIRANCELL , IRMC , RIGHTEL");
				String searchop = input.nextLine().toUpperCase();
				Search.searchByOperator(contact, searchop);
				break;
			case "sbn":
				System.out.println("Enter 4 digits");
				String sbnumber = input.nextLine();
				Search.searchByNumber(contact, sbnumber);
				break;
			case "show":
				show(contact);
				break;
			case "exit":
				flag = false;
				break;
			default:
				System.out.println("Enter \"add\" \"sbnid\" \"sbop\" \"sbn\" \"show\" \"exit\"!!!");
				break;
			}
			
		}
		if(flag == false) {
			System.out.println("Program Closed");
			
		}
		
	}

}
