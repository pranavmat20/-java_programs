import java.util.HashMap;

public class majElement {

    public static void find(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length / 2) {
                    System.out.println("Majority element is " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);

            } else
                map.put(arr[i], 1);
        }
        System.out.println("Majority element does not exist");
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        find(arr);
    }
}
