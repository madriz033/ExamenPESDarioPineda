package es.curso.persistence.model.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.curso.model.Entity.Tarjeta;
import es.curso.persistence.model.dao.TarjetaDao;

public class TarjetaDaoJdbc implements TarjetaDao{
	private Connection cx;
	
// constructor vacio	
	public TarjetaDaoJdbc() {
		super();
		
	}

	@Override
	public void create(Tarjeta tarjeta) {
		try {
			//instrucciones para conectar con la base de datos
			// 1. abrir conexion
			abrirConexion();
			
			// 2. preparar la sentencia (sql) para agregar
			PreparedStatement ps= 
				cx.prepareStatement	("INSERT INTO tarjetacredito VALUES (?,?,?,?,?,?,?,?)");
				// 2.1 Insertar los datos de cliente en los ?
				ps.setInt(1, 0); // el id lo genera la base de datos automaticamente, ponemos 0 por poner algo
				ps.setString(2, tarjeta.getNumero()); // nombre es Varchar en SQL, String para Java
				ps.setInt(3, tarjeta.getCupoMaximo()); 
				ps.setInt(4, tarjeta.getSaldoDisponible()); 
				ps.setString(5, tarjeta.getTipo()); 
				ps.setInt(6, tarjeta.getNumComprobacion());
				ps.setString(7, tarjeta.getContrasenha()); 
				ps.setBoolean(8, tarjeta.isBloqueada()); 
				
				
			// 3. ejecutar la sentencia (sql) 
				ps.executeUpdate(); // = dar al play en Heidi
				// nota: se usa executeUpdate() para las instrucciones sql 
				// como: insert delete update
				// Esta instruccion devuelve como resultado el numero de registros
				// (o filas) afectadas
				
				//3.1 Hacer Commit
				cx.commit();
				
			
			
		} catch (SQLException e) {	
			try {
				cx.rollback();
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
		finally{
		// 4. cerrar la conexion
		cerrarConexion();
		}
	}

	@Override
	public ArrayList<Tarjeta> findAll() {	
		ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
		try {
			// 1. abrir la conexion
			abrirConexion();
			
			// 2. preparar las sentencias
			PreparedStatement ps= cx.prepareStatement("SELECT * FROM tarjetacredito");
			
			// 3. ejecutar las sentencias
			ResultSet consulta = ps.executeQuery();
			
			// 3.1 traspasar los datos de la respuesta al arrayList
			while(consulta.next()){
				Tarjeta tarjetaTemporal = new Tarjeta();
				// codigo para traspasar de la consulta(resultSet) hacia el clienteTemporal
				tarjetaTemporal.setId(consulta.getInt("id"));// lo que esta entre comillas es el nombre del atributo de la base de datos
				tarjetaTemporal.setNumero(consulta.getString("numero"));
				tarjetaTemporal.setCupoMaximo(consulta.getInt("cupoMaximo"));
				tarjetaTemporal.setSaldoDisponible(consulta.getInt("saldoDisponible"));
				tarjetaTemporal.setTipo(consulta.getString("tipo"));
				tarjetaTemporal.setNumComprobacion(consulta.getInt("numComprobacion"));
				tarjetaTemporal.setContrasenha(consulta.getString("contrasenha"));
				tarjetaTemporal.setBloqueada(consulta.getBoolean("bloqueada"));
				
				tarjetas.add(tarjetaTemporal);
			}
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		finally {
		// 4. cerrar la conexion
		return tarjetas;
		}
	}

	private void abrirConexion(){
		// 1. determinar y validar si tengo el driver o conector (de mysql)
		try {
			Class.forName("com.mysql.jdbc.Driver");
		// 2. establecer conexion	
			cx= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/banco", // localizacion de base de datos
					"root", // usuario
					"root" // contraseña
					);
		// 3. Iniciar el autoCommit en false
			cx.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void cerrarConexion(){
		try {
			if(cx!=null)
			cx.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

	
	

	
	
}

