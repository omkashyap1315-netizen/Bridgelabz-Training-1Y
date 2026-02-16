package com.gla.classesobjects.level3;

public class MatrixAdvanced {

    // 1. Create random matrix
    public static double[][] create(int r, int c) {

        double[][] m = new double[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j] = (int)(Math.random()*9)+1; // 1 to 9
            }
        }
        return m;
    }

    // 2. Display matrix
    public static void show(double[][] m){

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 3. Transpose
    public static double[][] transpose(double[][] m){

        int r = m.length;
        int c = m[0].length;

        double[][] t = new double[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    // 4. Determinant 2x2
    public static double det2(double[][] m){
        return (m[0][0]*m[1][1]) - (m[0][1]*m[1][0]);
    }

    // 5. Determinant 3x3
    public static double det3(double[][] m){

        double d =
                m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                        - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                        + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        return d;
    }

    // 6. Inverse 2x2
    public static double[][] inverse2(double[][] m){

        double det = det2(m);

        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] =  m[0][0]/det;

        return inv;
    }

    // 7. Inverse 3x3 (Adjoint method)
    public static double[][] inverse3(double[][] m){

        double det = det3(m);
        double[][] inv = new double[3][3];

        inv[0][0]=(m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1]=(m[0][2]*m[2][1]-m[0][1]*m[2][2])/det;
        inv[0][2]=(m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0]=(m[1][2]*m[2][0]-m[1][0]*m[2][2])/det;
        inv[1][1]=(m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2]=(m[0][2]*m[1][0]-m[0][0]*m[1][2])/det;

        inv[2][0]=(m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1]=(m[0][1]*m[2][0]-m[0][0]*m[2][1])/det;
        inv[2][2]=(m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return inv;
    }

    public static void main(String[] args) {

        // ---------- 3x3 MATRIX ----------
        double[][] A = create(3,3);

        System.out.println("Original Matrix:");
        show(A);

        System.out.println("\nTranspose:");
        show(transpose(A));

        System.out.println("\nDeterminant (3x3): " + det3(A));

        System.out.println("\nInverse (3x3):");
        show(inverse3(A));

        // ---------- 2x2 MATRIX ----------
        double[][] B = create(2,2);

        System.out.println("\n\n2x2 Matrix:");
        show(B);

        System.out.println("\nDeterminant (2x2): " + det2(B));

        System.out.println("\nInverse (2x2):");
        show(inverse2(B));
    }
}

