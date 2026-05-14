public class selectionrecursivesort{
    public static void select(int arr[],int n){
        if(n==arr.length-2){
            return;
        }
        for(int j=n+1;j<arr.length-1;j++){
            if(arr[j]>arr[n]){
                int temp=arr[n];
                arr[n]=arr[j];
                arr[j]=temp;
            }
                 }
                  select(arr,n+1);  
    }
    public static void main(String args[]){
        int arr[]={12,3,7,6,1,9};
        select(arr,0);
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}