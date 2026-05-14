package model.entities;
import javax.swing.*;
import java.util.Date;
public class Pessoas  extends  ServicoMigratorio{

    private final String codigoDoPais = "MOZ";
    private String nome;
    private int idade;
    private String sexo;
    private String nacionalidade;
    private Date dataNascimento;
    private Date emissaoPassaport;
    private Date expiracaoPassaport;
    private String IdentificacaoPassport;

    public Pessoas(String nome, int idade, String sexo, String nacionalidade, Date dataNascimento, Date emissaoPassaport, Date expiracaoPassaport, String IdentificacaoPassport) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.emissaoPassaport = emissaoPassaport;
        this.expiracaoPassaport = expiracaoPassaport;
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
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Date getEmissaoPassaport() {
        return emissaoPassaport;
    }
    public void setEmissaoPassaport(Date emissaoPassaport) {
        this.emissaoPassaport = emissaoPassaport;
    }
    public Date getExpiracaoPassaport() {
        return expiracaoPassaport;
    }
    public void setExpiracaoPassaport(Date expiracaoPassaport) {
        this.expiracaoPassaport = expiracaoPassaport;
    }

    @Override
    public String toString() {
        return JOptionPane.showInputDialog(null,"Nome: "+nome+"\n"+"Idade: "+"\n"+"Sexo: "+sexo+"\n"+"Nacionalidade: "+nacionalidade+"\n"
                +"Data Nascimento: "+dataNascimento+"\n"+"Emissao: "+emissaoPassaport+"\n"+"Expiracao: "+expiracaoPassaport+"Codigo do Pais: "+codigoDoPais,"SERVICO NACIONAL DE MIGRACAO",JOptionPane.INFORMATION_MESSAGE);
    }
        // Metodo para fazer a validacao
    @Override
    public void processar()  {
                if(getIdentificacaoPassport().length() > 10 || getIdentificacaoPassport().length() < 10){
                    JOptionPane.showMessageDialog(null,"Erro: a identificacao do passaporte deve ter no maximo 10 carateres");
                }
                if(){

                }
    }
}
