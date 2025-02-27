package Exercicio03.Model;

public class Ponto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculaDistancia(Ponto p){
        double distancia=0;
        distancia=Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y,2));
        return distancia;
    }

    public double calculaDistanciaOrigem(){
        double distancia=0;
        distancia=Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y,2));
        return distancia;
    }

    public Ponto pontoMaisProximo(Ponto p1,Ponto p2){
        double  distancia1=0;
        double distancia2 =0;
            distancia1 =p1.calculaDistanciaOrigem();
            distancia2 =p2.calculaDistanciaOrigem();

            if (distancia1<distancia2){
                return p1;
            }
            return p2;

    }

    public String formataPonto(){
        return "("+this.x+","+this.y+")";
    }


}
