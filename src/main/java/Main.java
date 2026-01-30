import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Produtos> lista = new ArrayList<>();
        int comprar = 1;

        System.out.println("Lista de compras:");
        System.out.println("Digite o limite do cartão: ");
        int limite = scan.nextInt();
        scan.nextLine();//consome o buffer vazio

        while (limite > 0 && comprar == 1) {
            System.out.println("Digite o nome do item:");
            String nome = scan.nextLine();

            System.out.println("Digite o valor do item:");
            int valor = scan.nextInt();
            scan.nextLine();

            if (valor <= limite) {
                lista.add(new Produtos(nome, valor));
                limite -= valor;
                System.out.println("Item comprado!");
            } else {
                System.out.println("Saldo insuficiênte! O saldo é de " + limite);
            }
            System.out.println("Deseja comprar mais alguma coisa?1-sim/2-não");
            comprar = scan.nextInt();
            scan.nextLine();

        }
        Collections.sort(lista);

        System.out.println("\nItens comprados:");
        for (Produtos p : lista) {
            System.out.println(p.getNome() + " - R$ " + p.getValor());

        }
    }
}

