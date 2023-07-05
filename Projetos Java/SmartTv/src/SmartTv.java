public class SmartTv {
    boolean ligada = true;
    int canal = 20;
    int volume = 50;

//Criação dos métodos

public void ligar(){
   this.ligada = true;
}

public void desligar(){
    this.ligada = false;
}

public void aumentar(){
    this.volume++;

}

public void diminuir(){
    this.volume--;
}

public void aumentarCanal(){
    this.canal++;
}

public void diminuirCanal(){
    this.canal--;
}

public void mudarCanal(int canal){
    this.canal = canal;
}


}

