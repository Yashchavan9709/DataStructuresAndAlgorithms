public class Demo_1 {
    public static void main(String args[]){
        String[] str = {"flower","flow","fly"};

        for(int i=0; i<=str.length-1; i++){

            String s = str[i];
            if(i % 2 == 0){
                for(int j=s.length()-1;j>=0;j--){
                    System.out.print(s.charAt(j));
                }
            } else{
                System.out.print(str[i]);
            }
            System.out.println();

            /*char[] a = str[i].toCharArray();
            String[] a = {str[i]};
            for(int j=0; j<=a.length;j++){
                System.out.print(str[j]);
            }
            System.out.println("");
            System.out.println(str[i]);*/

//            for(int j=str[i].length()-1;j>=0;j--){
//                if(j % 2 ==0){
//                    System.out.print(s.charAt(j) + " ");
//                }
//            }
//            for(int j=0;j<str[i].length();j++){
//                if(j % 2 != 0){
//                    System.out.print(s.charAt(j) + " ");
//                }
//            }
//            System.out.println();
        }

    }
}
