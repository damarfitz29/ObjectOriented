/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

import java.util.Arrays;

/**
 *
 * @author WINDOWS 10
 */
public class ObjectOriented {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int i=1_000_000;
//        short s=(short) i;
//        long m=15;
//        int n= (int) m;
//        double d1=5.6;
//        double d2=5.8;
//        char c = 95;
//        String k = "show";
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
//        System.out.println(c);
//        System.out.println(d1+d2);
        System.out.println("we");
        //looping huruf
        for(char a=65; a<=122; a++){
            System.out.print(a);
        }
        //char h=65;
//        for( ; ;h++){
//            System.out.println(h);
//        }
        System.out.println("");
        //modulus
        for(int t=0; t<10; t++){
            if(t%2==0)continue;
            System.out.print(t);
        }
        System.out.println("");
        
        for(int t=0; ; t++){
            if(t%5==4)break;
            System.out.print(t);
        }
        System.out.println("");
    
        //array
        int []arrInt[]={
            {1,2},
                {4,5,6}
        };
        System.out.println(arrInt.length);
        
        for (int[] arrInt1 : arrInt) {
            for (int b : arrInt1) {
                System.out.print(b);  
            }
        }
        System.out.println("");
        //array 1 dimensi
        int[]f=new int[5];
        for(int g=0;g < 5;g++){
            f[g]=g+1;
            System.out.println(Arrays.toString(f));
        }
        System.out.println("");
        //array 2 dimensi
        int [][]z=new int[5][];
        //baris
            for(int m=0;m<5;m++){
                z[m]=new int[5];
                //kolom
                for (int i = 0; i < 5; i++) {
                    z[m][i]=(m*5)+(i+1);
                }
                
                System.out.println(Arrays.toString(z[m]));
        }
            System.out.println("");
            
        int [][]x=new int[5][];
        //baris
            for (int y = 0; y < 5; y++) {
                x[y]=new int[5];
                //kolom
                for (int i = 0; i < 5; i++) {
                    x[y][i]= (y+i)%2;
                }
                System.out.println(Arrays.toString(x[y]));
        }
            String[] table = {"aa","bb","cc"};
            for(String ss : table){
                int ii=0;
                while(ii < table.length){
                    System.out.println(ss + "," + ii);
                ii++;
                }
            }
            int j=0, k=0;
            for(int i=0; i<3; i++){
                do{
                    k=0;
                    while (k<4){
                        k++;
                        System.out.print(k + " ");
                    }
                    System.out.print("");
                    j++;
                }while (j<3);
                System.out.print("---");
            }
            
           
}
    

        
}
    

