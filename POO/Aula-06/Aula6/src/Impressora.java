import java.time.LocalDate;
import java.util.Date;

import javax.lang.model.util.ElementScanner14;

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;
    
    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }
    
    private boolean tempapel(){
        if (this.folhasDisponiveis>0) {
            return true;
        } else{
            return false;
        }
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public void imprimir(String texto){
        if (tempapel()){
            System.out.println(texto);
            this.folhasDisponiveis--;
        } else {
            System.out.println("Impressora sem papel");
        }
            
    }




}
