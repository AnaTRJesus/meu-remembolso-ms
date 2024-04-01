package ms.meu.reembolso.gateway.repository.impl.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import ms.meu.reembolso.model.Reembolso;



public interface ReembolsoRepositoryMongo extends MongoRepository<Reembolso, Long>, QuerydslPredicateExecutor<Reembolso> {

    List<Reembolso> findById(String name);
}
