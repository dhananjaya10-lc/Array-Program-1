public class SingleDigitSum {
    public static int digitSum(int n) {
        while(n > 9) {
            int sum = 0;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;

    }

    public static void main(String[] args) {
        int arr[] = {23,55,57,93,10,1};

        for(int num : arr) {
            System.out.println(digitSum(num) + "");
        }
    }
}