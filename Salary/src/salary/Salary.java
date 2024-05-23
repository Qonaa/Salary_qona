/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salary;
import penggajian.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author dr. Yoe
 */
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        karyawan obj = new karyawan();
        
        obj.inputNIKS("1001");
        obj.inputNIKS("1002");
        obj.inputNIKS("1003");
        obj.inputNIKS("1004");
        obj.inputNIKS("1004");
        
            
            System.out.println("Nilai Array List"+obj.ambilNIKS().get(4));
    
       
        /*String [] nama = new String[3];
        nama[0]="ANITA";
        nama[1]="AGUS";
        nama[2]="RINA";
        
        System.out.println("Panjang Array"+nama.length);
        
            for (int i = 0; i < nama.length; i++){
            System.out.println("Nama:"+nama[i]);
            }
        
        ArrayList<String> bulan = new ArrayList<>();
        bulan.add("Januari");
        bulan.add("Februari");
        bulan.add("Maret");
        bulan.add("April");
        System.out.println("Panjang Array List"+bulan.size());
            for (int i = 0; i < nama.length; i++){
            System.out.println("Nama:"+nama[i]);
            }
        
        bulan.remove(1);
        System.out.println("Panjang Array List"+bulan.size());
        
        int[] tahun = new int[4];
        tahun[0]=2020;
        tahun[1]=2021;
        tahun[2]=2022;
        tahun[3]=2024;
        tahun[4]=2025;
        
        ArrayList<Integer> umur = new ArrayList<>();
        ArrayList<Double> berat = new ArrayList<>();
*/

        //karyawan saya = new karyawan();
        //Scanner input = new Scanner(System.in);
        
        //System.out.print("Masukan NIK Pegawai :");
        //saya.inputNIK(input.nextLine());
        //System.out.print("Masukan Nama Pegawai :");
        //saya.inputNAMA(input.nextLine());
        //System.out.print("Masukan Telp Pegawai :");
        //saya.inputTELP(input.nextLine());
        //System.out.print("Masukan Alamat Pegawai :");
        //saya.inputALAMAT(input.nextLine());
        //System.out.print("Masukan Golongan Pegawai :");
        //saya.inputGolongan(input.nextLine());
        //System.out.print("Masukan Status Nikah(Menikah/Belum)Pegawai :");
        //saya.inputStatusNikah(input.nextLine());
        
       //if(saya.getStatus().equals("Menikah")){
         //  System.out.print("Masukan Jumlah Anak Pegawai :");
           //saya.inputJumlahAnak(input.nextInt());
       //}else{
         //  saya.inputJumlahAnak(0);
       //}
       
       //System.out.print("Masukan Masa Kerja Pegawai :");
       //saya.inputMasaKerja(input.nextInt());
       //System.out.println("======================================");
       //System.out.println("Gaji Total Diterima : "+saya.gajiTotal());
    }
    
}
