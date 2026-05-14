package model.entities;
import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;
public class Pessoas  extends  ServicoMigratorio{

    private final String codigoDoPais = "MOZ";
    private String nome;
    private int idade;
    private String sexo;
    private String nacionalidade;
    private LocalDate dataNascimento;
    private LocalDate emissaoPassaport;
    private LocalDate expiracaoPassaport;
    private String IdentificacaoPassport;

    public Pessoas(String nome, int idade, String sexo, String nacionalidade, String  dataNascimento, String IdentificacaoPassport) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.IdentificacaoPassport = IdentificacaoPassport;
    }
    public String getIdentificacaoPassport() {
        return IdentificacaoPassport;
    }
    public void setIdentificacaoPassport(String identificacaoPassport) {
        IdentificacaoPassport = identificacaoPassport;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDate getEmissaoPassaport() {
        return emissaoPassaport;
    }
    public void setEmissaoPassaport(LocalDate emissaoPassaport) {
        this.emissaoPassaport = emissaoPassaport;
    }
    public LocalDate getExpiracaoPassaport() {
        return expiracaoPassaport;
    }
    public void setExpiracaoPassaport(LocalDate expiracaoPassaport) {
        this.expiracaoPassaport = expiracaoPassaport;
    }

        // Metodo para fazer a validacao
    @Override
    public boolean processar(LocalDate emissaoPassaport, LocalDate expiracaoPassaport)  {
        LocalDate now =  LocalDate.now();
                if(getIdentificacaoPassport().length() > 10 ){
                    JOptionPane.showMessageDialog(null,"Erro: a identificacao do passaporte deve ter no maximo 10 caracteres");
                }
                if( getIdentificacaoPassport().length() < 10){
                    JOptionPane.showMessageDialog(null,"Erro: a identificacao do passaporte deve ter no maximo 10 caracteres");
                }
        if (emissaoPassaport.isAfter(now)) {
            JOptionPane.showMessageDialog(null, "data da emissao invalida , esta no futuro");
            return false;
        }
        if (!expiracaoPassaport.isAfter(emissaoPassaport)) {
            JOptionPane.showMessageDialog(null, "A data de  expiracao deve ser depois da emissao do passaport");
            return false;
        }
        if (now.isBefore(emissaoPassaport) || now.isAfter(expiracaoPassaport)) {
            JOptionPane.showMessageDialog(null, "Passapaort expirado, nao esta valido para a data atual");
            return false;
        } else {
            JOptionPane.showInputDialog(null,"Nome: "+nome+"\n"+"Idade: "+"\n"+"Sexo: "+sexo+"\n"+"Nacionalidade: "+nacionalidade+"\n"
                    +"Data Nascimento: "+dataNascimento+"\n"+"Emissao: "+emissaoPassaport+"\n"+"Expiracao: "+expiracaoPassaport+"Codigo do Pais: "+codigoDoPais,"SERVICO NACIONAL DE MIGRACAO",JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
}
