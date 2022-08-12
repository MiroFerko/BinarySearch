public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 4, 6, 10, 22, 34, 65, 99};
        System.out.println("Position of the number in array is " + (runBinarySearch(sortedArray, 34)+1));
    }




    public static int runBinarySearch(int[] values, int x) {
        int start = 0;
        int end = values.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (values[mid] == x)
                return mid;
            else if (values[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}