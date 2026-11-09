package com.mycompany.jogo.controllers;


import com.mycompany.jogo.DAOS.RochaDAO;
import com.mycompany.jogo.classes.Rocha;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class RochaController {
       RochaDAO dao = new RochaDAO();
   
    
    public void inserirerocha(String nome_roc, int material, double tamanho, double dureza, double quantidade, double valor){
        Rocha rocha = new Rocha(nome_roc, material, tamanho, dureza, quantidade, valor);
        
           try {
               
        dao.inserirrocha(rocha);
        
        }catch(SQLException e) {
           
            System.out.println(e);
        } 
    }
  public void editarrocha (int material, String nome_roc){
        Rocha rocha = new Rocha (nome_roc, material );
        try{
        dao.editarrocha(rocha);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
  public void deletarrocha (int material){
  
        try{
        dao.deletarrocha(material);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
       
    
    public void Listagem(){
        
        
       try{  
    List<Rocha> lista = dao.Listagem();
       for(Rocha a : lista){
           System.out.println(a);
       }
      
       }catch(SQLException e) {
           
            System.out.println(e);
        } 
}
}
