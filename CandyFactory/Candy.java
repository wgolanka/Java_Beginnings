package CandyFactory;

/*
 A task to make candy factory. There
 were specific instructions how to make it
 but I lost them somewhere.
*/
public class Candy
{
    String flavor;
    double weight;

    public Candy(String smak, double waga)
    {
        this.flavor = smak;
        this.weight = waga;
    }
    public void show()
    {
        System.out.println("Candy of flavor " + this.flavor + " weights " + this.weight);
    }
}
