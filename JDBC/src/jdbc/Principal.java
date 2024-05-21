package jdbc;
import  java.sql.*;


public class Principal {
public static void main(String[] args) {
	try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.1.2.175:1521:xe","c##bdarticulos","articulos");
        Statement stmt = conexion.createStatement();
        System.out.println("Consulta 1");
        ResultSet rset =stmt.executeQuery("select * from articulo");
        System.out.println();
	    while (rset.next())
	         System.out.println (rset.getString(1)+"------"+rset.getString(2)+"------"+rset.getString(3));   // Print col 1
	    System.out.println("---------------------------------------------------------------------------------------------");

	    System.out.println("Consulta 2");
        rset =stmt.executeQuery("select a.*,F.NomFab from articulo a join fabricante f on a.CodFab=f.CodFab");
        System.out.println();
	    while (rset.next())
	         System.out.println (rset.getString(1)+"------"+rset.getString(2)+"------"+rset.getString(3)+"------"+rset.getString(5));   // Print col 1
	    System.out.println("---------------------------------------------------------------------------------------------");
	   
	    System.out.println("Insercion");
	         rset =stmt.executeQuery("Insert into articulo VALUES ('0000000012','SqlJava','420','0000000003')");
	         System.out.println();
	 	    while (rset.next())
	 	     System.out.println("Inserccion completada");
	 	     System.out.println("---------------------------------------------------------------------------------------------");
	 
	    stmt.close();
	   
       }catch (SQLException | ClassNotFoundException ex) {
           System.out.println("Error en la conexión de la base de datos");
       }	    
}

	
	
}
