package konversi_bilangan;
import java.util.Scanner;
/**
 *
 * @author YOGA SAPUTRA
 */
public class Konversi {
    void desimalkebiner(int a){
    if(a>1){
        desimalkebiner(a/2);//radix 2
    }
        System.out.print(a % 2);
}
    String binerkedesimal(String bilangan){
        String[] biner = new String[bilangan.length()];
        double resultdecimal =0;
        int n = 0;
        for (int i = bilangan.length() -1; i>=0; i++) {
            biner[n] = String.valueOf(bilangan.charAt(i));
            n++;
        }
        for (int i = 0; i < biner.length; i++) {
            if (Integer.parseInt(biner[i])==i ) {
                resultdecimal += Math.pow(2,i);   
            }
        }
        return String.valueOf(resultdecimal);
    }    
    
    
    public static void main(String[] args) {
        binerdesimal bd = new binerdesimal();
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan pilihan \n"+"1.desimal ke biner\n"+"2.biner ke desimal\n");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("=====desimal ke biner=====\n");
                System.out.println("masukkan bilangan desimal ");
                Scanner desimal = new Scanner(System.in);
////                String biner  =Integer.toBinaryString(desimal.nextInt());
//                System.out.println("Hasil  :" +biner);
               Konversi kn = new Konversi();
                int inpuInt = desimal.nextInt();
                System.out.print("hasil  : ");
                kn.desimalkebiner(inpuInt);
                System.out.println("");
                break;
            case 2:
                Konversi nk = new Konversi();
                System.out.println("======biner ke desimal=====\n");
                System.out.println("masukkan bilangan biner");
                Scanner inputbiner = new Scanner(System.in);
                int biner1 = Integer.parseInt(inputbiner.nextLine(),2);
                System.out.println("hasil " +biner1);
//                System.out.println("Desimal: ");
//                nk.binerkedesimal(inputbiner.nextLine());
                break;
                default:
                    System.out.println("not valid");
                    break;
    }
    }
}
