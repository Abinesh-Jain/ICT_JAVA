package if_else;

public class If_else {

    public static void main(String[] args) {
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
