class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i=1; i<=num;i++){
            int sum =0;
            for(int x =i; x>0 ; x /=10){
                sum = sum+ x%10;
            }
            if(sum %2 == 0){
                count++;
            }
        }
        return count;
    }
}