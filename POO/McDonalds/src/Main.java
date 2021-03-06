
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mcdonalds.DAO.PedidoDAO;
import com.mcdonalds.DAO.ProdutosDAO;
import com.mcdonalds.view.*;
import com.mcdonalds.modelo.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		ProdutosDAO produtosDAO = new ProdutosDAO();
		
		//Connection con = ConnectionFactory.getConnection();
		
		//System.out.println("Connected");
		
		//String query = "SELECT * FROM Produtos WHERE ID_Produto = ?";
		//String query = "SELECT * FROM Produtos";
		
		//PreparedStatement pstmt = con.prepareStatement(query);
		//pstmt.setInt(1, 2);
		//ResultSet rs = pstmt.executeQuery();
		
		//List<Produtos> produtos = new ArrayList<Produtos>();
		
		/*while (rs.next()) {
	         //System.out.println(rs.getInt("ID_Produto") + ", " + rs.getString("Nome_Produto"));
			Produtos produto = new Produtos(rs.getInt("id_Produto"), rs.getString("nome_Produto"), rs.getFloat("valor_Unit") 
					, rs.getFloat("desconto"), rs.getString("combo"));
			produtos.add(produto);
			
			System.out.println(produto.getNome_Produto());
	    }
	      rs.close();
	      pstmt.close();*/
		
		
		//Listar os produtos
		//ProdutosDAO produtosDAO = new ProdutosDAO();
		List<Produtos> produtos = produtosDAO.findAll();
		
		for (int i = 0; i < produtos.size(); i++){
			Produtos produto = produtos.get(i);
			
			System.out.println(produto.getId_Produto() + produto.getNome_Produto() 
						+ produto.getValor_Unit() + produto.getDesconto() + produto.getCombo());
			
		}
		
		//listar apenas 1 produto informando o id
		/*ProdutosDAO produtosDAO = new ProdutosDAO();
		System.out.print("Informe o ID do produto: ");
		int id = entrada.nextInt();
		
		Produtos produto = produtosDAO.findById(id);
		
		System.out.println(produto.getId_Produto() + produto.getNome_Produto() 
		+ produto.getValor_Unit() + produto.getDesconto() + produto.getCombo());*/
		
		//inserir um novo item
		//produtosDAO.insert(new Produtos("Caf�", 5, 0, "N"));
		
		//deletar um item
		//produtosDAO.remove(new Produtos(7));
		
		PedidoDAO pedidoDAO = new PedidoDAO();
		
		int pedidoAtual = pedidoDAO.PedidoAtual();
		
		System.out.println(pedidoAtual);
		
		

	}

}
