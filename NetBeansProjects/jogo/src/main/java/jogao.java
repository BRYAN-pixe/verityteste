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
        System.out.println("2-Listar sapatos cadastrados");
        System.out.println("3-Sair do sistema");
        
        int id;
        String nome;
        double larp;
        String especialidade;
        int nivel;
        double velocidade;
        double forca;
        double capacidade;
        double energia;
 int opc = sc.nextInt();

 ForgeiroController controller = new ForgeiroController();
 switch(opc)
     
 {
     case 1: 
         System.out.println("Cadastrar sapato;");
         sc.nextLine();
         System.out.println("Nome do sapato: ");
         nome = sc.nextLine();
         System.out.println("Especialidade do forgeiro: ");
         especialidade = sc.nextLine();
        
         controller.inserirforgeiro(nome, 1.0, especialidade, 1, 1.0, 1.0, 1.0, 1.0);
         break;
     case 2:
         System.out.println("Listagem dos sapatos:"); 
       controller.Listagem();
     break;
     case 3:
     System.out.println("Tchau");
     System.exit(0);
 }
        
        
        
        
    }
   
    
    
    
    

}