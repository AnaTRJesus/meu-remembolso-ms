package ms.meu.reembolso.converter;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import ms.meu.reembolso.model.Reembolso;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReembolsoWriterConverter implements Converter<Reembolso, DBObject> {

    @Override
    public DBObject convert(final Reembolso reembolso) {
        final DBObject dbObject = new BasicDBObject();
        dbObject.put("id", reembolso.getId());
        dbObject.put("matricula", reembolso.getMatricula());
        dbObject.put("valor", reembolso.getValor());
        dbObject.put("descricao", reembolso.getDescricao());

        dbObject.removeField("_class");
        return dbObject;
    }

}
