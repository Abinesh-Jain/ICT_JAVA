package arraylist;
import java.util.ArrayList;
public class Array{
    public static void main(String args[]){
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        System.out.println(arr1);
        for(int i=0;i<3;i++){
            int x=2;
            x=x*arr1.get(i);
            arr2.add(x);
        }
        System.out.println(arr2);
    }
}