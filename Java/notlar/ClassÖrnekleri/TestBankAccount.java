public class TestBankAccount {
    
    public static void main(String[] args) {
        
        // Creating an object
        BankAccount account = new BankAccount();

        // Setting properties
        account.owner   = "Ali Veli"; 
        account.balance = 1000; 
        account.aType = 0;
        
        // Printing account information
        account.info();

        // add money
        account.addMoney(500);

        // Printing account information again
        account.info();

        // take some money
        account.addMoney(-1500);

        // Printing account information again
        account.info();   
                
    }  

}
