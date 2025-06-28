package Arrays;

public class Spiral {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}
        };
        int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        while (top<=bottom && left<=right){
            for (int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            System.out.println();
            for (int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            System.out.println();
            if(top<=bottom){
                for (int i=right;i>=left;i--)
                {
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            System.out.println();
           if(left<=right) {
               for (int i = bottom; i >= top; i--) {
                   System.out.print(matrix[i][left] + " ");
               }
           }
            left++;
        }
        System.out.println();
    }
}
