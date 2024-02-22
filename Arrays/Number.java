public class Number {
    public static void main(String args[]) {
        int[] arr = {12, 5, 30, 45, 67, 354, 2874};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int n = arr[i];
            for (int j = 2; j <= n/2; j++) {
                if (n % j == 0) {
//                    System.out.println("Not prime");
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            } else{
                System.out.println("Not Prime");
            }
        }

//        for(int i=0;i<arr.length;i++){
//            if(arr[i] % 2 == 0){
//                System.out.println("Even");
//            } else if(arr[i] % 2 != 0){
//                System.out.println("Odd");
//            }
//        }
    }
}
