class Bank{
    int total=0;
    int fixedDeposit=0;
    int CashCredit = 0;
    void setFixedDeposist(int value){
        fixedDeposit = fixedDeposit+value;
    }
    void setCashCredit(int value){
        CashCredit = CashCredit+value;
    }
    public void displaytotalcash(){
        total = fixedDeposit+CashCredit;
        System.out.println(total);
    }
}

class Saving extends Bank{
    
    void setFixedDeposist(int value){
        fixedDeposit = fixedDeposit+value;
    }
}

class Current extends Bank{
    
    public void setCashCredit(int value){
        CashCredit = CashCredit+value;
    }
}


public class TotalCash {

    public static void main(String[] args) {
        Bank s = new Saving();
        Bank c = new Current();
        s.setFixedDeposist(10);
        s.setCashCredit(10);
        c.displaytotalcash();
    }
}
