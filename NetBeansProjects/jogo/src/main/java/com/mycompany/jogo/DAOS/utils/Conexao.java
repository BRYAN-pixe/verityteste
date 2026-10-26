/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo.DAOS.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class Conexao {
      String url = "jdbc:postgresql://localhost:5432/jogo"; // URL do banco de dados
        String usuario = "postgres"; // Nome de usuário do PostgreSQL
        String senha = "postgresql"; // Senha do PostgreSQL
        
        public Connection conectar() throws SQLException{
         
            Connection connection = DriverManager.getConnection(url, usuario, senha);
            return connection;
            
        } 
}