public class insertion {
    static void print(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    static void sort(int arr[]){
        int n= arr.length;
        for(int i= 1;i<n;i++){
            int key=arr[i];
            int j= i-1;
            while (j>=0 &&arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 56, 33, 12, 174, 635, 8, 69 };
        int n = arr.length;
        sort(arr);
        print(arr, n);
    }
}
