package model.entities;

import java.time.LocalDate;

public  abstract  class ServicoMigratorio  {

    public abstract  boolean processar(LocalDate emissaoPassaport, LocalDate expiracaoPassaport);

}
