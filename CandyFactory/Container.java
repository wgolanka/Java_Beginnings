package CandyFactory;

/*
 A task to make candy factory. There
 were specific instructions how to make it
 but I lost them somewhere.
*/
public class Container
{
    Candy cargo;
    double cargoWeight;
    int expirationDate;

    public Container(int acceptableWeight)
    {
        this.cargoWeight = acceptableWeight;
    }
    public void load(Candy candy, int expirationDays)
    {
        cargo = candy;
        this.expirationDate = expirationDays;

    }
    public boolean checkExpirationDate()
    {
        if(this.expirationDate > 0)
        {
            return true;
        }
        return false;
    }
}
