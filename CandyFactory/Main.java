package CandyFactory;

/*
 A task to make candy factory. There
 were specific instructions how to make it
 but I lost them somewhere.
*/
public class Main
{
    public static void main(String[] args)
    {
        Container c = new Container(3);
        Container c1 = new Container(1);
        Warehouse warehouse = new Warehouse();

        warehouse.addContainer(c);
        warehouse.addContainer(c1);
        warehouse.show();
        warehouse.deleteContainer();
        warehouse.show();
    }
}

/* output:

3.0
1.0

 */