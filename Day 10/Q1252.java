public class Q1252{
    public static void main(String[] args) {
        int m =2;
        int n=3;
        int arr[][] = new int[m][n];
        int ind[][] = {{0,1},{1,1}};
        for (int i = 0; i < ind.length; i++){
            int row = ind[i][0];
            int col = ind[i][1];

            for(int j=0; j<n ; j++){
                arr[row][j]++;
            }
            for(int j=0; j<m ; j++){
                arr[j][col]++;
            }
        }
        int count = 0;
        for(int i= 0;i< arr.length ;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
}