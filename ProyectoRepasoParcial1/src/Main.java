import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import Empleado.*;
import Empleado.EmpleadoTiempoCompleto;
import Persona.Persona;

public class Main {
    ArrayList<Empleado> static listaEmpleados = new ArrayList<Empleado>();
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int opcion = 0;
        while(true){
            try{
                imprimirMenu();
                opcion = sn.nextInt();
                sn.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Por favor, ingrese un dato válido.");
            }
            if(opcion==0){
                System.out.println("Hasta pronto!");
                break;
                // Detener el while
            }
            switch(opcion){
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida.");
                    break;
            }
        }
    }
    private static void agregarEmpleado(){
        String DUI, nombre, numeroTelefono, carnet;
        Date fechaNacimiento;
        float salarioBase
        char sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el DUI: ");
        DUI = sc.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del empleado (dd/mm/aaaa): ");
        fechaNacimiento = new Date(sc.nextLine());
        System.out.println("Ingrese el sexo (H/M): ");
        sexo = sc.nextLine().toUpperCase().charAt(0);
        System.out.println("Ingrese el número de teléfono (con guiones): ");
        Persona persona = new Persona(DUI, nombre, fechaNacimiento, sexo, numeroTelefono);

        System.out.println("Ingrese el carnet del empleado: ");
        carnet = sc.nextLine();
        System.out.println("Ingrese el salario base del empleado: ");
        salarioBase = sc.nextFloat();
        sc.nextLine();

        int tipoEmpleado = obtenerTipoEmpleado();
        Empleado empleado = null;
        switch(tipoEmpleado){
            case 1:
                empleado = new EmpleadoTiempoCompleto(persona, carnet, salarioBase);
                break;

            case 2:
                System.out.println("Ingrese la cantidad de horas de trabajo base: ");
                int horasBase = sc.nextInt();
                sc.nextLine();
                empleado = new EmpleadoTiempoParcial(persona, carnet, salarioBase, horasBase);
                break;
            case 3:
                empleado = new EmpleadoTemporal(persona, carnet, salarioBase);
        }
    }
    private static int obtenerTipoEmpleado(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while(true){
            try{
                System.out.println("Seleccione una opción: \n"
                + "\t1. Empleado de tiempo completo."
                + "\t2. Empleado de tiempo parcial."
                + "\t3. Empleado temporal");
                if(opcion>=1 && opcion<=3) return opcion;
                System.out.println("Por favor, ingrese una opción válida.");
            } catch(Exception e){
                System.out.println("Por favor, ingrese un dato válido.");
            }
        }
    }
    private static void mostrarListaEmpleados(){
        System.out.println("#\t|Nombre|\t\t|Carnet|\t\t|Teléfono|\t\t|Salario|");
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado emp = listaEmpleados.get(i);
            System.out.println((i+1)+"\t|"+emp.getNombre()+"|\t\t|"+emp.getCarnet()+"|\t\t|"+emp.getTelefono()+"|\t\t|"+emp.obtenerSalario()+"|");
        }
    }
    private static void imprimirMenu(){
        System.out.println("Seleccione una opción: \n"
        + "\t1. Agregar Empleado\n"
        + "\t2. Modificar Empleado\n"
        + "\t3. Eliminar Empleado\n"
        + "\t4. Mostrar datos de un Empleado\n"
        + "\t5. Mostrar todos los Empleados\n"
        + "\t0. Salir");
        System.out.println("Opción > ");

    }
}
