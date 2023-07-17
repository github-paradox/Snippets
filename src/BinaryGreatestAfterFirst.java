//To find the greatest no before the first occurence of the target element
public class BinaryGreatestAfterFirst 
{
   public static void main(String[] args) {
    int arr[]=new int[]{0,1,1,1,1,2,3,4,5,5,5,5,6};
    int mid,low=0,high=arr.length-1,target=7,ans=-1;
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
    if(ans>0 || ans!=-1)
    System.out.println(arr[ans-1]);
    else
    System.out.println("nothing");
   } 
}
