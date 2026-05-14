public class bubble {
    static void bubbleSort(int arr[])
    {
      
        for (int i = 0; i < arr.length-1; i++)
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

   
    
   

    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array");
         int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
