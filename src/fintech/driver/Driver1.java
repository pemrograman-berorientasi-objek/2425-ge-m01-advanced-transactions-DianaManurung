package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */
public class Driver1 {
    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);
        List<Account> account =  new ArrayList<>();
        List<Transaction> transaction = new ArrayList<>();

        while(true){
            String input = sc.nextLine();
            if(input.equals("---")){
            break;
            }
            String[] segments = input.split("#");
            String command = segments[0];

            switch (command) {
                case "create-account":
                if (segments.length == 5) {
                create.account(new Account(segments[1], segments[2]), Double.parseDouble(segments[3]));
                    }
                    break;
                case "create-transaction":
                if (segments.length == 5) {
                    create.transaction(new Transaction(Integer.parseInt(segments[1]), Integer.parseInt(segments[2]), segments[3]), Double.parseDouble(segments[4]), segments[5], segments[6]);
                }
                break;
                case "show-account":
                        for (Account accounts : account) {
                            System.out.println(account);
                        }
                        break;
                    }
                }
        
                sc.close();
            }
        }
        

