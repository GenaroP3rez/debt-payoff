import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CreditCard amex = new CreditCard("American Express", 18.4, 402);



        //added//type inference "'an arraylist of double"
        List<Double> aprs = new ArrayList<>();
        List<CreditCard> card = new ArrayList<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();


            aprs.add(apr);

            double balance = scan.nextDouble();
            CreditCard myCard = new CreditCard(name, apr, balance);
            card.add(myCard);

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        Collections.sort(aprs, Collections.reverseOrder()); 
        // "you didnt tell me how to compare it" compare interface is next class 4/22/26
       // Collections.sort(card); 

        //added code
        System.out.println(aprs);
        System.out.println(card);
    }
}
