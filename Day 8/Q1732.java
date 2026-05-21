public class Q1732{
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        // int alt[] = new int[gain.length+1];
        // alt[0]=0;
        // for(int i = 1; i< alt.length;i++){
        //     alt[i] = alt[i-1]+gain[i-1];
        // }
        // int max = 0;
        // for(int i =0; i<alt.length;i++){
        //     if(alt[i]>max){
        //         max = alt[i];
        //     }
        // }
        // System.out.println(max);
        int current=0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            current = current + gain[i];

            if(current>max){
                max = current;
            }
        }
        System.out.println(max);
    }
}