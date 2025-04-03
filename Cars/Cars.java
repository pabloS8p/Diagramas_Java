package Cars;

public class Cars {
    private String marca;
    private String matricula;
    private String modelo;
    private double velMax;

    public Cars(String marca, String matricula, String modelo, double velMax){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.velMax = velMax;
    }

    public void arrancar(){}
    public void acelerar(){}
    public void detener(){}
    public void cocheCalado(){}

    @Override
    public String toString(){
        return "marca " + marca + "matricula " + modelo + "velocidad maxima " + velMax;
    }
}