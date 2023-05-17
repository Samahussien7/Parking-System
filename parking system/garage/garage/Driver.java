package garage;

public class Driver {
	private String Name;
	private int Phone;
	 public void enter_info(String name,int phone){
	        this.Name=name;
	        this.Phone=phone;
	    }
	
	   public void VehicleInfo(int type,String n,int i,int m,int l,int w){
	     if(type==1){
            Car objveh = new Car(n, i, m, l, w);
          
        } else if (type ==2) {
            Motorcycle objveh = new Motorcycle(n, i, m, l, w);
           
        } else if (type ==3) {
            Truck objveh = new Truck(n, i, m, l, w);
            
        }


	    }


}
