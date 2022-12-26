/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmahasiswasederhana.models;

/**
 * @author Nicodemus
 * 21103077
 * SIS105C
 */
public class Mahasiswa {
    private String nim,nama,alamat;
    
public Mahasiswa(){}
    
public Mahasiswa(String nim,String nama, String alamat){
    this.nim = nim;
    this.nama = nama;
    this.alamat = alamat;
}

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNim() {
        return nim;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

 

}
