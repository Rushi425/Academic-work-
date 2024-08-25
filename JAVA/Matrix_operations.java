import java.util.Scanner;

class Arithmetic {
    int[][] m1 = new int[3][3];
    int[][] m2 = new int[3][3];
    int[][] r = new int[3][3];
    Scanner sc = new Scanner(System.in);

    void getMatrix() {
        System.out.println("Enter matrix1 elements :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix2 elements :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        System.out.println("Matrix 1 is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
    }

    void add() {
        System.out.println("Addition of two matrix is :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
    void sub() {
        System.out.println("Substraction of two matrix is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r[i][j] = m1[i][j] - m2[i][j];
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
    void mul() {
        System.out.println("Multiplication of two matrix is :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r[i][j] = 0;
                for(int k = 0; k < 3; k++){
                     r[i][j] += m1[i][k] * m2[k][j];
                    
                } System.out.print(r[i][j] + " ");
                    
             }System.out.println();
         }  
     }
}

public class Matrix_operations {
    public static void main(String[] args) {
        Arithmetic ob = new Arithmetic();
        ob.getMatrix();
        ob.display();
        ob.add();
        ob.sub();
        ob.mul();
    }
}
