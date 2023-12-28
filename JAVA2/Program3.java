package JAVA2;

public class Program3 {

    protected int rollno;

    public int GetRollNo(){
        return this.rollno;
    }

    public void SetRollNo(int rollno){
        this.rollno = rollno;
    }

    public void PrintName(){
        System.out.println("Hello From Parent class");
    }
}
