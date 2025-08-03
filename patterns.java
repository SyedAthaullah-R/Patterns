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
    // Pattern 17
    // 1
    // 32
    // 654
    // 87
    // 9
    public void pattern17(int n){
        int count = 1;
        for(int i = 0; i <= n / 2; i++){
            int end = count + i;
            for(int j = end; j >= count; j--){
                System.out.print(j);
            }
            count = end + 1;
            System.out.println();
        }
        for(int i = (n / 2) + 1; i < n; i++){
            int len = n - i;
            int end = count + len - 1;
            for(int j = end; j >= count; j--){
                System.out.print(j);
            }
            count = end + 1;
            System.out.println();
        }
    }
    // Pattern 18
    // 1
    // 23
    // 456
    // 78910
    public void pattern18(int n){
        int count = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(count++);
            }
            System.out.println();
        }
    }
    // Pattern 19
    // 10987
    // 654
    // 32
    // 1
    public void pattern19(int n){
        int count = (n * (n + 1)) / 2;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print(count--);
            }
            System.out.println();
        }
    }
    // Pattern 20
    // 10987
    // 654
    // 32
    // 1
    // 23
    // 456
    // 78910
    public void pattern20(int n){
        int count = (n * (n + 1)) / 2;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print(count--);
            }
            System.out.println();
        }
        count += 2;
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(count++);
            }
            System.out.println();
        }
    }
    // Pattern 21
    // 1
    // 21
    // 321
    // 4321
    // 54321
    public void pattern21(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j >= 0; j--){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
    // Pattern 22
    //     1
    //    121
    //   12321
    //  1234321
    // 123454321
    public void pattern22(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(j + 1);
            }
            for(int j = i - 1; j >= 0; j--){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
    // Pattern 23
    //     A
    //    ABA
    //   ABCBA
    //  ABCDCBA
    // ABCDEDCBA
    public void pattern23(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print((char) (65 + j));
            }
            for(int j = i - 1; j >= 0; j--){
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
    // Pattern 24
    //     A
    //    ABC
    //   ABCDE
    //  ABCDEFG
    // ABCDEFGHI
    //  ABCDEFG
    //   ABCDE
    //    ABC
    //     A
    public void pattern24(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * (n - i) - 1; j++){
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
    // Pattern 25
    // ***** *****
    // ****   ****
    // ***     ***
    // **       **
    // *         *
    // **       **
    // ***     ***
    // ****   ****
    // ***** *****
    public void pattern25(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print(" ");
            }
            for(int j = i; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2 * (n - i) - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Pattern 26
    //     *
    //    * *
    //   *   *
    //  *     *
    // *       *
    //  *     *
    //   *   *
    //    * *
    //     *
    public void pattern26(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n - 1; j++){
                System.out.print(" ");
            }
            if(i == 0){
                for(int j = 0; j <= i; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 0; j < 2 * i - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i - 1; j++){
                System.out.print(" ");
            }
            if(i == n - 1){
                for(int j = i; j < n; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 0; j < 2 * (n - i) - 3; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
            patterns p = new patterns();
            p.pattern26(5);
    }
}
