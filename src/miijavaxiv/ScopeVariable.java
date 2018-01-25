/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;
/**
 *
 * @author WINDOWS 10
 */
public class ScopeVariable {
    int z;
    //static biasa diaksess lewat var class
    static int y;
    
    public void methodA(int z){
        this.z =  29;
        y = 14;
    }
    
    public static void methodC(){
        y = 20;
    }
    
    public static void methodD(){
        methodC();
    }
    
    public void methodB(){
        int z = 20;
        this.z = z;
    }
}
