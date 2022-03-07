package practice;

import java.util.Scanner;

class BankAccount{
	private String accountNumber;
	private String name;
	private int balance;
	
	Scanner sc = new Scanner(System.in);
                    
//                    account details 
	public void createAccount(){
		System.out.println("Enter the account number:");
		accountNumber = sc.next();
		
		System.out.println("Enter the name:");
		name = sc.next();
		
		System.out.println("Enter the Balance:");
		balance = sc.nextInt();
		
		}
		
		// acount details
		public void showAccount(){
			System.out.println("Name of the Account holder: "+ name);
			System.out.println(" Account Number: "+ accountNumber);
			System.out.println(" Account Balance: "+ balance);
			
			}
		 
		 // deposit money
		 public void depositAmount(){
				
			int amount;
			System.out.println("Enter balnce to deposit: ");
			amount = sc.nextInt();
			balance = balance + amount;
			
		 }
		 //withdraw money
		 public void withdrawAmount(){
			 int amount;
			 System.out.println("Enter balance to withdraw: ");
			 amount = sc.nextInt();
			 
			 if(balance >= amount){
				 balance = balance - amount;
				 System.out.println("Balance After the withdraw: "+ balance);
			 }
			 else{
				 System.out.println("Your amount is less than : "+amount);
			 }
			 
		 }
		 
		 public boolean findAccount(String accountNum){
			 if(accountNumber.equals(accountNum)){
				 showAccount();
				 return true;	 
			 }
			 else{
				 return false;
			 }
		 }
}


public class QuestionEight{
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

             System.out.println("Enter the number of client= ");
             int n = sc.nextInt();

             BankAccount data[] = new BankAccount[n];

             for(int i = 0; i < data.length; i++){
                     data[i] = new BankAccount();
                     data[i].createAccount();
             }
		 
                int choice;
                do{
                        System.out.println("1.Display accounts detail");
                        System.out.println("2.Search client by account number");
                        System.out.println("3.Deposit Amount");
                        System.out.println("4.Withdraw Amount");
                        System.out.println("5.Exit");
                        
                        System.out.println("Enter your choice: ");
                        choice = sc.nextInt();

                        switch(choice){
                               case 1:
                                               for(int i =0; i < data.length; i++){	// To show the Account details
                                                       data[i].showAccount();
                                               }
                                               break;

                               case 2: 
                                               System.out.println("Enter account number=  "); 
                                               String accountNum = sc.next();
                                               boolean isAccountAvailable = false;

                                               for(int i = 0; i < data.length; i++){
                                                       isAccountAvailable = data[i].findAccount(accountNum);

                                                       if(isAccountAvailable){
                                                               break;
                                                       }
                                               }
                                               if(!isAccountAvailable){
                                                       System.out.println("Account doesn't exit...");
                                               }
                                               break;

                               case 3: 
                                   //case for deposit amount
                                               System.out.println("Enter Account Number: "); 
                                               accountNum = sc.next();
                                               isAccountAvailable = false;

                                               for(int i = 0; i < data.length; i++){
                                                       isAccountAvailable = data[i].findAccount(accountNum);

                                                       if(isAccountAvailable){
                                                               data[i].depositAmount();
                                                               break;
                                                       }
                                               }
                                               if(!isAccountAvailable){
                                                       System.out.println("No such account ");
                                               }
                                               break;

                               case 4:
                                   //case for withdraw amount
                                               System.out.println("Ente the Account Number: "); 
                                               accountNum = sc.next();
                                               isAccountAvailable = false;

                                               for(int i = 0; i < data.length; i++){
                                                       isAccountAvailable = data[i].findAccount(accountNum);
                                                       if(isAccountAvailable){
                                                               data[i].withdrawAmount();
                                                               break;
                                                       }
                                               }
                                               if(!isAccountAvailable){
                                                       System.out.println("No such account");
                                               }
                                               break;

                               case 5: 
                                               System.exit(0);
                                               break;

                        }
                }
                while(choice != 5);

       }
}
