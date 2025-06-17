import java.util.Scanner;
public class Task2
{
    public static int[] selectsort(int[] arr,int n)
    {
        int minindex,temp;
        int result[]= new int[2];
       for(int i=0;i<n-1;i++)
       {
            minindex=i;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                    temp=arr[i];
                    arr[i]=arr[minindex];
                    arr[minindex]=temp;
                }
            }
       } 
       result[0]=arr[1];
       result[1]=arr[n-2];
       return result;
    }
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array :");
        n=s.nextInt();
        int arr[]= new int[n];
        for (int i=0; i<n;i++)
        {
            System.out.println("Enter element "+i);
            arr[i]=s.nextInt();
        }
        int ans[]=selectsort(arr,n);
        System.out.println("Second Highest Value : "+ans[0]);
        System.out.println("Second Lowest Value : "+ans[1]);
    }
    
}
