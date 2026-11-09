package com.mycompany.jogo.controllers;


import com.mycompany.jogo.DAOS.ForgeiroDAO;
import com.mycompany.jogo.classes.Forgeiro;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author Bryan
 */
public class ForgeiroController {
     ForgeiroDAO dao = new ForgeiroDAO();
   
    
    public void inserirforgeiro(String nome, double larp, String especialidade, int nivel, double velocidade,  double forca, double capacidade, double energia){
        Forgeiro forgeiro = new Forgeiro (nome, larp, especialidade, nivel, velocidade, forca, capacidade, energia);
        
           try {
               
        dao.inserirforgeiro(forgeiro);
        
        }catch(SQLException e) {
           
            System.out.println(e);
        } 
    }
  public void editarforgeiro (int id, String nome){
        Forgeiro forgeiro = new Forgeiro (nome, id);
        try{
        dao.editarforgeiro(forgeiro);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
  public void deletarforgeiro (int id){
  
        try{
        dao.deletarforgeiro(id);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
       
    
    public void Listagem(){
        
        
       try{  
    List<Forgeiro> lista = dao.Listagem();
       for(Forgeiro a : lista){
           System.out.println(a);
       }
      
       }catch(SQLException e) {
           
            System.out.println(e);
        } 
}
    }
