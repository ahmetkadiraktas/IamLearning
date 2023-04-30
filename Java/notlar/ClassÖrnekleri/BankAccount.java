public class BankAccount {
    // özellikler 
    String owner;
    double balance;
    int aType;
    
    
    public BankAccount() 
    {
        owner = "";
        balance = 0.0;
        aType = 0;
    }
    

    // bilgileri yazdırır
    public void info(){
        System.out.println("Bank Account: \nOwner: " + owner + 
                           "\nBalance: " + balance + "\nType: " + aType + "\n");
    }

    
    // hesaba para ekler
    public void addMoney(double a) {
        balance += a;
    }
    
}

