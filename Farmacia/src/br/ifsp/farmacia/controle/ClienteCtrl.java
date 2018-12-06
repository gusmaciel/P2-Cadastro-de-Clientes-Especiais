package br.ifsp.farmacia.controle;

import java.util.ArrayList;

import br.ifsp.farmacia.dao.CidadeDao;
import br.ifsp.farmacia.dao.ClienteDao;
import br.ifsp.farmacia.dao.JDBCCidadeDao;
import br.ifsp.farmacia.dao.JDBCClienteDao;
import br.ifsp.farmacia.modelo.Cidade;
import br.ifsp.farmacia.modelo.Cliente;

public class ClienteCtrl {

	public void gravaCliente(Cliente cliente) {
		
		ClienteDao objCliente = new JDBCClienteDao();
		objCliente.gravaCliente(cliente);
	}
	
	public ArrayList<Cidade> obterCidades() {
		
		CidadeDao objCidade = new JDBCCidadeDao();
		return objCidade.obterCidades();
	}
}
