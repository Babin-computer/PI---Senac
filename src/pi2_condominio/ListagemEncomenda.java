
package pi2_condominio;

import java.util.ArrayList;
import java.util.List;


public class ListagemEncomenda {
    
    int id_encomenda;
    String dataEntrega,nome;
    
    
    
    public ListagemEncomenda(){
      this.dataEntrega=dataEntrega;
      this.nome=nome;
      this.id_encomenda=id_encomenda;
        
        
    }
     private static final List<ListagemEncomenda> lista = new ArrayList<>();

      // Métodos para acessarmos a lista e adicionarmos novos itens
      public static List<ListagemEncomenda> Listar() {
          return lista;
      }
      
      public static void Adicionar(ListagemEncomenda enc) {
          lista.add(enc);
      }
      
      public static void atualizar(int id, ListagemEncomenda pac){
        lista.set(id, pac);
        
    }

    public int getId_encomenda() {
        return id_encomenda;
    }

    public void setId_encomenda(int id_encomenda) {
        this.id_encomenda = id_encomenda;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
      
    
    
}
