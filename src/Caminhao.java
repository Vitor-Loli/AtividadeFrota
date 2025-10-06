public abstract class Caminhao extends Veiculo {
    private String tipo = "Caminhão";

    public Caminhao(String placa, double capacidadeCarga) {
        super(placa, capacidadeCarga, "Caminhao");
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public String exebirInfo(){
        return "Placa: " + getPlaca() + ", Capacidade: " + getCapacidadeCarga() + ", Tipo: " + tipo;
    };

    public double calcularCustoViagem(double distancia){
        return distancia * (getCapacidadeCarga() / 1000);
    }
}
