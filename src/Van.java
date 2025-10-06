public abstract class Van extends Veiculo {
    private String tipo = "Van";

    public Van(String placa, double capacidadeCarga){
        super(placa, capacidadeCarga, "Van");
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public String exebirInfo(){
        return "Placa: " + getPlaca() + ", Capacidade: " + getCapacidadeCarga() + ", Tipo: " + tipo;
    };

    public double calcularCustoViagem(double distancia){
        return (distancia * 2) + 50;
    }
}
