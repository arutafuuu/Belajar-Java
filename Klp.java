import java.util.Scanner; //Import scanner untuk menggunakan fungsi input

class Klp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Deklarasi Scanner dengan nama input
        System.out.print("Masukkan input kalimat : "); //print keterangan mengenai inputan
        String kalimat = input.nextLine(); //Deklarasi string sekaligus perintah input
        input.close(); //menutup scanner

        String[] kata = kalimat.split(" "); //Deklarasi Array dengan nama kata. anggotanya adalah inputan yang dipisah-pisahkan oleh spasi(" ") 
        int hitung; //Deklarasi variabel sebagai hitung
         
        for (int i = 0; i < kata.length; i++) { //perulangan pertama, untuk memanggil index "array kata" satu persatu
            hitung = 1; //Penetapan nilai awal banyak index "array kata" adalah 1

            for(int j = i+1; j < kata.length; j++){ //perulangan kedua persiapan pemeriksaan banyak nilai yang sama antar index satu dan index lainnya

                if(kata[i].equals(kata[j])){ //pemeriksaan nilai antar index
                    hitung ++; //jika terdapat nilai yang persis sama maka nilai hitung akan ditambahakan
                    kata[j]="none"; //penetapan dan penggantian nilai sebagai none.
                }
            }
            if(kata[i]!= "none"){ //perintah agar index dengan nilai "none" tidak di print
                if (hitung > 1) { //index dengan jumlah muncul lebih dari 1 akan di print dengan keterangan jumlah
                    System.out.println(kata[i]+" x"+hitung);
                }
                else {//index dengan jumlah perulangan 1 di print tanpa keterangan jumlah
                    System.out.println(kata[i]);
                }
                
            }
        }
    }
}