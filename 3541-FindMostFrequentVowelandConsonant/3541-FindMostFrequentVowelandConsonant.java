// Last updated: 2/7/2026, 7:02:03 PM
1class Solution {
2    public int canBeTypedWords(String text, String brokenLetters) {
3        boolean[]broken=new boolean[26];
4        for (char ch:brokenLetters.toCharArray()){
5            broken[ch-'a']=true;
6        }
7        int count=0;
8        String[]words=text.split(" ");
9        for(String word:words){
10            boolean canType=true;
11            for(char ch:word.toCharArray()){
12                if(broken[ch-'a']){
13                    canType=false;
14                    break;
15                }
16            }
17            if(canType){
18                count++;
19            }
20    }
21    return count;
22}
23}