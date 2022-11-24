/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if_else;

/**
 *
 * @author amsia
 */
public class If_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Tamil=97;
        int English=96;
        int Maths=87;
        int Science=99;
        int Social=100;
        int sum=Tamil+English+Maths+Science+Social;
        int avg=sum/5;
        System.out.println("The Total mark is "+sum);
        System.out.println("The Average mark is "+avg);
        if(avg<50){
            System.out.println("Grade F");
        }else if(avg>=50 && avg<=70){
            System.out.println("Grade A");
        }else if(avg>=70 && avg<=85){
            System.out.println("Grade O");
        }else if(avg>=85 && avg<=100){
            System.out.println("Grade S");
    }
    }
    
}
