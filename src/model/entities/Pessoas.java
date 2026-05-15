package model.entities;
import javax.swing.*;
import java.time.LocalDate;
public class Pessoas  extends  ServicoMigratorio{

    private final String codigoDoPais = "MOZ";
    private String nome;
    private int idade;
    private String sexo;
    private String nacionalidade;
    private String dataNascimento;
    private LocalDate emissaoPassaport;
    private LocalDate expiracaoPassaport;
    private String IdentificacaoPassport;

    public Pessoas(String nome, int idade, String sexo, String nacionalidade, String  dataNascimento, String IdentificacaoPassport, String origem, String destino,LocalDate emissaoPassaport, LocalDate expiracaoPassaport) throws model.Exceptions.ServicoMigratorio {
        super(origem,destino);
        if(emissaoPassaport == null){
            throw  new model.Exceptions.ServicoMigratorio("A emissao do Passaport esta vazio");
        }
        if(expiracaoPassaport == null){
            throw  new model.Exceptions.ServicoMigratorio("A expiracao do passaporte  esta vazio");
        }
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.dataNascimento =dataNascimento;
        this.IdentificacaoPassport = IdentificacaoPassport;
        this.emissaoPassaport = emissaoPassaport;
        this.expiracaoPassaport = expiracaoPassaport;
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
    public String  getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String  dataNascimento) {
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
    public boolean processar() throws model.Exceptions.ServicoMigratorio {
        LocalDate now =  LocalDate.now();
                if(getIdentificacaoPassport().length() > 10 ){
                    throw  new model.Exceptions.ServicoMigratorio("Erro: a identificacao do passaporte deve ter no maximo 10 caracteres");
                }
                if( getIdentificacaoPassport().length() < 10){
                    throw  new model.Exceptions.ServicoMigratorio("Erro: a identificacao do passaporte deve ter no maximo 10 caracteres");
                }
        if (getEmissaoPassaport().isAfter(now)) {
            throw new model.Exceptions.ServicoMigratorio("data da emissao invalida , esta no futuro");
        }
        if (!getExpiracaoPassaport().isAfter(getEmissaoPassaport())) {
            JOptionPane.showMessageDialog(null, "A data de  expiracao deve ser depois da emissao do passaport");
            return false;
        }
        if (now.isBefore(getEmissaoPassaport()) || now.isAfter(getExpiracaoPassaport())) {
           JOptionPane.showMessageDialog(null, "Passaporte expirado, nao esta valido para a data atual");
            return false;
        } else {
            JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n"+"Idade: "+idade+"\n"+"Sexo: "+sexo+"\n"+"Nacionalidade: "+nacionalidade+"\n"
                    +"Data Nascimento: "+dataNascimento+"\n"+"Emissao: "+emissaoPassaport+"\n"+"Expiracao: "+expiracaoPassaport+"\n"+"Codigo do Pais: "+codigoDoPais+"\n"+"Origem: "+getOrigem()+"\n"+"Destino: "+getDestino(),"SERVICO NACIONAL DE MIGRACAO",JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
}
