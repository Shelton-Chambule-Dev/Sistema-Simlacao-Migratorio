package model.App;
import model.entities.Pessoas;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Pessoas a  = new Pessoas("Shelton Chambule",21,"M","Mocambicana","2004/07/08","AB14443547");
        LocalDate emissao = LocalDate.of(2020,02,12);
        LocalDate expiracao = LocalDate.of(2027,05,16);
        a.processar(emissao,expiracao);
    }
}
