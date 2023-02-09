package med.clin.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    private String logradoura;
    private String cep;
    private String bairro;
    private String numero;
    private String complemento;
    private String uf;
    private String cidade;
}
