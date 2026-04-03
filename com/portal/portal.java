
import java.util.Scanner;
import java.util.ArrayList;
import com.accountType.saving;
import com.accountType.current;

public class portal{
    public static void main(String[] args) {
        ArrayList<Object> accounts = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;
        
        while(continueLoop){
            System.out.println("\n=== Welcome to the Bank Portal ===");
            System.out.println("1 for Login");
            System.out.println("2 for Register");
            System.out.println("3 to View All Accounts");
            System.out.println("4 to Exit");
            
            int choice = sc.nextInt();
            
            if(choice == 1){
                System.out.println("Enter your username:");
                String username = sc.next();
                System.out.println("Enter your password:");
                String password = sc.next();
                
                // Here you would add code to verify the username and password
                System.out.println("Login successful!");
                
            } else if(choice == 2){
                System.out.println("Enter your desired username:");
                String newUsername = sc.next();
                System.out.println("Enter your desired password:");
                String newPassword = sc.next();
                System.out.println("Choose account type: 1 for Saving, 2 for Current");
                int accType = sc.nextInt();
                
                if(accType == 1){
                    saving newAccount = new saving(newUsername, newPassword);
                    accounts.add(newAccount);
                    System.out.println("Saving Account Registration successful!");
                    System.out.println("Username: " + newAccount.username);
                } else if(accType == 2){
                    current newAccount = new current(newUsername, newPassword);
                    accounts.add(newAccount);
                    System.out.println("Current Account Registration successful!");
                    System.out.println("Username: " + newAccount.username);
                } else {
                    System.out.println("Invalid account type.");
                }
                
            } else if(choice == 3){
                if(accounts.isEmpty()){
                    System.out.println("No accounts registered yet.");
                } else {
                    System.out.println("\n=== All Registered Accounts ===");
                    for(int i = 0; i < accounts.size(); i++){
                        Object acc = accounts.get(i);
                        if(acc instanceof saving){
                            saving s = (saving) acc;
                            System.out.println("Account " + (i+1) + " - Saving Account");
                            System.out.println("  Username: " + s.username);
                            System.out.println("  Password: " + s.password);
                        } else if(acc instanceof current){
                            current c = (current) acc;
                            System.out.println("Account " + (i+1) + " - Current Account");
                            System.out.println("  Username: " + c.username);
                            System.out.println("  Password: " + c.password);
                        }
                    }
                }
                
            } else if(choice == 4){
                System.out.println("Thank you for using Bank Portal. Goodbye!");
                continueLoop = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}