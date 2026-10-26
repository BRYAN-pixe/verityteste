package com.mycompany.jogo.DAOS;

import com.mycompany.jogo.DAOS.utils.Conexao;
import com.mycompany.jogo.classes.Forgeiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class ForgeiroDAO {
    String url = "jdbc:postgresql://localhost:5432/jogo"; // URL do banco de dados
        String usuario = "postgres"; // Nome de usuário do PostgreSQL
        String senha = "postgresql"; // Senha do PostgreSQL
    
        public void inserirforgeiro (Forgeiro forgeiro) throws SQLException{
            
            
            
        String sql = "INSERT INTO Forgeiro(id, nome, larp, especialidade, nivel, forca, velocidade, capacidade, energia ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
       Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setInt(1, forgeiro.getId());
           stmt.setString(2, forgeiro.getNome());
           stmt.setDouble(3, forgeiro.getLarp());
           stmt.setString(4, forgeiro.getEspecialidade());
           stmt.setDouble(5, forgeiro.getVelocidade());
           stmt.setDouble(6, forgeiro.getForca());
           stmt.setDouble(7, forgeiro.getCapacidade());
           stmt.setDouble(8, forgeiro.getEnergia());
           stmt.setInt(9, forgeiro.getNivel());
          
         
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Forgeiro cadastrado com sucesso!!");}
            }
        
         public  List<Sapato> Listagem() throws SQLException{
             String sql = "SELECT * FROM sapato";
            List<Sapato> Listasapato = new ArrayList<>();
            Conexao conexao = new Conexao();
        
            Connection connection =  conexao.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);
           
           
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Sapato sapato = new Sapato(                
                rs.getInt("codigo"),
                rs.getString("nome"),
                rs.getString("marca"),
                rs.getInt("numero"),
                rs.getDouble("preco"),
                rs.getInt("estoque")
                );
                Listasapato.add(sapato);
            }
            return Listasapato;
                    
            
           
         
    
    }

}