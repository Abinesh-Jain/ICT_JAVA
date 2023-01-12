package merge.sort;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int p[]={-1,3,8,0,0};
        int q[]={2,4};
        int r[]=new int[p.length+q.length];
        for(int i=0;i<p.length;i++)
        {
            r[i]=p[i];
        }
        for(int i=0;i<q.length;i++)
        {
            r[p.length+i]=q[i];
        }
        Arrays.sort(r);
        for(int j=0;j<r.length;j++)
        {
            System.out.println(r[j]);
        }
    } 
}
