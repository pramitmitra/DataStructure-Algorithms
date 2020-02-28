public class MDimArray {

    public static void main(String args[])
    {
        int [][][][] cube =new int [3][3][3][3]; int p=0;
        for (int i=0; i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                for (int k=0;k<3;k++)
                {
                    for (int l=0;l<3;l++)
                    {
                        cube[i][j][k][l] = p;
                        p++;
                        System.out.printf("cube[%d][%d][%d][%d] => %d\n", i, j,k,l, cube[i][j][k][l]);
                    }
                }
            }
        }
    }
}
