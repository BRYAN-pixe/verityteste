package com.mycompany.jogo.controllers;


import com.mycompany.jogo.DAOS.ForgeiroDAO;
import java.util.List;


/**
 *
 * @author Bryan
 */
public class ForgeiroController {
     ForgeiroDAO dao = new ForgeiroDAO();
   
    
    public void inserirForgeiro(int id, String nome, String especialidade, double valocidade, double energia, double forca, double capacidade){
        Sapato sapato = new Sapato (codigo, nome, marca, numero, preco, estoque);
        
           try {
               if (preco <= 0){
                   System.out.println("Vaza capeta, preço tem q ser positivo");
                   System.exit(0);
               }
               else if (numero < 10 || numero > 50)
               {
                   System.out.println("Vaza capeta, numero tem q estar entre 10 e 50");
                   System.exit(0);
               }
               else if(estoque < 0){
                    System.out.println("Vaza capeta, tem que ser não-negativo");
                   System.exit(0);
               }
               else if(nome == "")
               {
                    System.out.println("Vaza capeta, tem que ter nome");
                   System.exit(0);
               }
                else if(marca == "")
               {
                    System.out.println("Vaza capeta, tem que ter marca");
                   System.exit(0);
               }
        dao.inserirsapato(sapato);
        
        }catch(SQLException e) {
           
            System.out.println(e);
        } 
       
    }
    public void Listagem(){
        
        
       try{  
    List<Sapato> lista = dao.Listagem();
       for(Sapato a : lista){
           System.out.println(a);
       }
      
       }catch(SQLException e) {
           
            System.out.println(e);
        } 
}
    }
