public class Algoritmo4 {
    public static void main(String[] args) {
        for(long i = 0; i<100; ++i){
            System.out.println(i+" "+f(i));
        }
    }


    public static int f( long n ) {
        long i, j, k, res = 0;
        int cont_op = 0;
        for( i = n; i <= n*n; i += 2 ) {
            for( j = n+1; j <= n*n; j += 2 ) {
                for( k = j; k <= 2*j; k += 2 ) {
                    res = res + 1;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }
}
