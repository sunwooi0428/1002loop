public class Question10 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            /*
            1=1
            2=3
            3=5 3*2-1
            4=7 4*2-1
            5=9 5*2-1
            10=19 10*2-1
            * */
            for(int k=1; k<= i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}