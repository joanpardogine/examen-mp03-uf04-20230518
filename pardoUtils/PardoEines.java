package pardoUtils;

public class PardoEines {
// Constructor
    private PardoEines() {
        throw new IllegalStateException("Classe PardoEines NO instanciable!");
    }
 
    public static int aleatori(){
        return (int) (Math.random() * 100);
    }
    
    public static int aleatoriAmbNegatius() {
        return (int) (Math.random()*(100-(-100))+(-100));
    }
    public static void pardoMostraVector(char[] vectorAMostrar) {
        for (int i = 0; i < vectorAMostrar.length; i++) {
            System.out.print(vectorAMostrar[i]);
            if (i<vectorAMostrar.length - 1){
                System.out.print("-");
            }
        }

    }
    public static void pardoMostraVectorEnters(int[] vectorAMostrar) {
        for (int i = 0; i < vectorAMostrar.length; i++) {
            System.out.print(vectorAMostrar[i]);
            if (i<vectorAMostrar.length - 1){
                System.out.print("   ");
            }
        }

    }
    
    public static int pardoAletoriEnterRang() {
        final int ENTER_MIN = 0;
        final int ENTER_MAX = 100;

        return (int) (Math.random()*(ENTER_MAX-(ENTER_MIN))+(ENTER_MIN));
    }

    public static void main(String[] args) {
        char[] vectorCaracters = {'T','G','T','C','C','T','G','A',
        'G','G','A','T','C','A','T','A'};

        pardoMostraVector(vectorCaracters);

    }
    
    
}
