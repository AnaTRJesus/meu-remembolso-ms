package ms.meu.reembolso.domain.usecase;

import ms.meu.reembolso.gateway.repository.mapper.output.ReembolsoOutputMapper;

public interface RetrieveReembolso {
	
	ReembolsoOutputMapper retrieveReembolso(Long id);
}
