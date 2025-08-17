import java.util.Scanner;

public class Banco {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        
        double dinheiro = 0;
        boolean estaRodando = true;

        do{

            System.out.println("*****************");
            System.out.println("PROGRAMA DE BANCO");
            System.out.println("*****************");
            System.out.println("1 - Extrato");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Digite o que deseja fazer (1-4): ");
            int escolha = sc.nextInt();

            System.out.println("*****************");

            switch(escolha){
                case 1 ->{
                    System.out.println("R$"+dinheiro);
                }
                case 2 -> {
                    dinheiro = adicionarDeposito(dinheiro);
                    System.out.println("Depósito realizado!");
                }
                case 3 -> {
                        dinheiro = diminuirSaque(dinheiro);
                }
                case 4 -> estaRodando = false;
                default -> { 
                    System.out.println("Número inválido, favor tentar novamente.");
                }
            }

        } while(estaRodando);

        System.out.println("Obrigado por usar nossos serviços, volte novamente!");
        sc.close();


    }

    static double adicionarDeposito(double dinheiro){

        System.out.print("Digite o valor que deseja depositar: R$");
        double deposito = sc.nextDouble();


        if(deposito < 0 ){
            System.out.println("Não é possível depositar números negativos!");
            return dinheiro;
        }
        else{
            dinheiro+=deposito;
            System.out.println("Depósito realizado!");
            return dinheiro;
        }

    }

    static double diminuirSaque(double dinheiro){

        System.out.print("Digite a quantidade de dinheiro que deseja sacar: R$");
        double saque = sc.nextDouble();

        if(dinheiro-saque < 0 || dinheiro == 0){
            System.out.println("Você não possui saldo!");
            return dinheiro;
        }
        else if(saque < 0){
            System.out.println("Valor sacado não pode ser negativo!");
            return dinheiro;
        }
        else{
            dinheiro-=saque;
            System.out.println("Saque realizado!");
            return dinheiro;
        }

    }
}