package garage;

public class Slot {
    private int id;
    private int width;
    private int lenth;
    private boolean stat;
    public Slot(){
        id=0;
        width=0;
        lenth=0;
        stat=true;

    }
    public void set_id(int i){
        id=i;
    }
    public void set_width(int w){
        width=w;
    }
    public void set_lenth(int d){
        lenth=d;
    }
    public void SetStatus(boolean s){
        stat=s;
    }
    public int get_id(){
        return id;
    }
    public int get_width(){
        return width;
    }
    public int get_lenth(){
        return lenth;
    }
    public boolean getStatus(){
        return stat;
    }

}
