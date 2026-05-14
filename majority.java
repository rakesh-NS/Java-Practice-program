public class majority {
public static void main(String[] args) {
    int arr[] = {10,5, 10, 6, 6, 6, 7, 8, 8};
    int n = arr.length;
    System.out.println("Majority element is " + majorityElement(arr, n));}
    static int majorityElement(int arr[], int n) {
        int maxCount = 0;
        int index = -1; 
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
       
            return arr[index];
       
    }}