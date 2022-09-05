package figura;
public class prueva {
    public static void main(String[] args) {

        figuras f1 = new figuras("octagono", 8, "poligono");
        triangulo t1 = new triangulo("Triangulo", 3, "Por sus lados", "isoceles",
                "65,65,50", 12, 16.66, 16.66, 15);

        //Ñ se mandan a llamar las operaciones necesarias
        f1.mostrarInfo();
        t1.mostrarInfo();

        //= se hacen las operciones
        double perimetro = (t1.base1 + t1.medida2 + t1.medida3);
        double area = (t1.base1 * t1.altura / 2);

        //! se manda ayamar el resultado
        System.out.println("Perimetro: " + perimetro);
        System.out.println("--------------------------------------------");
        System.out.println("Area: " + area);

    }
}

