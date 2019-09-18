import java.util.ArrayList;
import java.util.Scanner;

public class CollegeStudentData {
    static String[][] biodata;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Mahasiswa (Min. 5) :");
        int jumlah = input.nextInt();
        biodata = new String[jumlah][6];
        if (jumlah >= 5) {
            isiData();
            tampilData();
        } else {
            System.out.println("Minimal data mahasiswa adalah 5");
        }
    }

    static void isiData() {
        ArrayList hobi = new ArrayList();
        for (int i = 0; i < biodata.length; i++) {
            System.out.println("==========Mahasiswa " + (i + 1) + "==========");
            for (int j = 0; j < biodata[i].length; j++) {
                if (j == 0) {
                    System.out.print("Masukkan Nama :");
                    biodata[i][j] = input.next();
                } else if (j == 1) {
                    System.out.print("Masukkan Alamat :");
                    biodata[i][j] = input.next();
                } else if (j == 2) {
                    System.out.print("Masukkan Umur :");
                    biodata[i][j] = input.next();
                } else if (j == 3) {
                    System.out.print("Masukkan Jenis Kelamin(L/W) :");
                    biodata[i][j] = input.next();
                } else if (j == 4) {
                    System.out.print("Masukkan Hobi (min.3):\n");
                    hobi.clear();
                    for (int k = 0; k < 3; k++) {
                        System.out.print("Hobi " + (k + 1) + ":");
                        hobi.add(input.next());
                    }
                    biodata[i][j] = String.valueOf(hobi);
                } else if (j == 5) {
                    System.out.print("Masukkan IPK :");
                    biodata[i][j] = input.next();
                }
            }
        }
        /*
         * [0]Nama : Ahmad Nizar
         * [1]Alamat : Lombok
         * [2]Umur : 19 tahun
         * [3]JK : Laki-laki
         * [4]Hobi : ngaji,ngopi,ngoding // 3 hobi untuk satu orang
         * [5]ipk : 5.00*/
    }

    static void tampilData() {
        System.out.println("\nNama\t\tAlamat\t\tUmur\tJK\t\tHobi\t\t\t\t\t\tIpk");
        for (int i = 0; i < biodata.length; i++) {
            System.out.println();
            for (int j = 0; j < biodata[i].length; j++) {
                System.out.print(biodata[i][j]);
                System.out.print("\t\t");
            }
        }
    }
}

/*
outputs :

Nama		Alamat		Umur    JK		Hobi					Ipk

Ahmad		Lombok		19		L		[Ngaji, Ngopi, Ngoding]		3.75		
Novita		Jawa		18		W		[Ngoding, Baca, Ngaji]		4.00		
Fahri		GKidul		20		L		[Motor, Ngaji, Ngoding]		3.50		
Nanang		Sulsel		21		L		[Ngoding, Ngoding, Ngoding]	3.80		
indah		Papua		30		W		[Masak, Tidur, Ngoding]		3.35	
*/
