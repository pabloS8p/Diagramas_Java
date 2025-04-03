public class Main {
    public static void main(String[] args) {
        Animal pez = new Pez();
        Animal perro = new Perro();
        Animal gato = new Gato();
        
        pez.respirar();
        ((Pez) pez).nadar();
        
        perro.respirar();
        ((Perro) perro).ladrar();
        
        gato.respirar();
        ((Gato) gato).maullar();
    }
}