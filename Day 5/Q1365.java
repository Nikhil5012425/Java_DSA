public class Q1365{
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for( int j=0; j<arr.length; j++){
                if(i!=j && arr[i]>arr[j]){
                    count = count + 1;
                }
            }
            ans[i] = count;
            System.out.println(ans[i]);
        }
    }
}