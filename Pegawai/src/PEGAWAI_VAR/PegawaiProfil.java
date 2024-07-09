/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PEGAWAI_VAR;

/**
 *
 * @author dr. Yoe
 */
public class PegawaiProfil {
    private String id;
    private String foto;
    private String isi;
  

    public PegawaiProfil(String id, String foto, String isi) {
        this.id = id;
        this.foto= foto;
        this.isi = isi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
