public class BinarySearch {
    public int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
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
        public static void main(String args[])
        {
            BinarySearch ob = new BinarySearch();
            int sortedArray[] = { 2, 3, 4, 10, 30 };
            int n = sortedArray.length;
            int x = 10;
            int result = ob.runBinarySearchIteratively(sortedArray, 0, n - 1, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index "
                        + result);
        }
    }