//Find the Pivot Integer
class pivot {
        public int pivotInteger(int n) {
            int sum = (n*(n+1))/2;
            int check = 0;
            if(n==1)return 1;
            for(int i = 1;i<=n;i++){
                check=check+i;
                if(2*check == sum + i ){
                    return i;
                }
            }
            return -1;
        }
    }
}
