class Faktorial26 {

    public int nilai;
    
    public int faktorialBF(int nilai) {
        int fakto = 1;
        for (int i = 1; i <= nilai; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }
    
    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}