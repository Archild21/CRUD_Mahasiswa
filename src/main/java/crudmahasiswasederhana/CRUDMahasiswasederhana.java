/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package crudmahasiswasederhana;

import crudmahasiswasederhana.views.FrameMahasiswa;
import javax.swing.SwingUtilities;

/**
 * @author Nicodemus
 * 21103077
 * SIS105C
 */
public class CRUDMahasiswasederhana {
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                FrameMahasiswa form = new FrameMahasiswa();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }
}
