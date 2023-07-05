public class Usuario {
 public static void main(String[] args) { 
 
 SmartTv smartv = new SmartTv(); 
 //criação de um objeto

 System.out.println("Tv Ligada? " + smartv.ligada); 
 
 System.out.println(smartv.canal); 
 smartv.mudarCanal(13); 
 System.out.println("Canal Atual: " + smartv.canal); 
 System.out.println(smartv.volume); 
 smartv.diminuir(); 
 smartv.aumentar(); 
 System.out.println("Volume Atual: " + smartv.volume); 
 smartv.ligar(); 
 System.out.println("novo status: " + smartv.ligada); 
 
 smartv.desligar(); 
 System.out.println("novo status: " + smartv.ligada); 
 
 } 
}
