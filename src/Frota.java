import java.util.ArrayList;
import java.util.List;

public class Frota{
    List <Veiculo> veiculos = new ArrayList<>();

    public void cadFrota(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    public void exibirFrota(){
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println((i + 1) + " - " + veiculos.get(i).exebirInfo());
        }
    }
    public double calcularViagem(){
        double total = 0;
        for (int i = 0; i < veiculos.size(); i++) {
            total = total + veiculos.get(i).calcularCustoViagem(100);
        }
        return total;
    }

}
