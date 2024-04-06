package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	// EJEMPLO PARA QUE EL ALUMNO REGISTRE LAS NOTAS FINALES DE 4 MATERIAS.

	public static void main(String[] args) {
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
	}

	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el legajo del alumno");
		Integer legajo = teclado.nextInt();

		System.out.println("Ingrese el nombre del alumno");
		String nombre = teclado.next();

		System.out.println("Ingrese el apellido del alumno");
		String apellido = teclado.next();

		alumno.setLegajo(legajo);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		return alumno;
	}

	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner teclado = new Scanner(System.in);
		while (numMaterias <= 1) {
			System.out.println("Ingrese Código de la Materia");
			String codigoMateria = teclado.next();

			System.out.println("Ingrese Nombre de la Materia");
			String nombreMateria = teclado.next();

			Materia materia = new Materia(codigoMateria, nombreMateria);

			System.out.println("Ingrese el código del registro de nota");
			String codigoNota = teclado.next();

			System.out.println("Ingrese la nota final");
			Float notaFinal = teclado.nextFloat();

			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, notaFinal);
			System.out.println(registroNota);
			numMaterias++;
		}
	}

}
