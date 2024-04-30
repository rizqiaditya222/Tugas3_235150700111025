public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomis(komisi);
    }

    public int getPenjualan (){
        return penjualan;
    }

    public double getKomisi (){
        return komisi;
    }

    public void setPenjualan (int penjualan){
        this.penjualan = penjualan;
    }

    public void setKomis (double komisi){
        this.komisi = komisi;
    }

    public double gaji(){
        return getKomisi()*getPenjualan();
    }

    public String toString(){
        return String.format("Pegawai Harian\t:%s\nTotal Penjualan : %d\nBesaran Komisi\t: %.1f\nPendapatan\t: Rp %.0f",super.toString(), getPenjualan(), getKomisi(), gaji());
    }
}