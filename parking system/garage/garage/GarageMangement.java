package garage;
import java.util.*;
import java.util.Scanner;
public class GarageMangement {
    private int numofSlots;
    private int sID;

    private final List<Slot> Slotslist=new ArrayList<Slot>();

    public void setNumOfSlots(int num){
        numofSlots=num;
    }
    public int getNumofSlots(){
        return numofSlots;
    }
    public void enterDetails(){
        for(int i=0;i<numofSlots;i++) {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter id of the slot"+(i+1));
            int ID = obj.nextInt();
            System.out.println("Enter width of the slot"+(i+1));
            int wid = obj.nextInt();
            System.out.println("Enter lenth of the slot"+(i+1));
            int len = obj.nextInt();
            Slot s=new Slot();
            s.set_id(ID);
            s.set_lenth(len);
            s.set_width(wid);
            s.SetStatus(true);
            Slotslist.add(s);

        }

    }

    public List<Slot> getSlotslist() {
        return Slotslist;
    }
    public boolean availableSlots(){
        boolean flag=false;

        for (int i=0;i<Slotslist.size();i++) {
            if (Slotslist.get(i).getStatus()){
                flag=true;
                break;
            }

        }
        return flag;

    }
    Owner objO= new Owner();
    public  int getii(){
        return sID;
    }

    public int pickSuitable(Vehicle v,int con){
        int ii=-1;
        if(availableSlots()) {
            int idd = 0;
            if (con == 1) {
                idd = firstServe(v);
            } else if (con == 2) {
                idd = fitSlot(v);

            }
            sID=idd;
            ii=idd;
        }
        else if(!availableSlots()){System.out.println("Error no slots available");}

        return ii;
    }
    public int firstServe(Vehicle vehicle){

        int idSlot=0;
        for(int i=0;i<Slotslist.size();i++){
            if(Slotslist.get(i).get_width()>=vehicle.get_Vwidth() && Slotslist.get(i).get_lenth()>=vehicle.get_Vlenth()
            && Slotslist.get(i).getStatus()){
                idSlot=Slotslist.get(i).get_id();
                Slotslist.get(i).SetStatus(false);
                break;
            }
        }
        return idSlot;
    }
    public int fitSlot(Vehicle vehicle){
        int idSlot=0;
        for(int i=0;i<Slotslist.size();i++){
            if(Slotslist.get(i).get_width()==vehicle.get_Vwidth() && Slotslist.get(i).get_lenth()==vehicle.get_Vlenth()
                    && Slotslist.get(i).getStatus()){
                idSlot=Slotslist.get(i).get_id();
                Slotslist.get(i).SetStatus(false);
                break;
            }


        }
        return idSlot;


    }

}
