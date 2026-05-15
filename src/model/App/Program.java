package model.App;
import model.Exceptions.ServicoMigratorio;
import model.entities.Bens;
import model.entities.Pessoas;
import java.time.LocalDate;
public class Program {
    public static void main(String[] args) throws ServicoMigratorio {

        Pessoas a  = new Pessoas("Shelton Chambule",21,"M","Mocambicana","2004/07/08","AB14443547","Mocambique",
                "Africa do Sul",LocalDate.of(2025,12,04), LocalDate.of(2030,10,29));
        Bens b  = new Bens("Africa do sul","Mocambique","Industrial",12.000,5500);
        a.processar();
        b.processar();
    }
}
