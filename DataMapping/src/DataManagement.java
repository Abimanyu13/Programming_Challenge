import java.util.ArrayList;
import java.util.List;

public class DataManagement {

	static List<Information> data = new ArrayList<Information>();
	public static void main(String[] args){
		populateData();
		printData();
	}

	private static void populateData() {
		Information info1 = new Information(1,"Samwise Gamgee","+1-202-555-0188", "No.1., Frodo Avenue., Shire");
		Information info2 = new Information(2,"HarryPotter","+1-202-555-2188", "No.4., Privet Drive., Little Winging., Surrey");
		data.add(info1);
		data.add(info2);
	}
	
	private static void printData() {
		for(Information info : data){
			System.out.println(info.toString());
		}
		
	}
	
	
	
}
