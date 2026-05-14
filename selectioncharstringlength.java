public class selectioncharstringlength {
     public static void selectchar(char arr[],int n){
        if(n==arr.length-2){
            return;
        }
        for(int j=n+1;j<arr.length-1;j++){
            if((int)arr[j]>(int)arr[n]){
                char temp=arr[n];
                arr[n]=arr[j];
                arr[j]=temp;
            }
                 }
                  selectchar(arr,n+1);  
    }
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
        String[] arr1={"Santhosh","Rakesh","Sabaresh"};
       for (int i = 0; i < arr1.length; i++) {
            char[] charArray = arr1[i].toCharArray();  
            selectchar(charArray, 0);                  // sort characters
            arr1[i] = new String(charArray);           // store back updated string
        }
        selection(arr1);
        int n=arr1.length;  
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }

}