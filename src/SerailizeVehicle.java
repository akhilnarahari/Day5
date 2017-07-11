/**
 * Created by narahara on 7/10/2017.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerailizeVehicle {
    public static void main(String args[]) {
        try {
            VehicleInfo v1, v2, v3;
            v1 = new VehicleInfo("167576sh", "jhas268",new  Address("abc", "acbd", 8297979));
            v2 = new VehicleInfo("167h", "js268",new  Address("abssc", "askjw", 829227979));
            v3 = new VehicleInfo("167576", "jhas26",new  Address("abcw", "acbwd", 829719));
            List l=new ArrayList();
            l.add(v1);
            l.add(v2);
            l.add(v3);

        }
        catch(Exception e){
            System.out.println("exception occurred");

        }
    }
}
