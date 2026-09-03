class Solution {
    public void rotate(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<i; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int row = 0; row<m; row++)
        {
            int i = 0;
            int j = m-1;
            while(i<j)
            {
                int temp = arr[row][i];
                arr[row][i] = arr[row][j];
                arr[row][j] = temp;
                i++;
                j--;
            }
        }
    }
}