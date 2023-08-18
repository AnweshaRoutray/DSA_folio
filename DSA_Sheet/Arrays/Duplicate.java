package DSA_Sheet.Arrays;
//Returns true if any elements appears atleast twice else if every element is distinct returns false;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        int arr[]={3,2,4,8,3,6};
        Set<Integer> s=new HashSet<>();
        boolean f1=false;
        for(int i=0;i<arr.length;i++)
        {
            if(s.contains(arr[i]))
            {
                f1=true;
                break;
            }
            s.add(arr[i]);
        }
        if(f1)
            System.out.println("There exists a Duplicate Element");
        else
            System.out.println("Every Element is unique");
        
    }
    
}
