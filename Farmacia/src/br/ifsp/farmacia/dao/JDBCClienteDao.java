package br.ifsp.farmacia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import br.ifsp.farmacia.modelo.Cliente;

public class JDBCClienteDao implements ClienteDao {

	@Override
	public void gravaCliente(Cliente cliente) {

		try {
		Connection conexao = ConnectionFactory.createConnection();

		String sql = "INSERT INTO cliente (nome, endereco, telefone, dataNascimento, cidade_id) VALUES (?, ?, ?, ?, ?);";
		
		PreparedStatement comando = conexao.prepareStatement(sql);
		
		SimpleDateFormat data = new SimpleDateFormat();
		
		comando.setString(1, cliente.getNome());
		comando.setString(2, cliente.getEndereco());
		comando.setString(3, cliente.getTelefone());
		comando.setString(4, data.format(cliente.getDataNascimento()));
		comando.setInt(5, cliente.getCidade_id().getId());
		
		comando.execute();
		
		conexao.close();
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
