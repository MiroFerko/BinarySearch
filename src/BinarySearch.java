public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 4, 6, 10, 22, 34, 65, 99};
        System.out.println("Position of the number in array is " + (runBinarySearch(sortedArray, 34, 0, sortedArray.length) + 1));
    }



    public static int runBinarySearch(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}