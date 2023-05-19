import pardoUtils.PardoEines;

public class PardoVectors {
    public static void main(String[] args) {
        
        int[] vOrigen = new int[10];
        int[] vOposat = new int[10];

     for (int i = 0; i < vOrigen.length; i++) {
        vOrigen[i] = PardoEines.aleatoriAmbNegatius();
        vOposat[i] = vOrigen[i] * (-1);
     }   
    
     System.out.print("S'ha rebut ");
     PardoEines.pardoMostraVectorEnters(vOrigen);
     System.out.print("\nS'ha creat ");
      PardoEines.pardoMostraVectorEnters(vOposat);
      
    }
}
