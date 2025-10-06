public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;
    private String tipo;

    public Veiculo(String placa, double capacidadeCarga, String tipo) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipo(){
        return tipo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }


    public abstract String exebirInfo();
    public abstract double calcularCustoViagem(double distancia);
}
