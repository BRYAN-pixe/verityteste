package com.mycompany.jogo.DAOS;

import com.mycompany.jogo.DAOS.utils.Conexao;
import com.mycompany.jogo.classes.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 */

  
    public class EquipamentoDAO {
    String url = "jdbc:postgresql://localhost:5432/jogo"; // URL do banco de dados
        String usuario = "postgres"; // Nome de usuário do PostgreSQL
        String senha = "postgresql"; // Senha do PostgreSQL
    
        public void inserirequipamento (Equipamento equipamento) throws SQLException{
            
            
            
        String sql = "INSERT INTO equipamento( nome_equi, nivel_equi, tipo, durabilidade, encantamento ) VALUES (?, ?, ?, ?, ?)";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
            
           stmt.setString(1, equipamento.getNome_equi());
           stmt.setInt(2, equipamento.getNivel_equi());
           stmt.setString(3, equipamento.getTipo());
           stmt.setDouble(4, equipamento.getDurabilidade());
           stmt.setInt(5, equipamento.getEncantamento());
          
          
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Equipamento cadastrado com sucesso!!");}
            }
        
        public void editarequipamento (Equipamento equipamento) throws SQLException{
                
        String sql = "UPDATE equipamento set nome_equi=? where id_equi=?";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, equipamento.getNome_equi());
           stmt.setInt(2, equipamento.getId_equi());
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Forgeiro atualizado com sucesso!!");}
            }
        
        public void deletarequipamento (int id) throws SQLException{
                
        String sql = "DELETE equipamento where id=?";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
    
           stmt.setInt(1, id);
        
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Equipamento deletado com sucesso!!");}
            else {
            System.out.println("Nenhum equipamento foi encontrado com o ID: " + id);
        }
            }

        
         public  List<Equipamento> Listagem() throws SQLException{
             String sql = "SELECT * FROM equipamento";
            List<Equipamento> Listaequipamento = new ArrayList<>();
            Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Equipamento equipamento = new Equipamento(  
                rs.getInt("id_equi"),
                rs.getString("nome_equi"),
                rs.getInt("nivel_equi"),
                rs.getString("tipo"),
                rs.getDouble("durabilidade"),
                rs.getInt("encantamento")
                
                        
                );
                Listaequipamento.add(equipamento);
            }
            return Listaequipamento;
                    
            
           
         
    
    }

}

