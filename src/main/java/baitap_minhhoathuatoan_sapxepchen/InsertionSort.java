package baitap_minhhoathuatoan_sapxepchen;

public class InsertionSort {
    static int[] aray = {1, 5, 9, 6, 2, 4, 10, 15, 3, 15};

    static void insertionSort(int[] aray) {
        for (int i = 1; i < aray.length; i++) {
            int j = i;
            int temp = aray[i];
            for (; j > 0; ) {
                if (aray[j - 1] > temp) {
                    aray[j] = aray[j - 1];
                    j--;
                    showOutput(aray);
                    System.out.println();
                } else {
                    break;
                }
            }
            aray[j] = temp;
        }
    }

    static void showOutput(int[] aray) {
        for (int i = 0; i < aray.length; i++) {
            System.out.print(aray[i] + "\t");
        }
    }


    public static void main(String[] args) {
        insertionSort(aray);
        showOutput(aray);
        System.out.println("\n" + "Array may be sorted and next pass not needed");
    }
}
