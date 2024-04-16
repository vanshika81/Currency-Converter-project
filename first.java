class Pen{
string color;

public void write()
{
    System.out.println("writing");
}
}
public class OOPS{
    public static void main(string args[])
    {
        Pen pen1=new Pen();
        pen1.color="red";
        pen1.write();
    }
}