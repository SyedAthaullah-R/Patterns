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
//Pattern 5
//    *****
//     ****
//      ***
//       **
//        *
    public void pattern5(int n) {
        for(int i = 0; i< n; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print(" ");
            }
            for(int j = i; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    Pattern 6
//    ****
//    *  *
//    *  *
//    ****
    public void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            if( i == 0 || i == n-1){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 0; j < n-2 ; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
//   *****
//    *****
//     *****
//      *****
//       *****

    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < n ; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
//    Pattern 8
//     *****
//    *****
//   *****
//  *****
// *****
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i ; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//     *
//    ***
//   *****
//  *******
// *********
    public void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i ; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
//    *********
//     *******
//      *****
//       ***
//        *
    public void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 *(n - i) - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    Pattern 11
//         *
//        * *
//       *   *
//      *     *
//     *********

    public void pattern11(int n) {
        for(int i = 0; i < n; i++){
            for (int j = i ; j< n; j++) {
                System.out.print(" ");
            }
            if( i == 0 || i == n-1){
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }

            }
            else{
                System.out.print("*");
                for(int j = 0; j < 2 * i - 1 ; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }
    }
//    Pattern 12
// *********
//  *     *
//   *   *
//    * *
//     *

    public void pattern12(int n) {
        for( int i = 0; i < n ; i++){
            for(int j = 0; j <= i; j++ ){
                System.out.print(" ");
            }
            if (i == 0 || i == n-1){
                for (int j = 0; j < 2 * (n - i) - 1; j++) {
                    System.out.print("*");
                }

            }
            else{
                System.out.print("*");
                for(int j = 0; j < 2 * (n - i) - 3 ; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
//    Pattern 13
//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *

    public void pattern13(int n) {
        for (int i = 0; i <  n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

            for(int i = 1; i < n; i++){
                for(int j = i ; j < n ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
// Pattern 14
//                 *
//                **
//               ***
//              ****
//             *****
//              ****
//               ***
//                **
//                 *
    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

            for(int i = 1  ; i < n ; i++){
                for (int j = 0 ; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = i ; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
//Pattern 15
//         *
//        ***
//       *****
//      *******
//     *********
//      *******
//       *****
//        ***
//         *

    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i +1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for (int j = 0 ; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0 ; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        // Pattern 16
        // 1
        // 12
        // 123
        // 1234
        // 12345
    public void pattern16(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    // Pattern ZOHO

    // *****  *****  *   *  *****
    //    *   *   *  *   *  *   *
    //   *    *   *  *****  *   *
    //  *     *   *  *   *  *   *
    // *****  *****  *   *  *****
    
    public void patternZOHO(int n){
        for(int i = 0; i < n; i++){
            // Pattern Z
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || i + j == n - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Pattern O
            if(i == 0 || i == n - 1){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 1; j < n - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("  ");

            // Pattern H
            if(i == n / 2){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 1; j < n - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("  ");

            // Pattern O
            if(i == 0 || i == n - 1){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 1; j < n - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            patterns p = new patterns();
            p.patternZOHO(5);
    }
}
