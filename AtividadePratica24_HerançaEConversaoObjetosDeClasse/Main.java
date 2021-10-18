/*_  Crie uma classe veiculo com atributos públicos: marca, modelo e placa. - OK!
  _  Crie uma classe carro com os atributos públicos: número de portas e capacidade do porta-malas. - OK!
  _  Crie uma classe Main com um método main. - OK!
  _  Crie um objeto de classe Veículo e uma de classe Carro e 
     atribua valores para as propriedade de cada objeto. - OK!
  _  Crie um objeto da classe Object através da instância da classe Veículo. - OK!
  _  Crie um objeto da classe Object através da instância da classe Carro. - OK!
  _  Converta o primeiro objeto da Object novamente para um novo objeto da classe Veículo.
  _  Converta o segundo objeto da Object novamente para um novo objeto da classe Carro.
  _  Imprima todos dos dados do objeto de Veículo convertido.
  _  Imprima todos dos dados do objeto de Carro convertido.
*/
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.marca = "Peugeot";
        veiculo1.modelo = "208";
        veiculo1.placa = "ABC1D23";

        Carro carro1 = new Carro();
        carro1.capacidadePortaMalas = 311;
        carro1.numeroPortas = 4;

        Object obj1 = veiculo1;
        Object obj2 = carro1;

        Veiculo veiculo2 = (Veiculo)obj1;
        Carro carro2 = (Carro)obj2;

        imprimir(veiculo2);

        imprimir(carro2);


    }
    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }
    
}
