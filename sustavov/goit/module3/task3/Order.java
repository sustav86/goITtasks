package sustavov.goit.module3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * SearchMaximalElement <code>Order<code/> create the orders to buy Instruments in MusicStore.
 * Created by SUSTAVOV on 06.06.2016
 * @author ukr-sustavov
 * @version 1.0
 */
public class Order
{
    private String name;
    private Date date;
    private String author;
    private Map<String, Integer> orderList = new HashMap<>();

    public Order(String name, Date date, String author)
    {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    /**
     *
     * @return the name of this order
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return the date of this order
     */
    public Date getDate()
    {
        return date;
    }

    /**
     *
     * @return the author of this order
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Add instrument to the order
     * @param instrument
     *        The name of instrument
     * @param count
     *        The count to ship from MusicStore
     * @throws NegativeOrderCountException
     *         If the {@code instrument} is't available at the store
     */
    public void addPositionOrder(String instrument, int count) throws NegativeOrderCountException
    {
        if (count <= 0)
        {
            System.out.println("Attention! The count of order must be more 0");
            return;
        }

        switch (instrument)
        {
            case "guitar":
                addNewPosition(instrument, count);
                break;
            case "piano":
                addNewPosition(instrument, count);
                break;
            case "trumpet":
                addNewPosition(instrument, count);
                break;
            default:
                throw new NegativeOrderCountException(instrument);
        }
    }

    /**
     *
     * @return the order list
     */
    public Map<String, Integer> getOrderList()
    {
        return orderList;
    }

    /**
     * Print order list
     */
    public void printOrderList()
    {
        System.out.println("### The order " + this.getName() + " consist of:");
        System.out.println("Instrument   Count");
        for (Map.Entry<String, Integer> entry : orderList.entrySet())
        {
            System.out.println(entry.getKey() + "         " + entry.getValue());
        }
    }

    private void addNewPosition(String instrument, int count)
    {
        if (orderList.containsKey(instrument))
        {
            if (askQuestion(instrument))
            {
                int oldCount = orderList.get(instrument);
                orderList.put(instrument, oldCount + count);
                return;
            }
        }
        orderList.put(instrument, count);
    }

    private boolean askQuestion(String instrument)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        boolean answer = false;
        System.out.println("Order " + this.getName() + " has already contained this " + instrument + " instrument. Do you want to add new count to this order?");
        System.out.println("Please, attend! You must tap \"y\" or \"n\"");
        do
        {
            try
            {
                String str = reader.readLine().toLowerCase();
                if (str.equals("y"))
                {
                    answer = true;
                    exit = true;
                } else if (str.equals("n"))
                {
                    answer = false;
                    exit = true;
                } else
                {
                    System.out.println("Please, attend! You must tap \"y\" or \"n\"");
                }
            }
            catch (IOException e)
            {
                System.out.println("Please, attend! You must tap \"y\" or \"n\"");
            }
        }
        while (!exit);

        return answer;
    }
}
