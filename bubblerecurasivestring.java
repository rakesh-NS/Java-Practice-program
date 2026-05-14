public class bubblerecurasivestring {
    static void bubbleSort(char arr[], int n,int l)
    {
        
        if (l == n-1) {
            return;
        }

        
        for (int i=0; i<n-l-1; i++)
            if (arr[i] > arr[i+1])
            {
                
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        
        bubbleSort(arr, n,l+1);
    }
    public static void main(String args[])
    {
        char arr[] = {'S', 'a', 'n', 't', 'h', 'o', 's', 'h'};
        bubbleSort(arr, arr.length, 0);
        System.out.println("Sorted array");
         int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
