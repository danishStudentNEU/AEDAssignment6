package edu.neu.mgen;

public class App 
{

    public static void main( String[] args )
    {
        int A[][] = {{2,3,4},{3,4,5}};
        int B[][]= {{1,2},{3,4},{5,6}};

        int i,j;

        int row1 = A.length;
        int column1 = A[0].length;
        int row2 = B.length;
        int column2= B[0].length;


        if(column1 == row2){
            System.out.println("Multiplication is possible");
            System.out.println("The resultant matrix will have "+row1 + "X"+column2+" dimension");

            int c[][] = new int[row1][column2];

            for(i=0;i<row1;i++){
                for(j=0;j<column2;j++){
                    c[i][j]=0;
                    for(int k=0;k<row1;k++){
                        c[i][j] +=A[i][k] * B[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
            System.out.println();
            }
        }

        else {
            System.out.println("Multiplication not possible");
        }
    }
}
