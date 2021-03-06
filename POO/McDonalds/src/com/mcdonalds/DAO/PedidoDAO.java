package com.mcdonalds.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mcdonalds.modelo.Pedido;

public class PedidoDAO {
	
	private Connection con = null;
	private PreparedStatement statement = null;
	
	public PedidoDAO(){
		con = ConnectionFactory.getConnection();
	}
	//Abre um novo pedido
	public void AbrirPedido() throws SQLException {
		String sql = "EXEC upsAbrirPedido";
		
		statement = con.prepareStatement(sql);
		statement.execute();
		
	}
	
	//Pega o id do pedido para armazenar em uma v�riavel
	public int PedidoAtual() throws SQLException {
		String sql = "SELECT MAX(pedido) FROM Pedido";
		
		statement = con.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		
		int idAtual = Integer.parseInt(rs.getString(1));
		
		return idAtual;
	}

}
