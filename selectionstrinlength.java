public class selectionstrinlength {
    static void selection(String arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].length()>arr[j].length()){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        String[] arr={"Santhosh","Rakesh","Sabaresh"};
        selection(arr);
        int n=arr.length;  
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
