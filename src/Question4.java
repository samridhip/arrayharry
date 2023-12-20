public class Question4 {
    public static void main(String[] args) {
        int[][] mat1={{1,2,3},{3,2,1}};
        int[][] mat2={{5,6,7},{3,8,9}};
        int [][] mat3={{0,0,0},{0,0,0}};
        int i;
        for(i=0;i<mat1.length;i++){
            for(int j=0;j< mat1.length;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.format("Setting value for i=%d and j=%d\n",i,j);

            }
        }
    }
}
