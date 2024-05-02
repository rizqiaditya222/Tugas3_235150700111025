public class Main {
    public static void main(String[] args) {
        PegawaiTetap PegawaiTetap1 = new PegawaiTetap("Tony", "90182398136", 5000000);
        PegawaiTetap PegawaiTetap2 = new PegawaiTetap("Dafi", "98656789876", 4500000);
        PegawaiTetap PegawaiTetap3 = new PegawaiTetap("Zaidan", "987656789656", 3000000);

        System.out.println(PegawaiTetap1+"\n");
        System.out.println(PegawaiTetap2+"\n");
        System.out.println(PegawaiTetap3+"\n");

        PegawaiHarian PegawaiHarian1 = new PegawaiHarian("Andre", "911", 5000, 42);
        PegawaiHarian PegawaiHarian2 = new PegawaiHarian("Damai", "6285228118284", 7000, 36);
        PegawaiHarian PegawaiHarian3 = new PegawaiHarian("Arya", "6282226195571",3000, 40);

        System.out.println(PegawaiHarian1+"\n");
        System.out.println(PegawaiHarian2+"\n");
        System.out.println(PegawaiHarian3+"\n");

        Sales Sales1 = new Sales("Panjul", "987654569", 30, 5000);
        Sales Sales2 = new Sales("Tiyan", "345678987", 27, 4500);
        Sales Sales3 = new Sales("Angga", "5476678989", 47, 4700);

        System.out.println(Sales1+"\n");
        System.out.println(Sales2+"\n");
        System.out.println(Sales3+"\n");
       

    }
}

