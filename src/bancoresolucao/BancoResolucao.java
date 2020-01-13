/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoresolucao;

/**
 *
 * @author formando
 */
public class BancoResolucao {
    

    int numero;
  String titular;
  double saldo;
 double quantidade ;
 

   public void Conta(){}

 public double getSaldo(){return saldo;}
 public void setSaldo(double saldo){this.saldo=saldo;}
 public String getTitular(){return titular;}
 public void setTitular(){this.titular=titular;}
 public int getNumero(){return numero;}
 public void setNumero(){this.numero=numero;}
 public double getQuantidade(){return quantidade;}
 public void setQuantidade(double quantidade){this.quantidade=quantidade;}

 //Métodos
public void saca(double quantidade) {
 this.saldo -= quantidade;
 }
 public void deposita(double quantidade) {
 this.saldo += quantidade;
 }
 public void calcularendimento() {
this.saldo += this.saldo*0.1;
 }
    public static void main(String[] args) {
        
        Conta c1=new Conta();
 c1.setSaldo(1000);
 c1.setQuantidade(500);
 c1.saca(c1.getQuantidade());
 System.out.println("O Saldo actual é " + c1.saldo);
 c1.setQuantidade(300);
 c1.deposita(c1.getQuantidade());
 System.out.println("O Saldo actual é " + c1.saldo);
 c1.calcularendimento();
 System.out.println("O Saldo actual é " + c1.saldo);

        
   }
    
}
