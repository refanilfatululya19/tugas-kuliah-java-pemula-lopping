public class codinganrefa4 {
    public static void main(String[] args) {
        int[] scores = {80, 70, 90, 60};

        //kode asli (salah): i <= scores.length -> ArrayIndexOutOfBoundsException
        // kode asli (salah): total/scores.length -> pembagian integer

        //perbaikan
        if (scores.length == 0) {
            System.out.println("Array kosong, rata-rata tidak dapat dihitung");
            return;
        }
        int total = 0;
        for (int i = 0; i < scores.length; i++) { // pakai < bukan <=
            total += scores[i];
        }
        double average = (double) total / scores.length; // cash ke double
        System.out.println("total: " + total);
        System.out.println("rata-rata: " + average);
        //demo : kenapa cast ke double penting (total tidak habis di bagi)

        int[] data = {80, 70, 90, 65};
        int sum = 0;
        for (int x : data) sum += x;

        double salah = sum / data.length; //305 / 4 = 76 -> 76.0
        double benar = (double) sum / data.length; // 76.25
        System.out.println("\nDemo data {80, 70, 90, 65}");
        System.out.println("tanpa cast: " + salah);
        System.out.println("dengan cast :" + benar);

        //demo: hanya mengubah total menjadi double tidak cukup jika loop masih <=
        //program tetap crash di scores[4]

    }
}
