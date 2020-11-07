/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan35.programtunjangan;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBO210119066Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User karyawan = new User();
        System.out.println("=======Program Tunjangan======");
        Double gajipokokKaryawan = karyawan.getGajipokok();
        String statusKaryawan = karyawan.getStatus();
    Double tunjanganKaryawan = karyawan.hitungTunjangan(statusKaryawan);
    Double totalGaji = karyawan.setTotal();
    System.out.println("\n======Hasil Perhitungan Gaji Anda=====");
    System.out.printf("Gaji Pokok\t\t: Rp %.1f%n" ,gajipokokKaryawan);
    System.out.printf("Tunjangan\t\t: Rp %.1f%n" ,tunjanganKaryawan);
    System.out.printf("Total Gaji\t\t: Rp %.1f%n" ,totalGaji);
    }
    
}
