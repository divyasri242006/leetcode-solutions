// Last updated: 2/7/2026, 11:47:09 AM
1class Solution {
2    public int minimumDeletions(String s) {
3     int countB=0;
4     int deletions=0;
5     for(char ch:s.toCharArray()){
6        if(ch=='b'){
7            countB++;
8        }
9        else{
10            deletions=Math.min(deletions+1,countB);
11        }
12     }   
13     return deletions;
14    }
15    }
16