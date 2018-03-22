public class Customer {

      private String name;
      private Account[] accounts;
      
      
      public Customer(){ 
                
          accounts = new Account[10];
      }
           
      public Account showAccount(int i){
         return accounts[i];
      }
      
      public void openAccount(){
         
         accounts[0] = new Account();
        // accounts[1] = new Account();
        // accounts[2] = new Account();
      }
        
      public String getName(){
         return name;
      }
      
      public void setName(String name){
         
         this.name = name;
      }
      
      public String display(){
      
         // If customer has more than one account, 
         // prompt customer for account number.
         
         
         // If wrong account number is entered, a prompt is displayed with an error msg.

         
         if(accounts[1] != null){
            
            //System.out.println("Hvilken konto vil du have vist? .... ");
            
            return "Hvilken konto vil du have vist? .... ";
         
         } else {
            
            return "Navn: " + getName() + "\nAccount: " + accounts[0].getAccountNumber() + "\nBallance " + accounts[0].getBalance();
     
         }
         
       }

}