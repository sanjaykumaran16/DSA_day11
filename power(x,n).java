class Solution {
    public double myPow(double x, int n1) {
        double ans=1.0;
        long n=n1;
        if(n<0){
            n=-n;
        }
        while(n>0){
            if(n%2==0){
                x=x*x;
                n/=2;
            }
            else{
                ans=ans*x;
                n-=1;
            }
        }
        if(n<0){
            ans=(double)(1.0/ans);
        }
        return ans;
    }
}
