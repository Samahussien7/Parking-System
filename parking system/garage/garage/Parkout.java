package garage;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
public class Parkout {
	private LocalTime departureTime;
    private  LocalTime arrival;
	private  List<Slot> Slist=new ArrayList<Slot>();


  static long totalIncome=0;

	  public LocalTime markDepature(GarageMangement ob)
	    {
			Slist=ob.getSlotslist();
			int ID=ob.getii();
			for(int i=0;i<Slist.size();i++){
				if(Slist.get(i).get_id()==ID){
					Slist.get(i).SetStatus(true);
				}
			}
	        departureTime = LocalTime.now();
	        return departureTime;
	    }
	  public long calFees(Parkin obj)
	    {

		  arrival=obj.markArrival();
	        Duration durationTime= Duration.between(departureTime, arrival);
	        long fees=durationTime.toHours();
	       fees =fees*5;
	       totalIncome+=fees;
	        return fees;
	    }
	public static long getTIncome(){
		return totalIncome;
	}
	

}
