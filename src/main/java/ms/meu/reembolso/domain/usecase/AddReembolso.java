package ms.meu.reembolso.domain.usecase;

import ms.meu.reembolso.gateway.repository.mapper.input.ReembolsoInputMapper;
import ms.meu.reembolso.gateway.repository.mapper.output.ReembolsoOutputMapper;

public interface AddReembolso {

	ReembolsoOutputMapper addReembolso(ReembolsoInputMapper input);
}
