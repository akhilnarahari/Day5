/**
 * Created by narahara on 7/10/2017.
 */
import java.io.Serializable;
import java.util.List;

public class VehicleInfo implements Serializable{
    String regno;
    String modelno;
    Address addr;
    VehicleInfo(String regno,String modelno,Address addr){
        this.regno=regno;
        this.modelno=modelno;
        this.addr=addr;
    }

    void printVehicleInfo()
    {
        System.out.println("VehicleInfo details Test:"+regno+" "+modelno+" "+addr);
    }

    public String toString()
    {
        return "regno="+regno+", modelno="+modelno;
    }
}
class Address implements Serializable{
    String street;
    String city;
    int pincode;
    Address(String street,String city,int pincode){
        this.street=street;
        this.city=city;
        this.pincode=pincode;

    }
}
class VehicleInfoArray implements Serializable{
    VehicleInfo v[];

    VehicleInfoArray(VehicleInfo v[]){
        this.v=v;
    }
}
class VehicleInfoList implements Serializable{
        List lst;
        VehicleInfoList(List lst)
        {
        this.lst = lst;
        }
}
