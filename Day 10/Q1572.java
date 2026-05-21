public class Q1572 {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i =0;i<mat.length;i++){
            sum = sum + mat[i][i];
            if(i!=mat.length-1-i){
                sum = sum + mat[i][mat.length-1-i]; 
            }   
        }
        System.out.println(sum);
    }
}