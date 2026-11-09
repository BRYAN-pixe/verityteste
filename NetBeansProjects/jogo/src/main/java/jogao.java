import com.mycompany.jogo.controllers.EquipamentoController;
import com.mycompany.jogo.controllers.ForgeiroController;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class jogao {

    public static void main(String[] args) throws SQLException {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1-Cadastrar Forgeiro");
        System.out.println("2-Cadastrar Equipamento");
        System.out.println("3-Cadastrar Rocha");
        System.out.println("4-Cadastrar Ambiente");
        
        
        int id;
        String nome;
        double larp;
        String especialidade;
        int nivel;
        double velocidade;
        double forca;
        double capacidade;
        double energia;
        String nome_equi;
        String tipo;
 int opc = sc.nextInt();

 ForgeiroController controller1 = new ForgeiroController();
 EquipamentoController controller2 = new EquipamentoController();
 switch(opc)
     
 {
     case 1: 
         System.out.println("Cadastrar forgeiro;");
         sc.nextLine();
         System.out.println("Nome do forgeiro: ");
         nome = sc.nextLine();
         System.out.println("Especialidade do forgeiro: ");
         especialidade = sc.nextLine();
        
         controller1.inserirforgeiro(nome, 1.0, especialidade, 1, 1.0, 1.0, 1.0, 1.0);
         break;
     case 2:
         System.out.println("Cadastrar equipamento;");
         sc.nextLine();
         System.out.println("Nome do equipamento: ");
         nome_equi = sc.nextLine();
         System.out.println("Tipo do equipamento: ");
         tipo = sc.nextLine();
        
         controller2.inserirequipamento(nome_equi, 1, tipo, 100.0, 0);
     break;
     case 3:
     System.out.println("Tchau");
     System.exit(0);
 }
        
        
        
        
    }
   
    
    
    
    

}