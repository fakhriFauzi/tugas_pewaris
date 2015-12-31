/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fakhri
 */
public class NewMain extends KelasInduk{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KelasInduk m=new KelasInduk();
         m.setNim(14311332);
        m.setNama("fakhri fauzi");
        m.setJurusan("sistem informasi");
      
        System.out.println("Nim      :"+m.getNim());
        System.out.println("Nama     :"+m.getNama());
        System.out.println("Jurusan  :"+m.getJurusan());
    }

    
 
    }

