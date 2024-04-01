package ms.meu.reembolso.gateway.repository;

import ms.meu.reembolso.gateway.repository.mapper.input.ReembolsoInputMapper;
import ms.meu.reembolso.gateway.repository.mapper.output.ReembolsoOutputMapper;

public interface RepositoryGatewayReembolso {
	
	ReembolsoOutputMapper addReemboleso(ReembolsoInputMapper input);
	
	ReembolsoOutputMapper updateReembolso(ReembolsoInputMapper input);
	
	ReembolsoOutputMapper retrieveReembolso(Long id);
	
	void deleteReembolso(Long id);
}
