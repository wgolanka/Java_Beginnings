package CandyFactory;

/*
 A task to make candy factory. There
 were specific instructions how to make it
 but I lost them somewhere.
*/
public class Warehouse
{
    Element head = null;
    int size;

    int limit = 5;

    public void addContainer(Container container)
    {
        if(size == limit)
        {
            System.out.println("Magazine is full");
            return;
        }
        if(head == null)
        {
            head = new Element(container);
        }
        else
        {
            Element tmp = head;
            while(tmp.next != null)
            {
                tmp = tmp.next;
            }
            tmp.next = new Element(container);
        }
        size++;
    }
    public Container deleteContainer()
    {
        if(size == 0)
        {
            System.out.println("Warehouse is empty");
            return null;
        }
        Element oneBeforeLast = head;

        for(int i = 0; i < size - 1; i++)
        {
            oneBeforeLast = oneBeforeLast.next;
        }

        Element last = oneBeforeLast.next;
        size--;

        if(last != null)
        {
            oneBeforeLast.next = null;
            return last.container;
        }
        else
        {
            head = null;
            return null;
        }
    }
    public void show()
    {
        Element tmp = head;
        while(tmp != null)
        {
            System.out.println(tmp.container.cargoWeight);
            tmp = tmp.next;
        }
    }
}
