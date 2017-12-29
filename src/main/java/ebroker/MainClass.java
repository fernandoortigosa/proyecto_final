package ebroker;

public class MainClass {

	public static void main(String[] args) {
		new MainClass().saludar("Pepe");
	}

	public void saludar(String nombre) {
		String mensaje = crearMensaje(nombre);
		System.out.println(mensaje);
	}

	public String crearMensaje(String nombre) {
		return String.format("Hola %s", nombre);
	}

}