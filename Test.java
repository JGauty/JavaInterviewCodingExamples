import searching.BinarySearch;

public class Test {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int index= binarySearch.searchElement(new int[]{1, 2, 3,4, 5, 6, 7}, 60);
        System.out.println(index);
    }

}
