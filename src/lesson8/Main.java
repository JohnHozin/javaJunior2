package lesson8;

public class Main {
    public static void main(String[] args) {

        Matrix m = new Matrix(4, 7);
        Matrix p = new Matrix(4, 7);
        Matrix s = new Matrix( 7,3);
        Matrix n = new Matrix( 7,3);
        Matrix s1 = new Matrix( 3,3);


//        m.fillMatrix(3);
//        m.printToConsole();

        s1.fillMatrix(2);
        s1.printToConsole();



//        IMatrix add1 = m.add(p);
//        add1.printToConsole();
//
//        IMatrix sub1 = m.sub(p);
//        sub1.printToConsole();
//
//        s.fillMatrix(5);
//        s.printToConsole();
//
//        IMatrix mul = m.mul(s);
//        mul.printToConsole();
//
//        IMatrix mulN1 = s.mul(2);
//        mulN1.printToConsole();
//
//        IMatrix tr = s.transpose();
//        tr.printToConsole();
//
//        n.setValueAt(1,1,2);
        s1.setValueAt(0,0,1);
        s1.setValueAt(1,1,3);
        s1.setValueAt(2,2,5);

        s1.printToConsole();

        //double k = m.determinant();

        System.out.println(s1.determinant());

//        s1.printToConsole();
//        System.out.println(s1.isIdentityMatrix());
//        System.out.println(s.isIdentityMatrix());
//
//        System.out.println(n.isNullMatrix());
//        System.out.println(s1.isSquareMatrix());
//        System.out.println(n.isSquareMatrix());












//        double b = 0;
//        for (int i = 0; i < m.getRows(); i++) {
//            for (int j = 0; j < m.getColumns(); j++) {
//                m.setValueAt(i, j, 1);
//                System.out.print(m.getValueAt(i, j) + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//
//        for (int i = 0; i < p.getRows(); i++) {
//            for (int j = 0; j < p.getColumns(); j++) {
//                p.setValueAt(i, j, 2);
//                System.out.print(p.getValueAt(i, j) + " ");
//            }
//            System.out.println();
//        }

        System.out.println();
        System.out.println();

//        for (int i = 0; i < sum.getRows(); i++) {
//            for (int j = 0; j < sum.getColumns(); j++) {
//                //summ.setValueAt(i, j, 3);
//                System.out.print(sum.getValueAt(i, j) + " ");
//            }
//            System.out.println();
//        }


//        double i = m.getValueAt(4, 9);
//        if (i == -1) {
//            System.out.println("Массив вышел за границы");
//            return;
//        }
//
//        m.setValueAt(3, 8, 15);
//        double val = m.getValueAt(3, 8);
//        if (val == -1) {
//            System.out.println("Массив вышел за границы");
//            return;
//        } else {
//            if (val == 15) {
//                System.out.println("save");
//            } else {
//                System.out.println("not save");
//            }
//
//        }
//        m.add(p);


    }
}
