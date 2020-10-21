








public class SelectionSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            if (i != smallest) {
                swap(array, i, smallest);
            }
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static String arrayToString(int[] array) {
        String out = "[ ";
        for (int i : array) {
            out += i + " ";
        }

        return out + "]";
    }


    // Test
    public static void main(String[] args) {
        int[] test = new int[]{3,2,9,6,5,7,1,4,8};

        System.out.println(arrayToString(test));
        int[] sorted = sort(test);

        System.out.println(arrayToString(sorted));
    }
}
