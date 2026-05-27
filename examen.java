public class examen{
    public static void main(String[]args){
    String [] nCuadrillas = {"Los Halcones","Cuadrilla Norte","Fuerza Verde"};
    int [][] cSemanas ={ {120,135,110,140,150},
                        {90,105,100,115,120},
                        {150,160,155,170,165}};
        int[] lHalcones = cSemanas[0];
        int totalHalcones = calcularTotalSemana(lHalcones);
        System.out.println("Total Halcones: " + totalHalcones);
    }
        public static int calcularTotalSemana(int[] arreglo){
        //int [] lHalcones={120,135,110,140,150,};
        int acumulador =0;
        for(int i=0;i<arreglo.length;i++){
        acumulador = acumulador + arreglo[i];
}
        return acumulador;
    }
    public static 
}
