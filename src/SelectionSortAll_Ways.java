import java.util.Arrays;

class Sort
{
    static void SelectionMin(int arr[])
    {
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            int min=i;
            for(j=i+1;j<arr.length;j++)
            if(arr[min]>arr[j])
            min=j;

            if(min!=i)
            swap(arr, min, i);

        }
    }
    static void SelectionMax(int arr[])
    {
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            int max=arr.length-1-i;
            for(j=0;j<arr.length-i;j++)
            if(arr[max]<arr[j])
            max=j;

            if(max!=arr.length-i-1)
             swap(arr, max, arr.length-i-1);
        }
}
    static  void SelectionImprovised(int arr[],int n)
    {
    for (int i = 0, j = n - 1; i < j; i++, j--)
    {
        int min = arr[i], max = arr[i];
        int min_i = i, max_i = i;
        for (int k = i; k <= j; k++)
        {
            if (arr[k] > max)
            {
                max = arr[k];
                max_i = k;
            }
             
            else if (arr[k] < min)
            {
                min = arr[k];
                min_i = k;
            }
        }
 
        // shifting the min.
        swap(arr, i, min_i);
 
        // Shifting the max. The equal condition
        // happens if we shifted the max to arr[min_i]
        // in the previous swap.
        if (arr[min_i] == max)
            swap(arr, j, min_i);
        else
            swap(arr, j, max_i);
    }
}
 
static int[] swap(int []arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
}
    public static void main(String[] args) {
        int arr[]={5,2,12,8,16,10,3,31,14};
        SelectionMax(arr);
        int arr1[]={4,1,23,1,-8,9,-5};
        SelectionMin(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        int arr2[]={5,4,1,2,3,6};
        SelectionImprovised(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}