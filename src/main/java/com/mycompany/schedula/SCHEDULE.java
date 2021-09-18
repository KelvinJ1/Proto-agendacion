

package com.mycompany.schedula;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SCHEDULE {
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
       
        
       Scanner lector = new Scanner(System.in);
        
          File archivo;
    PrintWriter escribir;
    
        System.out.println("Nombre de la agenda: ");
    String Fname= lector.next();
    String ext= Fname+".txt";
    archivo = new File(ext);
    
    if (!archivo.exists())
    { 
        try {
               archivo.createNewFile();
               
           } catch (IOException ex) {
               Logger.getLogger(SCHEDULE.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    else{
          System.out.println("Lo sentimos, este archivo ya existe.");
        }
    
    
    
        System.out.println("-------------------------------"
                + "\n1. Agregar registros \n"
                + "2. Salir ");
                
        
        int opc= lector.nextInt();
        lector.nextLine();
    
        switch (opc){
        
            case 2:
                System.out.println("Saliendo...");
                break;
            
            case 1:
           
               try {
                   escribir = new PrintWriter(ext, "utf-8");
                   String nombre, direccion, ciudad;
                   int codPostal, edad;
                   long tel;
                  
                   System.out.println("\nNombre: ");
                   nombre =lector.nextLine();
                   
                   System.out.println("\nDirección: ");
                   direccion= lector.nextLine();
                   System.out.println("\nCiudad: ");
                   ciudad= lector.nextLine();
                   System.out.println("\nEdad: ");
                   edad=lector.nextInt();
                   System.out.println("\nTeléfono: ");
                   tel=lector.nextLong();
                   System.out.println("\nCódigo postal: ");
                   codPostal=lector.nextInt();
                   
                   escribir.println("NOMBRE: "+nombre+"\n\n"+"DRECCIÓN: "+direccion+"\n\n"+"EDAD: "+edad+"\n\n"+"CIUDAD: "+ciudad+
                           "\n\n"+"TELÉFONO: "+tel+"\n\n"+"CÓDIGO POSTAL: "+codPostal);
                   escribir.close();
                   
                   System.out.println("\n\nRegistros guardados exitosamente!");
               } 
               
               catch (UnsupportedEncodingException ex) {
                   Logger.getLogger(SCHEDULE.class.getName()).log(Level.SEVERE, null, ex);
               }
           

        
        
        }
        
    }


    }
        
    
  
