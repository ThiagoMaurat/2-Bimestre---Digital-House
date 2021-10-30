import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Impressora impressora = new Impressora("HP", "Wi-fi", LocalDate.of(2021, 10, 27));
        impressora.setFolhasDisponiveis(100);
        System.out.println(impressora.getDataFabricacao());
        impressora.imprimir("wefew");
        System.out.println(impressora.getFolhasDisponiveis());
    }
}
