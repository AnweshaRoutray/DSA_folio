package DSA_Sheet.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Before Reversing");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("After Reversing:");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    
}
