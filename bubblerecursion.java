public class bubblerecursion {
    static void bubbleSort(int arr[], int n,int l)
    {
        
        if (l == n-1) {
            return;
        }

        
        for (int i=0; i<n-l-1; i++)
            if (arr[i] > arr[i+1])
            {
                
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        
        bubbleSort(arr, n,l+1);
    }
    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr, arr.length, 0);
        System.out.println("Sorted array");
         int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
