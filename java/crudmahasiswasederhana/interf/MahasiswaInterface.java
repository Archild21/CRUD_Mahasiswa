/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudmahasiswasederhana.interf;

import java.sql.SQLException;
import java.util.List;
import crudmahasiswasederhana.models.Mahasiswa;

/**
 * @author Nicodemus
 * 21103077
 * SIS105C
 */
public interface MahasiswaInterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    
    void update(Mahasiswa o) throws SQLException;
    
    void dalete(String nim) throws SQLException;
    
    List<Mahasiswa> getAll() throws SQLException;
}
