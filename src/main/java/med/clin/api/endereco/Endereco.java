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
    private String logradouro;
    private String cep;
    private String bairro;
    private String numero;
    private String complemento;
    private String uf;
    private String cidade;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.numero = endereco.numero();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.complemento = endereco.complemento();
    }

    public void atualizarDados(DadosEndereco dados) {
        if (this.logradouro != null) this.logradouro = dados.logradouro();
        if (this.bairro != null) this.bairro = dados.bairro();
        if (this.numero != null) this.numero = dados.numero();
        if (this.cep != null) this.cep = dados.cep();
        if (this.cidade != null) this.cidade = dados.cidade();
        if (this.uf != null) this.uf = dados.uf();
        if (this.complemento != null) this.complemento = dados.complemento();
    }
}
