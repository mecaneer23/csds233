package day3_recursion;

public class ReverseArray {
    int[] reverseIteratively(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    int[] reverseRecursively(int[] arr, int counter) {
        if (counter >= arr.length / 2) {
            return arr;
        }
        int temp = arr[counter];
        arr[counter] = arr[arr.length - 1 - counter];
        arr[arr.length - 1 - counter] = temp;
        return reverseRecursively(arr, counter + 1);
    }


    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedIteratively = reverseArray.reverseIteratively(arr.clone());
        System.out.print("Iteratively: ");
        for (int num : reversedIteratively) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] reversedRecursively = reverseArray.reverseRecursively(arr.clone(), 0);
        System.out.print("Recursively: ");
        for (int num : reversedRecursively) {
            System.out.print(num + " ");
        }
    }
}
