package com.jefferson.gof.facade;

import com.jefferson.gof.facade.subsistema1.crm.CrmService;
import com.jefferson.gof.facade.susbsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		
		//realizando a busca interna a partir do CEP informado
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		/* notar que no método migrarCliente não passei os campos de 
		cidade e estado. O facace utiliza um serviço interno para realizar a pesquisa */
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
