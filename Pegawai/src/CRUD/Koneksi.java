/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
/**
 *
 * @author dr. Yoe
 */
public class Koneksi {
    String url = "jdbc:mysql://localhost:3306/2210010459";
    String user = "root";
    String password = "";
    public static Connection koneksidb;

    public Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (koneksidb == null || koneksidb.isClosed()) {
                koneksidb = DriverManager.getConnection(url, user, password);
                System.out.println("Database Terkoneksi");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL LOKASI START -------
    
    public void simpanAbsensi(String tempId, String tempNip, String tempTanggal, String tempStatus, String tempKeterangan) {
        try {
            String sql = "INSERT INTO absensi (id, nip, tanggal, status) VALUES (?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNip);
            perintah.setString(3, tempTanggal);
            perintah.setString(4, tempStatus);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahAbsensi(String tempId, String tempNip, String tempTanggal, String tempStatus, String tempKeterangan) {
        try {
            String sql = "UPDATE absensi SET id = ?, nip = ?, tanggal = ? WHERE status = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNip);
            perintah.setString(3, tempTanggal);
            perintah.setString(4, tempStatus);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusAbsensi(String tempStatus) {
        try {
            String sql = "DELETE FROM absensi WHERE status = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempStatus);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL ABSENSI END -------
    
    
    
    //TABEL PEGAWAI KONTRAK START -------
    
    public void simpanPegawai_Kontrak(String tempId, String tempNama, String tempAlamat, String tempTgl_lahir, String tempPendidikan, String tempProg_studi, String tempTahun_lulus, String tempJabatan, String tempTgl_sk, String tempFoto) {
        try {
            String sql = "INSERT INTO pegawai_kontrak (id, nama, alamat, tgl_lahir, pendidikan, prog_studi, tahun_lulus, jabatan, tgl_sk, foto) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempAlamat);
            perintah.setString(4, tempTgl_lahir);
            perintah.setString(5, tempPendidikan);
            perintah.setString(6, tempProg_studi);
            perintah.setString(7, tempTahun_lulus);
            perintah.setString(8, tempJabatan);
            perintah.setString(9, tempTgl_sk);
            perintah.setString(10, tempFoto);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPegawai_Kontrak(String tempId, String tempNama, String tempAlamat, String tempTgl_lahir, String tempPendidikan, String tempProg_studi, String tempTahun_lulus, String tempJabatan, String tempTgl_sk, String tempFoto) {
        try {
            String sql = "UPDATE pegawai_kontrak set id = ?,nama = ?, alamat = ?, tgl_lahir = ?, pendidikan = ?, prog_studi = ?, tahun_lulus = ?, jabatan = ?, foto = ? where = tgl_sk ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempAlamat);
            perintah.setString(4, tempTgl_lahir);
            perintah.setString(5, tempPendidikan);
            perintah.setString(6, tempProg_studi);
            perintah.setString(7, tempTahun_lulus);
            perintah.setString(8, tempJabatan);
            perintah.setString(9, tempFoto);
            perintah.setString(10, tempTgl_sk);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPegawai_Kontrak(String tempTgl_sk){
        try {
            String sql = "DELETE from pegawai-kontrak WHERE tgl_sk = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempTgl_sk);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL PEGAWAI KONTRAK END -------
    
    
    
    //TABEL PEGAWAI PNS START -------
    
    public void simpanPegawai_Pns(String tempId, String tempNama, String tempAlamat, String tempNip, String tempPangkat, String tempJabatan, String tempUnit_organisasi, String tempFoto){
        try {
            String sql = "INSERT INTO petani (id, nama, alamat, nip, pangkat, jabatan, unit_organisasi, foto) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempAlamat);
            perintah.setString(4, tempNip);
            perintah.setString(5, tempPangkat);
            perintah.setString(6, tempJabatan);
            perintah.setString(7, tempUnit_organisasi);
            perintah.setString(8, tempFoto);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPegawai_Pns (String tempId, String tempNama, String tempAlamat, String tempNip, String tempPangkat, String tempJabatan, String tempFoto, String tempUnit_organisasi ){
        try {
            String sql = "UPDATE petani SET id = ?, nama = ?, alamat = ?, nip, pangkat = ?, jabatan = ?, foto = ? WHERE unit_organisasi = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempAlamat);
            perintah.setString(4, tempNip);
            perintah.setString(5, tempPangkat);
            perintah.setString(6, tempJabatan);
            perintah.setString(7, tempFoto);
            perintah.setString(8, tempUnit_organisasi);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPgawai_Pns (String tempUnit_organisasi){
        
        try {
            String sql = "DELETE FROM pegawai_pns WHERE unit_organisasi = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempUnit_organisasi);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //TABEL PEGAWAI PNS END -------
    
    
    
    //TABEL PROFIL START -------
    
    public void simpanProfil (String tempId, String tempFoto, String tempIsi){
        try {
        String sql = "INSERT INTO profil (id, foto, isi) values (?,?,?)";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempId);
        perintah.setString(2, tempFoto);
        perintah.setString(3, tempIsi);;
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPenyuluh (String tempId, String tempFoto, String tempIsi){
        try {
        String sql = "UPDATE profil SET id = ?, foto = ? WHERE isi = ?";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempId);
        perintah.setString(2, tempFoto);
        perintah.setString(3, tempIsi);;
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusProfil (String tempIsi){
        try {
        String sql = "DELETE FROM profil WHERE isi = ?";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempIsi);
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL PROFIL END -------
}

