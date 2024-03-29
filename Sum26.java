public class Sum26 {
    
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum26(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        } 
        return Double.parseDouble(String.format("%.2f", total));
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r)
            return arr[l];
        else if (l < r){
            int mid = (l+r)/2;
            double lsum=totalDC(arr,l, mid-1);
            double rsum=totalDC(arr, mid+1, r);
            return Double.parseDouble(String.format("%.2f", lsum + rsum + arr[mid]));
        }
        return 0;
    }
}