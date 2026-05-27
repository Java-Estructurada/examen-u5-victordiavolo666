public class examen{
    public static void main(String[]args){
    String [] nCuadrillas = {"Los Halcones","Cuadrilla Norte","Fuerza Verde"};
    int [][] cSemanas ={ {120,135,110,140,150},
                        {90,105,100,115,120},
                        {150,160,155,170,165}};
        int[] lHalcones = cSemanas[0];
        int totalHalcones = calcularTotalSemana(lHalcones);
        int [] cNorte = cSemanas[1];
        int totalcNorte = calcularTotalSemana(cNorte);
        int [] fVerde = cSemanas[2];
        int totalfVerde = calcularTotalSemana(fVerde);
    
    System.out.println("=================================================");
    System.out.println("🚜 REPORTE SEMANAL DE COSECHA DE AGUACATE 🚜");
    System.out.println("=================================================");
    System.out.println("Analizando rendimiento de las cuadrillas...");
    System.out.println("Cuadrilla:" + nCuadrillas[0]);
    System.out.println("Total de cajas recolectadas:"  + totalHalcones);
    System.out.println("Cuadrilla:" + nCuadrillas[1] );
    System.out.println("Total de cajas recolectadas:"+ totalcNorte);
    System.out.println("Cuadrilla:" + nCuadrillas[2]);
    System.out.println("Total de cajas recolectadas:" + totalfVerde);

    }
        public static int calcularTotalSemana(int[] arreglo){
        int acumulador =0;
        for(int i=0;i<arreglo.length;i++){
        acumulador = acumulador + arreglo[i];
}
        return acumulador;
    }
    
}
