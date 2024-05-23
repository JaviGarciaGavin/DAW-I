package jdbc;

import java.sql.*;

public class Principal2 {
public static void main(String[] args) {
	   Connection  conexion; 
	   Statement stmt ;
	   String sql;
	   int numAccs;
	   
	  try {
     conexion=DriverManager.getConnection("jdbc:oracle:thin:@10.1.2.175:1521:xe","c##bdarticulos","articulos");
     stmt= conexion.createStatement();
     
     //Insertar Datos
     sql="Insert into articulo VALUES ('0000000033','Ejemplo','420','0000000004')";	 
     numAccs=stmt.executeUpdate(sql);
     System.out.println("Operaciones realizadas "+numAccs);
     
   //Actualizar precios
     sql="Update articulo set Precio=Precio-Precio*0.5" ;	 
     numAccs=stmt.executeUpdate(sql);
     System.out.println("Operaciones realizadas "+numAccs);	 

     //Borrar un articulo de la tabla
     sql="Delete from fabricante where CODFAB='0000000918'";	 
     numAccs=stmt.executeUpdate(sql);
     System.out.println("Operaciones realizadas "+numAccs);
     
    stmt.close();
    conexion.close();
	   }
	   catch(SQLException ex){
		   System.out.println("Error");
	   }
}
}