package academy.logica.utd;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex01 {
    public static void main(String[] args) {
        int idadeAnos = 31, idadeMeses = 1, idadeDias = 17;
        double diasNascida = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
        System.out.println("Meu calculo em dias: " + diasNascida);

        // Dias com LocalDate
        LocalDate aniversario = LocalDate.of(1992, 8,10);
        long dias = aniversario.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("Com LocalDate em dias: " + dias);

        // Anos com LocalDate

        LocalDate aniversario2 = LocalDate.of(1992, 8,10);
        long anos = aniversario.until(LocalDate.now(), ChronoUnit.YEARS);
        System.out.println("Com LocalDate em dias: " + dias);



    }
}
