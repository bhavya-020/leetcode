class Solution {
    public List<String> cellsInRange(String s) {

        List<String> ans = new ArrayList<>();

        for(char  i = s.charAt(0) ; i<=s.charAt(3);i++){
            String ss ="";

            for(char j = s.charAt(1) ; j<=s.charAt(4) ;j++){
                ss = "" + i+j;
                ans.add(ss);
                ss = "";
            }
        }
        return ans;

    }
}