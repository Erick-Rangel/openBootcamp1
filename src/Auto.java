class Coche {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.numeroPuertas = 2;
        miCoche.numeroPuertas = miCoche.numeroPuertas + 1;
        System.out.println(miCoche.numeroPuertas);
    }

    public static class coche {
        int numeroPuertas;
    }
}
