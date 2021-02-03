class Bank {
    String cName;
    int accNo;
    double bAmount;

    public void setData(String cName, int accNo, double bAmount){
        this.cName = cName;
        this.accNo = accNo;
        this.bAmount = bAmount;
    }
    Bank copyRecord(){
        Bank b1 = new Bank();
        b1.setData(cName, accNo, bAmount);
        return b1;
    }
    public void showData(){
        System.out.println("Customer Name : "+this.cName);
        System.out.println("Customer Account No. : "+this.accNo);
        System.out.println("Balance Amount : "+this.bAmount);
    }
}

public class Program17 {

    public static void main(String[] args) {
     Bank bank = new Bank();
     bank.setData("Masud", 56454,3000);

     Bank bank1 = bank.copyRecord();
     bank1.showData();
    }
}

