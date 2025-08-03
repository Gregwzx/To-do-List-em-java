import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>(); 

        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt(); 
            scanner.nextLine(); 

            
            if (opcao == 1) {
                System.out.print("Digite o que você quer adicionar: ");
                String tarefa = scanner.nextLine(); 
                tarefas.add(tarefa);
                System.out.println("Tarefa adicionada!");
            } else if (opcao == 2) {
                System.out.println("Sua lista de tarefas:");
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println((i + 1) + ". " + tarefas.get(i));
                }
            } else if (opcao == 3) {
                System.out.print("Qual item você quer remover? (digite o número): ");
                int indice = scanner.nextInt();
                scanner.nextLine(); 

                
                if (indice > 0 && indice <= tarefas.size()) {
                    tarefas.remove(indice - 1); 
                    System.out.println("Tarefa removida!");
                } else {
                    System.out.println("Índice inválido!");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                executando = false; 
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close(); 
    }
}
