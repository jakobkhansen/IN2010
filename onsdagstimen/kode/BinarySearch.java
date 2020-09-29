public class BinarySearch {

    // Sorted array as input
    public static boolean binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == value) {
                return true;
            }

            if (array[mid] > value) {
                high = mid - 1;
            }

            if (array[mid] < value) {
                low = mid + 1;
            }
        }


        return false;
    }




    public static void main(String[] args) {
        int[] arr = new int[]{8};

        System.out.println(binarySearch(arr, 8));
    }
}
