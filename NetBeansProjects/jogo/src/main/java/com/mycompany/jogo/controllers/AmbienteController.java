package com.mycompany.jogo.controllers;

import com.mycompany.jogo.DAOS.AmbienteDAO;
import com.mycompany.jogo.classes.Ambiente;
import com.mycompany.jogo.classes.Rocha;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class AmbienteController {
      AmbienteDAO dao = new AmbienteDAO();
   
    
    public void inserirambiente(String nome_amb, int id_amb, String descricao, String minerios, int nivel_min){
        Ambiente ambiente = new Ambiente(nome_amb, id_amb, descricao, minerios, nivel_min);
        
           try {
               
        dao.inserirambiente(ambiente);
        
        }catch(SQLException e) {
           
            System.out.println(e);
        } 
    }
  public void editarambiente (int id_amb, String nome_amb, String descricao){
        Ambiente ambiente = new Ambiente (nome_amb, id_amb, descricao );
        try{
        dao.editarambiente(ambiente);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
  public void deletarambiente(int id_amb){
  
        try{
        dao.deletarambiente(id_amb);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
       
    
    public void Listagem(){
        
        
       try{  
    List<Ambiente> lista = dao.Listagem();
       for(Ambiente a : lista){
           System.out.println(a);
       }
      
       }catch(SQLException e) {
           
            System.out.println(e);
        } 
}
}
