
package pi2_condominio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MoradorDAO {
    
    Connection conn=null;
    PreparedStatement st;
    ResultSet rs;
    

    
    //Conexão com o banco de dados
    public boolean conectar(){
        //Conexão com banco de dados atividade1
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pi2","root","Raissa13022007");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
    //Método de cadastrar um novo filme no mysql
    public int salvar(Morador morador){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO morador(nome, cpf, apto) VALUES(?,?,?)");
            st.setString(1, morador.getNome());
            st.setString(2, morador.getCpf());
            st.setString(3, morador.getApto());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }
    
    //Método excluir filme no mysql
    public boolean excluir(String nome){
        try {
            st = conn.prepareStatement("DELETE FROM filmes WHERE nome = ?");
            st.setString(3, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar " + ex.getMessage());
            return false;
        }
    }
}
