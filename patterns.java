public class patterns { //   *****
//    *****
//    *****
//    *****
//    *****
    public void  pattern1(int n) {
        for (int i = 0; i < n; i++) {
           for(int j = 0; j< n; j++ ){
               System.out.print("*");
           }
           System.out.println();
        }
        return ;

    }

    public static void main(String[] args) {
            patterns p = new patterns();
            p.pattern1(5);
    }
}
