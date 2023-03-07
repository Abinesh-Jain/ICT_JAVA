package cars;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cars {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try{
        File fileOne=new File("index.html");
        if(fileOne.createNewFile()){
            System.out.println("File created "+fileOne.getName());
        }else{
            System.out.println("File already exist");
        }
        }catch(IOException e){
            System.out.println(e);
        }
        int num=in.nextInt();
        System.out.println("The no is "+num);
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        car mustang=new car();
        mustang.model="Mustang GT";
        mustang.brand="FORD";
        mustang.type="racing";
        mustang.engine_no=673627;
        mustang.chase_no=5326;
        mustang.get_details();
        mustang.get_details(5);
    }
    
}
