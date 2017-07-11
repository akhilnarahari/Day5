/**
 * Created by narahara on 7/10/2017.
 */

/**
 * Created by narahara on 7/10/2017.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo
{

    public static void main(String[] args)
    {
        try
        {
//Serialization starts here
            StudentInfo si = new StudentInfo("testpurpose", 318);

            //.ser is a standard file extension, to store serialized object
            FileOutputStream fos = new FileOutputStream("student.ser");

            //instead of writing object stream to a file, it is also possible to send object thru
            //Network using socket programming
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            System.out.println("Serialing the object...");
            oos.writeObject(si);
            oos.close();
            fos.close();
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }
}
