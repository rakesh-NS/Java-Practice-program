public class selectionintsort{
    static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={12,3,7,6,1,9};
        selection(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}