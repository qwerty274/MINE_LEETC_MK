class Solution {
    public int reverseDegree(String s) {
        int t=0;
        int posStar=0;
        int posRev=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
             posStar =i+1;
             posRev=26-(ch-'a');
           t=t+(posRev*posStar);  
        }
       
        return t;
    }
}