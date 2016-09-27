package arqudir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Arqudir {
    public static void main(String[] args) throws IOException {
        
        String vDirectorio2 = "/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir";
        
        //Ejercicio 5
        String vDirectorio = "/home/oracle/NetBeansProjects/arquivos/arquivosdir";
        
        //Ejercicio 2 y 4
        String arquivosdir = "/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt";
        String arquivo2 = "/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt";
        
        BufferedWriter bw; 
        BufferedWriter bw2;
             
        //Ejercicio 1 y 4
        boolean directorio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/").mkdirs();
        boolean directorio2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir").mkdirs();
        
        File f = new File(arquivosdir);
        File f2 = new File(arquivo2);
        File f3 = new File(vDirectorio);
        File f4 = new File(vDirectorio2);
        
        if (f.exists()){
            //System.out.println("Ya existe f");
        }else{
            bw = new BufferedWriter(new FileWriter(arquivosdir));
        }
        if (f2.exists()){
            //System.out.println("Ya existe f2");
        }else{
            bw2 = new BufferedWriter(new FileWriter(arquivo2));
        }      
        
        //Ejercicio 5
        File [] fich = f3.listFiles();
        
        if(f3.exists()){
            for(int x = 0;x<fich.length;x++)
                System.out.println(fich[x].getName());
        }else{
            System.out.println("O ficheiro esta valeiro");
        }
        
        //Ejercicio 6
         System.out.println("Primeiro directorio creado: \n"+f.getAbsolutePath());
         
        //Ejercicio 7
         System.out.println("Primer arquivo: \n Nome: "+f.getName()+"\n Ruta: "+f.getAbsolutePath());
            if(f.canWrite()==true){
                System.out.println("Se puede escribir");
            }else{
                System.out.println("No se puede escribir");
            }    
            if(f.canRead()==true){
                System.out.println("Se puede leer");
            }else{
                System.out.println("No se puede leer");
            }
            System.out.println("Tamaño en bytes: "+f.length());
            
        //Ejercicio 8   
            f.setWritable(false);
            
        //Ejercicio 9
            f.setWritable(true);
        
        //Ejercicio 10
            f.delete();
            System.out.println("Arquivo borrado");
            
        //Ejercicio 11
            f2.delete();
            System.out.println("Arquivo borrado");
            
            f4.delete();
            System.out.println("Directorio borrado");
            
            f3.delete();
            System.out.println("Directorio borrado");
    }
    
         
}
