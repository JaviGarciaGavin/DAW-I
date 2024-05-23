package modelo;
import java.sql.*;

public class FabricanteDAO {
	private static Connection conectar() {
		Connection con=null;		
		String usr="c##bdarticulos",pass="articulos";
		String url="jdbc:oracle:thin:@10.1.2.175:1521:xe";
        try {
            con = DriverManager.getConnection(url, usr, pass);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }
        return con;
    }
	
		public static void create(Fabricante fabri) {
	        if (fabri != null) {
	            Connection conexion = conectar();
	            String sql = "INSERT INTO Fabricante "
	                    + "VALUES ( ?, ?)";
	            try {
	                PreparedStatement sentencia = conexion.prepareStatement(sql);
	                sentencia.setString(1, fabri.getCodFab());
	                sentencia.setString(2,fabri.getNomFab());                
	                sentencia.executeUpdate();
	                conexion.close(); 
	            } catch (SQLException ex) {
	                System.out.println("Error al insertar.");
	            }
	        }
	    }
		
		public static Fabricante read(String codFab) {
		        Fabricante fabricante = null;
		        String sql = "SELECT *"
		                + "FROM Fabricante "
		                + "WHERE CodFab = ?";
		        try {
		            Connection conexion = conectar();
		            PreparedStatement sentencia = conexion.prepareStatement(sql);
		            sentencia.setString(1, codFab); 
		            ResultSet rs = sentencia.executeQuery();
		            if (rs.next()) { 
		                String CodFab = rs.getString("CodFab");
		                String NomFab = rs.getString("NomArt");  
		                fabricante = new Fabricante(CodFab, NomFab);
		                conexion.close();
		            }
		        } catch (SQLException ex) {
		            System.out.println("Error al consultar un artículo.");
		        }

		        return fabricante; 
		    }
	
		public static void update(Fabricante fabricante) {
			if (fabricante != null) {
	            String sql = "UPDATE Fabricante "
	                    + "SET CodFab=?, NomFab=? "
	                    + "WHERE CodFab = ?";
	            try {
	                Connection conexion = conectar();
	                PreparedStatement sentencia = conexion.prepareStatement(sql);
	               
	                sentencia.setString(1, fabricante.getCodFab());
	                sentencia.setString(2, fabricante.getNomFab());
	                sentencia.executeUpdate();
	             
	                conexion.close();
	            } catch (SQLException ex) {
	                System.out.println("Error al actualizar un alumno.");
	            }
	        }
		}
			
			
			public static void delete(String codFab) {
		        String sql = "DELETE FROM Fabricante "
		                + "WHERE CodFab = ?";
		        try {
		            Connection conexion = conectar();
		            PreparedStatement sentencia = conexion.prepareStatement(sql);
		            sentencia.setString(1, codFab); 
		            sentencia.executeUpdate();
		            conexion.close();
		        } catch (SQLException ex) {
		            System.out.println("Error al eliminar un fabricante");
		        }
		    }
}
