package newsorting;

public class Test {
    public static void main(String[] args) {

        ToSort toSort = new ToSort();
        int[] test = toSort.generateArray(20, 20);

        System.out.println(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

        toSort.showArray(test);

    }
}
