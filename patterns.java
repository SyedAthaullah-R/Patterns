public class patterns { //   *****
//    *****
//    *****
//    *****
//    *****
    public void  pattern1(int n) {
        for (int i = 0; i < n; i++) {
           for(int j = 0; j<n; j++ ){
               System.out.print("*");
           }
           System.out.println();
        }
    }
 // pattern 2
//    *
//    **
//    ***
//    ****
//    *****

    public void pattern2(int n) {
        for(int i = 0; i< n; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    Pattern 3
//        *
//       **
//      ***
//     ****
//    *****
    public void pattern3(int n) {
        for(int i = 0; i< n; i++){
            for(int j = i; j < n ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        }
//Pattern 4
//    *****
//    ****
//    ***
//    **
//    *
    public void pattern4(int n) {
        for(int i = 0;i<n; i++){
            for(int j = i; j < n  ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
            patterns p = new patterns();
            p.pattern4(5);
    }
}
