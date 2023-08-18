package DSA_Sheet.Arrays;

public class Minmaxele {
    public static int[] minmax(int arr[],int n)
    {
        int output[]=new int[2];
        output[0]=arr[0];
        output[1]=arr[0];
        if(n==1)
        {
            return output;
        }
        else{
            for(int i=1;i<n;i++)
            {
                if(arr[i]<output[0])
                {
                    output[0]=arr[i]; //min
                }
                if(arr[i]>output[1])
                {
                    output[1]=arr[i]; //max
                }
            }

        }
        return output;
    }
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        int r[]=new int[2];
        r=minmax(arr,arr_size);
        System.out.println("Minimum Element = "+r[0]);
        System.out.println("Maximum Element = "+r[1]);
        
    }
    
}
