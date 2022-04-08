/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apconsumo;

/**
 *
 * @author biblioteca
 */
public class Carro {
    //atributos
    private int km;
    private float litros;
    private float preco;
    
    
    //construtor
    public Carro(int km, float litros){
        this.km = km;
        this.litros = litros;
    }
        public Carro(float litros, int km){
        this.km = km;
        this.litros = litros;
    }
   //metodos de acesso
        public int getkm(){
            return this.km;
            
        }
        public void setkm(int km){
            this.km = km;
        }
        public float getlitros(){
            return this.litros;
        }
        public void setlitros(float litros){
            this.litros = litros;
        }
        //comportamento
        public float consumo(){
            return getkm()/getlitros();
            
        }
        
        //metodos de exibição dos dados
        @Override
        public String toString(){
            String saida =  " Consumo do Veiculo";
            saida += "\n (km): " + getkm();
            saida += "\n Litros de gasolina: "+ getlitros();
            saida += "\n Consumo(km) :" + consumo();
            saida += "\n Custo da gasolina(R$):" + getPreco();
            saida += "\n Custo do tanque(R$):"+ valorTanque();
            return saida;
            
        }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float valorTanque(){
        return getlitros()*getPreco();
    }   
}
