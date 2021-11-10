import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;

public class ContaBancaria {
    private double saldo;
    private Date dataAbertura;

    public ContaBancaria() {
        this.saldo = 0.0;
        this.dataAbertura = new Date();
        System.out.println("Conta criada com sucesso!");
    }

    public double getSaldo(){
        return this.saldo;
    }

   
    public String getDataAberturaFormatada(){
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return df.format(this.dataAbertura);  
      }
    public String getSaldoFormatado(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.saldo);
      }
    
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void sacar(double quantia) {
        if(this.saldo < quantia){
            System.out.println("Saldo insuficiente!");
    } else {
        this.saldo -= quantia;
        System.out.println("Saque de R$" + quantia + " realizado com sucesso!");
    }
}
}
