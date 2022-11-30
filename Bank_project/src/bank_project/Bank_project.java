/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_project;

/**
 *
 * @author amsia
 */
public class Bank_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank ICICI=new Bank();
        ICICI.Bank_name="Industrial Credit and Investment Corporation of India";
        ICICI.interest_rate=7;
        ICICI.get_loan();
        Bank SBI=new Bank();
        SBI.Bank_name="State Bank of India";
        SBI.interest_rate=8;
        SBI.get_loan();
        Bank IOB=new Bank();
        IOB.Bank_name="Indian Overseas Bank";
        IOB.interest_rate=9;
        IOB.get_loan();
    }
    
}
