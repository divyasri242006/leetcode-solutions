// Last updated: 2/4/2026, 1:16:55 PM
class Solution {
    public String winningPlayer(int x, int y) {
        // Calculate maximum possible turns
        int turns = Math.min(x, y / 4);
        
        // Odd turns → Alice wins, Even turns → Bob wins
        if (turns % 2 == 1) {
            return "Alice";
        } else {
            return "Bob";
        }
    }
}
