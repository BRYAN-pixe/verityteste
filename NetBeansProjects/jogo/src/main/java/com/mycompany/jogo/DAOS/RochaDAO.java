package com.mycompany.jogo.DAOS;

import com.mycompany.jogo.DAOS.utils.Conexao;
import com.mycompany.jogo.classes.Equipamento;
import com.mycompany.jogo.classes.Rocha;
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
public class RochaDAO {
        String url = "jdbc:postgresql://localhost:5432/jogo"; // URL do banco de dados
        String usuario = "postgres"; // Nome de usuário do PostgreSQL
        String senha = "postgresql"; // Senha do PostgreSQL
    
        public void inserirrocha (Rocha rocha) throws SQLException{
            
            
            
        String sql = "INSERT INTO Rocha(material, nome_roc, tamanho, dureza, quantidade, valor) VALUES (?, ?, ?, ?, ?, ?)";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setInt(1, rocha.getMaterial());
           stmt.setString(2, rocha.getNome_roc());
           stmt.setDouble(3, rocha.getTamanho());
           stmt.setDouble(4, rocha.getDureza());
           stmt.setDouble(5, rocha.getQuantidade());
           stmt.setDouble(6, rocha.getValor());
          
          
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Rocha cadastrado com sucesso!!");}
            }
        
        public void editarrocha (Rocha rocha) throws SQLException{
                
        String sql = "UPDATE rocha set nome=? where id=?";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, rocha.getNome_roc());
           stmt.setInt(2, rocha.getMaterial());
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Rocha atualizada com sucesso!!");}
            }
        
        public void deletarrocha (int material) throws SQLException{
                
        String sql = "DELETE rocha where material=?";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
    
           stmt.setInt(1, material);
        
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Rocha deletada com sucesso!!");}
            else {
            System.out.println("Nenhuma rocha foi encontrada com o material: " + material);
        }
            }

        
         public  List<Rocha> Listagem() throws SQLException{
             String sql = "SELECT * FROM rocha";
            List<Rocha> Listarocha = new ArrayList<>();
            Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Rocha rocha = new Rocha(  
               rs.getString("nome_roc"),
               rs.getInt("material"),
               rs.getDouble("dureza"),
               rs.getDouble("quantidade"),
               rs.getDouble("tamanho"),
               rs.getDouble("valor")
                );
                Listarocha.add(rocha);
            }
            return Listarocha;
                    
            
           
         
    
    }

}
