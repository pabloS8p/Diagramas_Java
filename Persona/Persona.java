public class Persona {
    protected String DNI;
    protected String nombre;
    protected String apellido1;
    protected String email;

   protected Persona(String DNI, String nombre, String apellido1, String email){
    this.DNI = DNI;
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.email = email;
   } 

   public void hablar(){
   }

   public void caminar(){
   }

   public void correr(){
   }

   public void sentar(){
   }

   @Override
   public String toString(){
    return "DNI " + DNI + "Nombre " + nombre + "apellido " + apellido1 + "email " + email;
   }
}