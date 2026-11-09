package com.mycompany.jogo.controllers;

import com.mycompany.jogo.DAOS.EquipamentoDAO;
import com.mycompany.jogo.classes.Equipamento;
import com.mycompany.jogo.classes.Forgeiro;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class EquipamentoController {
         EquipamentoDAO dao = new EquipamentoDAO();
   
    
    public void inserirequipamento(int id_equi, String nome_equi,  int nivel_equi, String tipo, double durabilidade, int encantamento){
        Equipamento equipamento = new Equipamento(id_equi, nome_equi, nivel_equi, tipo, durabilidade, encantamento );
        
           try {
               
        dao.inserirequipamento(equipamento);
        
        }catch(SQLException e) {
           
            System.out.println(e);
        } 
    }
  public void editarequipamento (int id_equi, String nome_equi){
        Equipamento equipamento = new Equipamento (nome_equi, id_equi );
        try{
        dao.editarequipamento(equipamento);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
  public void deletarequipamento (int id){
  
        try{
        dao.deletarequipamento(id);
        }catch(SQLException e) {
            System.out.println(e);
        } 
       
    }
       
    
    public void Listagem(){
        
        
       try{  
    List<Equipamento> lista = dao.Listagem();
       for(Equipamento a : lista){
           System.out.println(a);
       }
      
       }catch(SQLException e) {
           
            System.out.println(e);
        } 
}
}
