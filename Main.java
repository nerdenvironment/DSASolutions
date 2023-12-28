import Folder1.*;
import Folder1.Folder2.*;
import JAVA2.Program3;
import java.lang.System;

public class Main extends Program4{
    public static void main(String[] args) {
       Program3 obj = new Program3();
       obj.SetRollNo(10);
       System.out.println(obj.GetRollNo() + "");
       Program4 obj2 = new Program4();
       obj2.PrintName();
    }
    
}
