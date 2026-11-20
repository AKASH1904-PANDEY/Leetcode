class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] m = new int[row];
        for (int i = 0; i < row; i++) {
            m[i] = triangle.get(row - 1).get(i);
        }
        for (int r = row-2; r >= 0; r--) {
            for (int c = 0; c <= r; c++) {
                m[c] = Math.min(m[c], m[c+1]) + triangle.get(r).get(c);
            }
        }

        return m[0];
    }
}