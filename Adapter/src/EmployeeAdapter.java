public class EmployeeAdapter {
    public static void displayInfo(EmpleadoUCA emp) {
        Employee n = new Employee();
        n.setFullName(emp.getNombres() + " " + emp.getApellidos());
        String[] dateParts = emp.getFechaNacimiento().split("-");
        n.setAge(2024-Integer.valueOf(dateParts[2]));
        n.setHeightCms((int) (emp.getAlturaMs()*100));
        n.setWeightKgs(emp.getPesoLbs()/2.2);
        EmployeeManager.displayInfo(n);
    }
}
