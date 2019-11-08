public class MedianClient {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int length = arr.length;
        FindMedian fm = new FindMedian();
        System.out.println(fm.FindMedian(arr,length));
    }
}
