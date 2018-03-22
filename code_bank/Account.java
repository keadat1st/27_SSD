import java.util.Scanner;
import java.util.Random;

public class Account {

   private int accountNumber = 123456789;
   private double balance = 1000;
   Scanner input = new Scanner(System.in);
   
   
   public void deposit(){
      
      // Kalder metode getBalance();
      getBalance();
   }
   
   public void withdraw(double amount){
      
      String answer = "Y";
      
      while(answer.equals("Y")){
      
               if(balance >= amount+10){
                   balance = balance - 10;
                   balance = balance - amount;
                   System.out.println("Din nye saldo: "+ balance);
                   answer = "N";
               
               } else {
                  
                  System.out.println("Du har ikke nok penge på din konto ! " + balance);
                  System.out.println("Vil du hæve et andet beløb (Y/N)");     
                  answer = input.next();
               
               } 
       } 
      
   }
   
   public double getBalance(){
   
      return 0;
   }
   
   public int getAccountNumber(){
      return accountNumber;
   }

}