
public class Main {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Frota frota = new Frota();
        int opc = 0;
        String placa;
        double capacidade;
        int tipo;
        double total = 0;

        do{
            System.out.println("MENU\n");
            System.out.println("[1] - Adicionar veículo");
            System.out.println("[2] - Exibir veículos");
            System.out.println("[3] - Calcular custo de viagem");
            System.out.println("[4] - Sair");
            opc = teclado.readInt("Informe a opção desejada: ");

            switch (opc){
                case 1:
                    System.out.println("ADICIONAR VEÍCULO\n");
                    System.out.println("Informe o tipo do veículo:\n [1] - Caminhão\n[2] - Van");
                    tipo = teclado.readInt();
                    switch (tipo){
                        case 1:
                            placa = Teclado.readString("Informe a Placa do veículo: ");
                            capacidade = Teclado.readDouble("Informe a Capacidade do veículo (Em KG): ");
                            frota.cadFrota(new Caminhao(placa, capacidade) {});
                            break;
                        case 2:
                            placa = Teclado.readString("Informe a Placa do veículo: ");
                            capacidade = Teclado.readDouble("Informe a Capacidade do veículo (Em KG): ");
                            frota.cadFrota(new Van(placa, capacidade) {});
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                    }
                    break;
                case 2:
                    frota.exibirFrota();
                    break;

                case 3:
                    total = frota.calcularViagem();
                    System.out.println("O total das viagens dos veículos cadastrados é: R$" + total);
                    break;
                case 4:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while (opc != 4);

    }
}