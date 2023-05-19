import pardoUtils.PardoEines;

public class PardoAdn {

    public static void main(String[] args) {
        char[] vAdn = { 'T', 'G', 'T', 'C', 'C', 'T', 'G', 'A',
                'G', 'G', 'A', 'T', 'C', 'A', 'T', 'A' };

        char[] vArn = new char[vAdn.length];

        for (int i = 0; i < vArn.length; i++) {
            if (vAdn[i] == 'T') {
                vArn[i] = 'U';
            } else {
                vArn[i] = vAdn[i];
            }
        }
        System.out.print("Cadena ADN rebuda = ");
        PardoEines.pardoMostraVector(vAdn);

        System.out.print("\nCadena ARN sortida = ");
        PardoEines.pardoMostraVector(vArn);
    }

}
