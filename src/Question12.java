public class Question12 {
    public static void main(String[] args) {
        int n =5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int z=1; z<=i*2-1; z++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
