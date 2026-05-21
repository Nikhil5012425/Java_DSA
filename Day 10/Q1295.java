public class Q1295 {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        int count = 0;
        for(int i = 0; i< nums.length; i++){
           int n = nums[i];
            int digit = 0;
            while(n != 0){
                n = n/10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
