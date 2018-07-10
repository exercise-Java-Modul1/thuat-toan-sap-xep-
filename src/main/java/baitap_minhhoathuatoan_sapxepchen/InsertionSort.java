package baitap_minhhoathuatoan_sapxepchen;

public class InsertionSort {
    static int[] aray = {1, 5, 9, 6, 2, 4, 10, 15, 3};

    static void insertionSort(int[] aray) {
        int dem = 1;
        for (int i = 1; i < aray.length; i++) {
            boolean needNextPass = false;
            for (int j = i; j > 0; j--) {
                if (aray[j - 1] > aray[j]) {
                    int temp = aray[j - 1];
                    aray[j - 1] = aray[j];
                    aray[j] = temp;
                    needNextPass = true;
                }
            }

            if (needNextPass == true) {
                System.out.print("Lần sắp xếp thứ " + dem + " của mảng ta được: ");
                for (int j : aray) {
                    System.out.print(j + "  ");
                }
                System.out.println();
                dem++;
            }
        }
    }

    public static void main(String[] args) {
        insertionSort(aray);
        System.out.println("Array may be sorted and next pass not needed");
    }
}
