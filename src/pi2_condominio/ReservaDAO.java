/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi2_condominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mpfma
 */
public class ReservaDAO {
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
    public int salvar(Reserva reserva){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO reserva(data, lazer) VALUES(?,?)");
            st.setString(1, reserva.getData());
            st.setString(2, reserva.getLazer());
           
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
    
    
}
