package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcessoBanco {

	public static void main(String[] args){
		
		String url = "jdbc:mysql://localhost:3306/programa_cadastro";
		
		String sql = "insert into aqui (cod, nome) values ('ehheheheeheh!', 'ohohohohohohohohoh!')";
		
		try(
				
				Connection conexao = DriverManager.getConnection(url, "root", "root");
//				PreparedStatement stm = conexao.prepareStatement(sql);
								
			){
	//	stm.executeUpdate();
			
			
			System.out.println("Deu!! =D");
			
		}catch(SQLException e){
			
			System.out.println("N�o deu!! " + e);

		}catch(Exception h){
			
			System.out.println(h);

		}
	}

}
