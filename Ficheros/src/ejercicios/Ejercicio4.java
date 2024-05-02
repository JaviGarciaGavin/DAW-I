package ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio4 {
public static void main(String[] args) {
    int i=0;  
	
    try{    
           FileInputStream lector=new FileInputStream(".\\Prueba1.txt");     
           while((i=lector.read())!=-1){    
            System.out.print((char)i);    
           }    
           lector.close();    
         }catch(Exception e){
        	 System.out.println(e);}    
}    
       }  