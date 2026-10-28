class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        int a=0;
        int b=0;
        while(a<t.length && b<p.length){
            if(t[a]>=p[b]){
                
                b++;
            }
             a++;
            }
        
        return b;
    }
}