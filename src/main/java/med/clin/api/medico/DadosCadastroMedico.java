package med.clin.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.clin.api.endereco.DadosEndereco;
import org.springframework.format.annotation.NumberFormat;

public record DadosCadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid DadosEndereco endereco) {
    @Override
    public String toString() {
        return "{\n" +
                "   nome='" + nome + "', \n" +
                "   email='" + email + "', \n" +
                "   crm='" + crm + "', \n" +
                "   especialidade='" + especialidade + "', \n" +
                "   endereco=" + endereco + "', \n" +
                '}';
    }
}
