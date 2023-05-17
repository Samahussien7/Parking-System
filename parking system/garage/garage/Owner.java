package garage;
import java.util.ArrayList;
import java.util.List;

public class Owner {
	private String Email;
	private String Pass;
	private List<Slot> list=new ArrayList<Slot>();

	
	 public void DisplayAvailableSlot(GarageMangement ob){
		int count=0;
		list=ob.getSlotslist();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getStatus()==true){
				count++;

				System.out.println("the Available Slots id is"+list.get(i).get_id());
				System.out.println(" length is"+list.get(i).get_lenth());
				System.out.println("width is"+list.get(i).get_width());
			}

		}
		if(count==0){System.out.println("Error no Available slots");}

		 
	 }
	
}
