package model.entities;
import javax.swing.*;
import java.time.LocalDate;
public class Bens extends  ServicoMigratorio {

    private String tipoBem;
    private double quantidadeKg;
    private double valor;

    public Bens(String origem, String destino, String tipoBem, double quantidadeKg, double valor) {
        super(origem, destino);
        this.tipoBem = tipoBem;
        this.quantidadeKg = quantidadeKg;
        this.valor = valor;
    }
    public String getTipoBem() {
        return tipoBem;
    }
    public void setTipoBem(String tipoBem) {
        this.tipoBem = tipoBem;
    }
    public double getQuantidadeKg() {
        return quantidadeKg;
    }
    public void setQuantidadeKg(double quantidadeKg) {
        this.quantidadeKg = quantidadeKg;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean processar()throws model.Exceptions.ServicoMigratorio {
        LocalDate hoje = LocalDate.now();
        if(this.getTipoBem().equals("Industrial")){
            double Iva = 0.3;
            double valorTotal  = 0.3 * getValor();
            double valorFinal = valorTotal + getValor();
            JOptionPane.showMessageDialog(null,  "\n" + "Tipo do Bem : " +getTipoBem() + "\n" + "Quantidade  Kg: " +getQuantidadeKg()+ "\n" +
                    "Iva: " +Iva + "\n" +"Total: "+valorFinal+ "\n"+ "Origem: " + getOrigem() + "\n" + "Destino: " + getDestino() + "\n" + "Data: " + hoje, "Informacoes do Bem", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (this.getTipoBem().equals("Alimentar")) {
            double Iva = 0.2;
            double valorTotal  = 0.2 * getValor();
            double valorFinal = valorTotal + getValor();
            JOptionPane.showMessageDialog(null,  "\n" + "Tipo do Bem : " +getTipoBem() + "\n" + "Quantidade  Kg: " +getQuantidadeKg()+ "\n" +
                    "Iva: " +Iva + "\n" +"Total: "+valorFinal+ "\n"+ "Origem: " + getOrigem() + "\n" + "Destino: " + getDestino() + "\n" + "Data: " + hoje, "Informacoes do Bem", JOptionPane.INFORMATION_MESSAGE);
            return  true;
        } else if (this.getTipoBem().equals("Tecnologico")) {
            double Iva = 0.4;
            double valorTotal  = 0.4 * getValor();
            double valorFinal = valorTotal + getValor();
            JOptionPane.showMessageDialog(null,  "\n" + "Tipo do Bem : " +getTipoBem() + "\n" + "Quantidade  Kg: " +getQuantidadeKg()+ "\n" +
                    "Iva: " +Iva + "\n" +"Total: "+valorFinal+ "\n"+ "Origem: " + getOrigem() + "\n" + "Destino: " + getDestino() + "\n" + "Data: " + hoje, "Informacoes do Bem", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else if (this.getTipoBem().equals("Quimico")) {
            double Iva = 0.38;
            double valorTotal  = 0.38 * getValor();
            double valorFinal = valorTotal + getValor();
            JOptionPane.showMessageDialog(null,  "\n" + "Tipo do Bem : " +getTipoBem() + "\n" + "Quantidade  Kg: " +getQuantidadeKg()+ "\n" +
                    "Iva: " +Iva + "\n" +"Total: "+valorFinal+ "\n"+ "Origem: " + getOrigem() + "\n" + "Destino: " + getDestino() + "\n" + "Data: " + hoje, "ALFANDEGA DE MOCAMBIQUE", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }else {
            throw  new model.Exceptions.ServicoMigratorio("Erro essa categroria nao tem");
        }
    }
}
