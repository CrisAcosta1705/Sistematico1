package LoginDeUsuario;
import java.util.Scanner;
public class LoginDeUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		String user;
		String password;
		int contador = 0;
		user = "Cristian";
		password = "Cris1705";
		
		while (contador < 3) {
			contador = contador + 1;
			
			System.out.println("Ingrese su nombre de usuario: ");
			user = tc.next();
			
			if (user.equals("Cristian")) {
				System.out.println("Usuario valido: " +user);
				
				System.out.println("Ingrese su contraseña");
				password = tc.next();
				
				if (password.equals("Cris1705"));
				System.out.println("Su contraseña es valida");
				System.out.println("Bienvenido al sistema");
				break;
				
			} else {
				System.out.println("Contraseña o nombre de usuario incorrectos");
						}
			
					}
			
			}
		
	}


