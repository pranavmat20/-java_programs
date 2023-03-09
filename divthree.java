public class divthree{
    // void threenum(int N) {
    //     int find = 0;
    //     int i = 1;
    //     int numberOfDivisions = 1;
    //     while (find < N) {
    //         for (int j = 2; j <= i; j++) {
    //             if (i % j == 0) {
    //                 numberOfDivisions++;
    //             }
    //         }
    //         if (numberOfDivisions == 3) {
    //             find++;
    //             System.out.println(find + " = " + i);
    //         }
    //         numberOfDivisions = 1;
    //         i++;
    //     }
    // }
    public int exactly3Divisors(int N)
    {
        //Your code here
        
        int number=0;
        for(int i =1;i<=N;i++){
            int count =2;
            for(int j =2;j<i;j++){
                if(i%j==0) count++;
                
            }
            if (count ==3) number++;
        }
        return number;
    }
    public static void main(String args[]) {
        
        divthree obj = new divthree();
        System.out.println(obj.exactly3Divisors(20));
    }
}