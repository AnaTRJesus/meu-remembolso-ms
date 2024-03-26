package ms.meu.reembolso.model;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.querydsl.core.annotations.QueryEntity;

@QueryEntity
@Document
public class Reembolso {

    @Id
    private Long id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String matricula;
    @Indexed(direction = IndexDirection.ASCENDING)
    private BigDecimal valor;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String descricao;

    public Reembolso() {
    }

	public Reembolso(Long id, String matricula, BigDecimal valor, String descricao) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.valor = valor;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, matricula, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reembolso other = (Reembolso) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(valor, other.valor);
	}
 
}