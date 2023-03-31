package ticocamaras;
import java.util.Scanner;
public class TicoCamaras 
{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        int camaras;
        int A;
        int B;
        int pares=0;
        int resto;
        System.out.println("Cuantas camaras se necesitan");
        camaras = Scan.nextInt();
        System.out.println("ingrese la cantidad de baterias A");
        A = Scan.nextInt();
        int bateriasA[] = new int [A];
        System.out.println("ingrese la cantidad de baterias B");
        B = Scan.nextInt();
        int bateriasB[] = new int [B];
        if(A==B)
        {
        pares = A;
        }
        else if (A>B)
        {
        pares = Math.abs(A-B);
        }
        else if (B>A)
        {
        pares = Math.abs(B-A);
        }
        int FuncionPar[] = new int [pares];
        resto = camaras-pares;
        for(int i = 0; i<A; i++)
        {
            System.out.println("ingrese la vida restante de la bateria A["+(i+1)+"]:");
            bateriasA[i] = Scan.nextInt();
        }
        for(int i = 0; i<B; i++)
        {
            System.out.println("ingrese la vida restante de la bateria B["+(i+1)+"]:");
            bateriasB[i] = Scan.nextInt();
        }
        System.out.println("Resumen:");
        for(int i = 0; i<pares; i++)
        {
            if (bateriasA[i]>bateriasB[i])
            {
            FuncionPar[i] = bateriasA[i]-bateriasB[i];
            }
            else
            {
            FuncionPar[i] = bateriasB[i]-bateriasA[i];
            }
            System.out.println("la camara "+(i+1)+" tiene suficiente bateria para "+FuncionPar[i]+" horas");
        }
        for(int i = resto; i<=camaras; i++)
        {
            System.out.println("la camara "+i+" no tiene suficientes baterias");
        }
    }
}