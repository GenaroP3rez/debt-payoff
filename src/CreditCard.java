public class CreditCard {

    private String name; 
    private double apr;
    private double balance; 

    @Override 
    public String toString(){
            return "CreditCard [name=" + name + ", apr=" + apr + ", balance=" + balance + "]";
    }

    public CreditCard(String something, double apr, double balance){
        name = something; 
        this.apr = apr;
        this.balance = balance;
    }


    public String getName(){
        return name;
    }

    public double getApr(){
        return apr;
    }

    public double getBalance() {
        return balance;
    }


}