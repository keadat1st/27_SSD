public class Bank {

   public static void main(String[] args){
   
      Customer claus = new Customer();
      claus.setName("Claus Den Grusomme");
      claus.openAccount();
      
      
      Account acc = claus.showAccount(0);
      acc.withdraw(1000);
      
      
      //String displaymessage =  claus.display();
     //System.out.println(displaymessage);
   
   }

}