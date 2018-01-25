/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WINDOWS 10
 */
public class HandlingException {
    
    static void bacaFile(String namaFile) throws FileNotFoundException, IOException{
    FileReader reader = new FileReader(namaFile);
                // konfersi ascii ke text
//            System.out.println ((char)reader.read());
//            System.out.println ((char)reader.read());
//            System.out.println ((char)reader.read());
//            System.out.println ((char)reader.read());
//            System.out.println ((char)reader.read());
            int i;
            while((i = reader.read()) > 0){
                System.out.println((char)i);
            }
    
    }
    //throws yg menghandle method lain(lepas tangan)
    //throw untuk menghandle error yg sudah tau kita sebelumnya
    public static void main(String[] args) {
        try {
            int c = -1;
            assert c > 0;//cek point
            if(c == 0) throw new CustomException("c tidak boleh 0");
            int y = 10 / c;
            bacaFile(args[0]);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CustomException ex) {
            Logger.getLogger(HandlingException.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (Error er){
            System.out.println(er.getMessage());
        }
    }
}
