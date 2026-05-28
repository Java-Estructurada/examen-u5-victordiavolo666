public class examen {
    //clase main
    public static void main(String[] args) {
        String[] nCuadrillas = {"Los Halcones", "Cuadrilla Norte", "Fuerza Verde"};
        int[][] cSemanas = {
            {120, 135, 110, 140, 150},
            {90, 105, 100, 115, 120},
            {150, 160, 155, 170, 165}
        };
        generarReporteGeneral(nCuadrillas, cSemanas);
    }
    //modulo 1
    public static int calcularTotalSemana(int[] arreglo) {
        int acumulador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            acumulador = acumulador + arreglo[i];
        }
        return acumulador;
    }
    //modulo 2
    public static void generarReporteGeneral(String[] nCuadrillas, int[][] cSemanas) {
        System.out.println("=================================================");
        System.out.println("🚜 REPORTE SEMANAL DE COSECHA DE AGUACATE 🚜");
        System.out.println("=================================================");
        System.out.println(" Analizando rendimiento de las cuadrillas...");
        int maxCajas = -1;
        String cuadrillaCampeona = "";
        for (int i = 0; i < nCuadrillas.length; i++) {
            int totalCuadrilla = calcularTotalSemana(cSemanas[i]);
            System.out.println(" Cuadrilla: " + nCuadrillas[i] + " Total de cajas recolectadas: " + totalCuadrilla);
            if (totalCuadrilla > maxCajas) {
                maxCajas = totalCuadrilla;
                cuadrillaCampeona = nCuadrillas[i];
            }
        }
        System.out.println("¡CUADRILLA CAMPEONA DE LA SEMANA! ");
        System.out.println(cuadrillaCampeona + " con un récord de " + maxCajas + " cajas.");
        System.out.println("=================================================");
    }
}
