package DSA_Sheet.Arrays;
//search for an element in the array in O(log n)time complexity
public class SearchInArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        boolean flag=false;
        if(arr[0]==target)
        {
            flag=true;
            System.out.println("Found at index 0");
        }
        else{
            int i=1,j=arr.length-1;
            while(i<j)
            {
                if(arr[i]==target)
                {
                    flag=true;
                    System.out.println("Found at index "+i);
                    break;
                }
                if(arr[j]==target)
                {
                    flag=true;
                    System.out.println("Found at index "+j);
                    break;
                }
                i++;
                j--;
            }
            if(arr[i]==arr[j] && arr[i]==target)
            {
                flag=true;
                System.out.println("Found at index "+i);
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
    }
    
}
