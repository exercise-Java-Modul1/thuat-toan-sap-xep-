package baitap_caidat_thuattoan_sapxepchen;

public class InsertionSort {

    static double[] arr = {4.5, 1, 9, -1.5, 13, 25, -10, -3, 4, 2};

    static void insertionSort(double[] arr) {

        for (int i = 1; i < arr.length; i++) {
            double temp = arr[i];
            int j = i;
            while (j > 0) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                    j--;
                } else {
                    break;
                }
            }
            System.out.println(j);
            arr[j] = temp;
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
