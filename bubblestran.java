public class bubblestran {
static void bab(char[] arr, int n,int l)
    {
        
        if (l == n-1) {
            return;
        }

        
        for (int i=0; i<n-1; i++)
            if (arr[i] < arr[i+1])
            {
                
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        
        bab(arr, n,l+1);
    }
    public static void main(String args[])
    {
           String myString = "Hello,World!";
           char arr[] = myString.toCharArray();
        //    for(int i=0;i<mystring.length;i++){

        //    }
        bab(arr, arr.length, 0);
        System.out.println("Sorted array");
         int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
}