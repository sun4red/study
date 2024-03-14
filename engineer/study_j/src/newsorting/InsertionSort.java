package newsorting;

public class InsertionSort {
    public static void main(String[] args) {
        ToSort toSort = new ToSort();
        int[] array = toSort.generateArray(100, 10);
        System.out.println("최초배열");
        toSort.showArray(array);
        int change = 0;
        int count = 0;
        for (int r = 1; r < array.length; r++) {
            for (int l = 0; l < r; l++) {
//              실행
                count++;
                System.out.println("실행 횟수: " + count);
                if (array[l] > array[r]) {
                    int insert = array[r];
                    for (int a = 0; r - a - 1 >= l; a++) {
                        array[r - a] = array[r - a - 1];

                    }
                    array[l] = insert;
                    change++;
                    System.out.println(change + "회차 변경, 삽입 값: " + insert);
                    toSort.showArray(array);

                }
            }
        }




/*
GPT
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
 */
//        toSort.showArray(array);
    }
}