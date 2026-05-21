public class Q1512{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        int count = 0;
        for(int i=0; i< arr.length ; i++){
            for( int j=0; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    if(i<j){
                        count = count+1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}