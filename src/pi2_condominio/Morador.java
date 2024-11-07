
package pi2_condominio;


public class Morador implements Cadastrar {
    String nome,apto,cpf;
    int id;
    
    
   public Morador(){
     this.apto=apto;
     this.cpf=cpf;
     this.id=id;
     this.nome=nome;   
   } 
    
   @Override
   public void Cadastrar(){
       
       
       
   }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public int getId_morador() {
        return id;
    }

    public void setId_morador(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
   
   
    
    
    
    
    
    
    
    
    
    
}
