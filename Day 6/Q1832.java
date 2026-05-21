public class Q1832 {
    public static void main(String[] args) {
        String Sentence = "abc";
        int arr[] = new int[26];
        for(int i=0;i<Sentence.length();i++){
            Character ch = Sentence.charAt(i);
            arr[ch - 'a'] = 1;
        }
        Boolean pangram = true;
        for(int i = 0;i<arr.length; i++){
            if(arr[i]==0){
                pangram = false;
            }
        }
        System.out.println(pangram);
    }
}
