import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,3};
        int ec = 3;
        List<Boolean> res = new ArrayList<>();
        int max =0;
        for(int i = 0;i < arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0;i < arr.length; i++){
            if(arr[i]+ec<max){
                res.add(false);
            }
            else{
                res.add(true);
            }
            
        }
        System.out.println(res);
    }
}
