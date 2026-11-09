package com.mycompany.jogo.DAOS;

import com.mycompany.jogo.DAOS.utils.Conexao;
import com.mycompany.jogo.classes.Ambiente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 * 
 */
public class AmbienteDAO {
    
     String url = "jdbc:postgresql://localhost:5432/jogo"; // URL do banco de dados
        String usuario = "postgres"; // Nome de usuário do PostgreSQL
        String senha = "postgresql"; // Senha do PostgreSQL
    
        public void inserirambiente (Ambiente ambiente) throws SQLException{
            
            
            
        String sql = "INSERT INTO Ambiente(id_amb, nome_amb, descricao, minerios, nivel_min ) VALUES (?, ?, ?, ?, ?)";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setInt(1, ambiente.getId_amb());
           stmt.setString(2, ambiente.getNome_amb());
           stmt.setString(3, ambiente.getDescricao());
           stmt.setString(4, ambiente.getMinerios());
           stmt.setInt(5, ambiente.getNivel_min());
           
          
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Ambiente criado com sucesso!!");}
            }
        
        public void editarambiente (Ambiente ambiente) throws SQLException{
                
        String sql = "UPDATE ambiente set nome_amb=?, descricao=? where id_amb=?";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, ambiente.getNome_amb());
           stmt.setString(2, ambiente.getDescricao());
           stmt.setInt(3, ambiente.getId_amb());
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Ambiente atualizado com sucesso!!");}
            }
        
        public void deletarambiente (int id_amb) throws SQLException{
                
        String sql = "DELETE ambiente where id_amb=?";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
    
           stmt.setInt(1, id_amb);
        
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Ambiente deletado com sucesso!!");}
            else {
            System.out.println("Nenhum ambiente foi encontrado com o ID: " + id_amb);
        }
            }

        
         public  List<Ambiente> Listagem() throws SQLException{
             String sql = "SELECT * FROM ambiente";
            List<Ambiente> Listaambiente = new ArrayList<>();
            Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Ambiente ambiente = new Ambiente(  
              rs.getString("nome_amb"),
              rs.getInt("id_amb"),
              rs.getString("descricao"),
              rs.getString("minerios"),
              rs.getInt("nivel_min")
                );
                Listaambiente.add(ambiente);
            }
            return Listaambiente;
                    
            
           
         
    
    }

    
}
