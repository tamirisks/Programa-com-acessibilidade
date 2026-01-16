
package classe;

import java.time.LocalTime;
import java.util.Date;

public class DadosCadastro {
    
    private Date data;
    private LocalTime hora;
    private int pressao1;
    private int pressao2;
    private String situacao_estresse;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getPressao1() {
        return pressao1;
    }

    public void setPressao1(int pressao1) {
        this.pressao1 = pressao1;
    }

    public int getPressao2() {
        return pressao2;
    }

    public void setPressao2(int pressao2) {
        this.pressao2 = pressao2;
    }

    public String getSituacao_estresse() {
        return situacao_estresse;
    }

    public void setSituacao_estresse(String situacao_estresse) {
        this.situacao_estresse = situacao_estresse;
    }
    
    
    
    
}
