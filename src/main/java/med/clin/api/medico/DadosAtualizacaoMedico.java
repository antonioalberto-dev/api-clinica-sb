package med.clin.api.medico;

import jakarta.validation.constraints.NotNull;
import med.clin.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
