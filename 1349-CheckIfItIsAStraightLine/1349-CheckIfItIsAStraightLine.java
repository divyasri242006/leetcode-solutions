// Last updated: 2/4/2026, 1:17:35 PM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        
        for (int i = 2; i < coordinates.length; i++) {
            int x3 = coordinates[i][0], y3 = coordinates[i][1];
            
            // Cross multiplication to avoid division
            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                return false;
            }
        }
        return true;
    }
}