class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int r=0;
        int last=Integer.MIN_VALUE;
        for(int[]interval : intervals){
            if(last<=interval[0]){
                r++;
                last=interval[1];
            }
        }
        return n-r;
    }
}