/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author janlouie
 */
public class Part04_02YoutFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthew's Account", 1000.0);
        Account myAccount = new Account("My Account", 0.0);
        
        matthewsAccount.withdraw(100);
        myAccount.deposit(100);
        
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
