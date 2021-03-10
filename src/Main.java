public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("plastico");
        doc.showName();

        Doctor myDoctor = new Doctor();
        myDoctor.name = "cristhian vargas";
        myDoctor.showName();
    }
}

