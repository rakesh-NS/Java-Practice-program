public class LINEARSEARCH {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9, 15, 22, 8, 1, 17, 6, 13, 19, 4, 10, 21, 2, 18, 14, 11};
        System.out.print("Array elements: ");
        for (int num : arr) {
            if(num == 10) break;
            System.out.print(num + " ");
        }
    }
}