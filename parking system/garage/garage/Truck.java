package garage;

public class Truck implements Vehicle {

    private String m_name;
    private int v_ID;
    private int modelYear;
    private int Vlenth;
    private int Vwidth;

    public Truck(String m_n,int id,int m_y,int l,int w) {
        v_ID=id;
        modelYear=m_y;
        m_name=m_n;
        Vlenth=l;
        Vwidth=w;
    }

    @Override
    public String getM_name() {
        return m_name;
    }
    @Override
    public int getmodelyear() {
        return modelYear;
    }
    @Override
    public int get_ID(){
        return v_ID;
    }
    @Override
    public int get_Vwidth(){
        return Vwidth;
    }
    public int get_Vlenth(){
        return Vlenth;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.Truck;
    }

}
