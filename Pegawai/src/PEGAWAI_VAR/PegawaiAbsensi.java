/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEGAWAI_VAR;

/**
 *
 * @author dr. Yoe
 */
public class PegawaiAbsensi {
    private String id;
    private String nip;
    private String tanggal;
    private String status;

    public PegawaiAbsensi(String id, String nip, String tanggal, String status) {
        this.id = id;
        this.nip= nip;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
