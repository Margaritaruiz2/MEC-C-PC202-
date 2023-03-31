import java.util.ArrayList;

class Farmacia {
    static ArrayList<String> listNomb;
     static ArrayList<Farmacia> listFar;
     String nombre;
     String direccion;
     String telefono;
     ArrayList<Cita> citas;
     
     public static void gestionFarmacias(){
         if(listNomb == null)
            listNomb = new ArrayList<String>();
         String nombreFar = Lectura.nextString("\n\nNombre farmacia: ");
         if(listNomb.contains(nombreFar.toLowerCase().replaceAll(" ", ""))) {
             System.out.println("Farmacia ya existe!!");
            crud(nombreFar);
         }else{
             System.out.println("Farmacia nueva!!");
             listNomb.add(nombreFar.toLowerCase().replaceAll(" ", ""));
         }
         
     }
     
     public static void crud(String drogueria){
         int sel = Lectura.nextInt("\n1. Colsultar 2.Modificar 3.Borrar\n"
                    + "==>");
                    switch(sel){
                        case 1:
    if (listNomb.contains(drogueria.toLowerCase().replaceAll(" ", ""))) {
        // Buscar la farmacia en la lista de objetos
        Farmacia farmacia = null;
        for (Farmacia f : listFar) {
            if (f.nombre.equalsIgnoreCase(drogueria)) {
                farmacia = f;
                break;
            }
        }
        if (farmacia != null) {
            // Imprimir los datos de la farmacia
            System.out.println("Nombre: " + farmacia.nombre);
            System.out.println("Direccion: " + farmacia.direccion);
            System.out.println("Telefono: " + farmacia.telefono);
            // Imprimir las citas de la farmacia
            System.out.println("Citas:");
            for (Cita c : farmacia.citas) {
                System.out.println("- " + c);
            }
        } else {
            System.out.println("Farmacia no encontrada.");
        }
    } else {
        System.out.println("Farmacia no existe.");
    }
    break;
                        case 2:break;
                        case 3:break;
                        
                    }
         
    
     }
      
}
   

