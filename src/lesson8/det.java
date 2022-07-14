package lesson8;

public class det {

        public static double[][] reduce(int row , int column , double[][] mat){
            int n=mat.length;
            double[][] res = new double[n- 1][n- 1];
            int r=0,c=0;
            for (int i = 0; i < n; i++) {
                c=0;
                if(i==row)
                    continue;
                for (int j = 0; j < n; j++) {
                    if(j==column)
                        continue;
                    res[r][c] = mat[i][j];

                    c++;
                }
                r++;
            }
            return res;
        }

        public static double det(double mat[][]){
            int n = mat.length;
            if(n==1)
                return mat[0][0];
            if(n==2)
                return mat[0][0]*mat[1][1] - (mat[0][1]*mat[1][0]);
            //TODO : do reduce more efficiently
            double[][] m11 = reduce(0,0,mat);
            double[][] m1n = reduce(0,n-1,mat);
            double[][] mn1 = reduce(n-1 , 0 , mat);
            double[][] mnn = reduce(n-1,n-1,mat);
            double[][] m11nn = reduce(0,0,reduce(n-1,n-1,mat));
            return (det(m11)*det(mnn) - det(m1n)*det(mn1))/det(m11nn);
        }

        public static double[][] randomMatrix(int n , int range){
            double[][] mat = new double[n][n];
            for (int i=0; i<mat.length; i++) {
                for (int j=0; j<mat[i].length; j++) {
                    mat[i][j] = (int) (Math.random()*range);
                }
            }
            return mat;
        }

        public static void main(String[] args) {

            double[][] mat =  randomMatrix(4,100);
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(det(mat));
        }

}
