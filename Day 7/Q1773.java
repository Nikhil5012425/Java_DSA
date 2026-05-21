public class Q1773{
    public static void main(String[] args) {
        String arr[][] = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String rulekey = "type";
        String rulevalue = "phone";
        int count = 0;
        for (int i = 0;i<arr.length;i++){
                if(rulekey=="type"){
                    if(arr[i][0]==rulevalue){
                        count++;
                    }                
                }
                if(rulekey=="color"){
                    if(arr[i][1]==rulevalue){
                        count++;
                    }                
                }
                if(rulekey=="name"){
                    if(arr[i][2]==rulevalue){
                        count++;
                    }                
                }
            
        }
        System.out.println(count);
    }
}