package med.clin.api.medico;

import med.clin.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
                                  DadosEndereco endereco) {
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
