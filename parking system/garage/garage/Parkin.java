package garage;
import java.time.LocalTime;
public class Parkin {
	  private  LocalTime arrivalTime;
	  private static int numOfV=0;
	  public Parkin(){
		  numOfV++;
	  }
	  public LocalTime markArrival()
	    {
	        arrivalTime = LocalTime.now();
	        return arrivalTime;
	    }
	public static int getNumV(){
		return numOfV;
	}

}
