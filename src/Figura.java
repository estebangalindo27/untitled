import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Figura {
    List<Punto> listaPuntos = new ArrayList<>();

    public abstract double calcularPerimetro();

    public abstract double calcularArea();


    public void IngresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el conponete x del punto");
        double x = sc.nextDouble();
        System.out.println("Ingrese el conponete x del punto");
        double y = sc.nextDouble();
        System.out.println("Ingrese el conponete x del punto");
        double z = sc.nextDouble();
        listaPuntos.add(new Punto(x,y,z));

    }

    public double calcularDistancia (int i, int j){
        Punto punto1 = listaPuntos.get(i);
        Punto punto2 = listaPuntos.get(j);
        double dist = Math.sqrt(Math.pow(punto1.getX()-punto2.getX(),2))
                +Math.pow(punto1.getY()-punto2.getY(),2)
                +Math.pow(punto1.getZ()-punto2.getZ(),2);
        return dist;
    }

}
