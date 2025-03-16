package questions;

public class RemoveDuplicate {

    public static int removeDuplicateFromArray(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[i] = arr[i + 1];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(arr));
        int uniqueElm = removeDuplicateFromArray(arr);

        for (int i = 0; i < uniqueElm; i++) {
            System.out.println(arr[i]);
        }
    }
}
