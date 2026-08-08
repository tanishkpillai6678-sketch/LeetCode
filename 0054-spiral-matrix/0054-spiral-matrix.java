class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length,n=matrix[0].length;
        int fstrow=0,lstrow=m-1,fstcol=0,lstcol=n-1;
        while(fstrow<=lstrow && fstcol<=lstcol){
            for(int j=fstcol;j<=lstcol;j++){
                list.add(matrix[fstrow][j]);
            }
            fstrow++;
            for(int i=fstrow;i<=lstrow;i++){
                list.add(matrix[i][lstcol]);
            }
            lstcol--;
            if(fstrow<=lstrow){
                for(int j=lstcol;j>=fstcol;j--){
                    list.add(matrix[lstrow][j]);
                }
                lstrow--;
            }
            if(fstcol<=lstcol){
                for(int i=lstrow;i>=fstrow;i--){
                    list.add(matrix[i][fstcol]);
                }
                fstcol++;
            }
        }
        return list;
    }
}