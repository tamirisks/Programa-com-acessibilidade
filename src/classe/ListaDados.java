
package classe;

import java.util.ArrayList;
import java.util.List;

public class ListaDados{
    
    private static List<DadosCadastro> lista_dados = new ArrayList<>();
    


    public static List<DadosCadastro> getLista_dados(){
        return lista_dados;
    }
    
    public static void setLista_dados(DadosCadastro cadastro){
        lista_dados.add(cadastro);
    }

    public static void adicionar(DadosCadastro cadastro) {
       lista_dados.add(cadastro);

    }

}
