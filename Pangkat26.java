public class Pangkat26 {

    int nilai;
    int pangkat;

    public Pangkat26() {
        
    }
    

    public int pangkatBF(int nilai, int pangkat) {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    public int pangkatDC(int nilai, int pangkat) {
        if (pangkat == 0)
            return 1;
        else {
            int temp = pangkatDC(nilai, pangkat / 2);
            if (pangkat % 2 == 0)
                return temp * temp;
            else
                return nilai * temp * temp;
        }
    }
}