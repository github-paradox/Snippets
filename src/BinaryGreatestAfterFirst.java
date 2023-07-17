//To find the greatest no before the first occurence of the target element
import java.util.*;
public class BinaryGreatestAfterFirst 
{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number of elements");
      int n=sc.nextInt();

       int arr[]=new int[n];
      
      System.out.println("Enter the elements");
      for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();

      System.out.println("Enter the Target element to be found");
      int target=sc.nextInt();
      
    int mid,low=0,high=arr.length-1,ans=-1;
      
    while(low<=high)
    {
        mid=low+(high-low)/2;
        if(arr[mid]==target)
        {
        ans=mid;
        high=mid-1;
        }
        else if(arr[mid]>target)
        high=mid-1;
        else
        low=mid+1;
    }
    if(ans>-1)
    System.out.println("The Greatest Element found after "+target+" is the element "+arr[ans-1]);
    else
    System.out.println("No such element found");
   } 
}
