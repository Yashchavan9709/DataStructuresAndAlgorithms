public class Vowel {
    public static void main(String args[]){
        String[] str = {"flower","flow","fly"};

        for(int i=0; i<str.length; i++) {
            String s = str[i];
            boolean flag = false;
            for(int j = 0;j<s.length();j++){
                char ch = s.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    flag = true;
                }

            }
            System.out.println(flag);
        }
    }
}
