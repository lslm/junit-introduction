import java.util.Scanner;

public class TestIntroduction {
    public static void main(String[] args) {
        int option;

        CustomerDB customerDB = new CustomerDB();
        ProductDB productDB = new ProductDB();
        OrderDB orderDB = new OrderDB();

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Sistema de vendas");
            System.out.println("------------------------------");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar produto");
            System.out.println("3 - Criar pedido de venda");
            System.out.println("4 - Listar pedidos de venda");

            System.out.print("Selecione a opção: ");
            option = scanner.nextInt();

            process(option);
        } while(option != 0);
    }

    static void process(int option) {
        switch (option) {
            case 1: {

            }
            case 2: {

            }
            case 3: {

            }
            case 4: {

            }
        }
    }
}
