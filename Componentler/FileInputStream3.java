package Componentler;

import java.io.FileInputStream;

public class FileInputStream3 {

    public static void main(String args[]){
        try{


            FileInputStream fin=new FileInputStream("dosyaOlustur.txt");
            int i=0;
            String s;



            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }




            fin.close();

        }catch(Exception e){System.out.println(e);}
    }
}
