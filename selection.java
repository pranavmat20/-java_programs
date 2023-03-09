public class selection {
    static void sort(int arr[]) {
        int n = arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            int min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    static void print(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 32, 43, 22, 11, 65, 78, 69 };
        int n = arr.length;
        sort(arr);
        print(arr, n);
    }
}
