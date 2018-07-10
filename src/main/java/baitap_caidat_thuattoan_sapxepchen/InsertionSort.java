package baitap_caidat_thuattoan_sapxepchen;

public class InsertionSort {

    static double[] arr = {4.5, 1, 9, -1.5, 13, 25, -10, -3, 4, 2};

    static void insertionSort(double[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    double temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        System.out.println("Sau khi sắp xếp lại ta được dãy số mới là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
