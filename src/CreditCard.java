public class CreditCard implements Comparable<CreditCard> {

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




    //Comparable:  less than that == -1 
    //if instant availble offer the apr
    public int compareTo(CreditCard other) {
        if(this.apr < other.apr) {
            return -1;
        }else if(this.apr == other.apr){
            return 0;
        }
        else {
            return 1;
        }


        //NEVER USE DOUBLE, FLOAT on money -Auberon


        //ultraman shortcut 
        //return Double.valueOf(apr).compareTo(other.apr);

        //ultraman shortcut
        //return apr - other.apr;



        //name.CompareTo(other.name);

        

    






        }
    }
