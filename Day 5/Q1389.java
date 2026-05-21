public class Q1389 {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        int target[] = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            
            for(int j=nums.length-1;j>index[i];j--){
                target[j]=target[j-1];
            }
            target[index[i]] = nums[i];
        }
        for(int i = 0; i< nums.length; i++){
            System.out.println(target[i]);
            
        }
    }
}
