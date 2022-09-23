package searching;

public class BinarySearch {

    public int searchElement(int[] arr, int element) {
        // corner case
        if (arr == null || arr.length == 0) return -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == element) return mid;
            if (arr[mid] > element) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
