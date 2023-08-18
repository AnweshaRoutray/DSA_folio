package DSA_Sheet.Arrays;
//N no of chocolate packets and m no of students
// distribute the chocolate packets between student 
//such that (student with maximum no of choco - student with Minimum no of choco)=Minimum
import java.util.Arrays;
public class ChocoDistribute {
    public static void main(String[] args) {
        int arr[]={7, 3, 2, 4, 9, 12, 56};
        int n=arr.length;
        int m=3;
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++)
        {
            int r=i+m-1;
            int diff=arr[r]-arr[i];
            if(diff<mindiff)
            {
                mindiff=diff;
            }
        }
        System.out.println("Minimum difference = "+mindiff);
        
    }
    
}
