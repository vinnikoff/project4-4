/**
 * Created by VINNI on 25.11.16.
 */
public class Bank
{
    double balance;

    Bank (double balance)
    {
        this.balance=balance;
    }

    @Override
    public String toString()
    {
        return balance+"";
    }

}