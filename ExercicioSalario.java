public class ExercicioSalario {
    public static void main(String[] args) {
        //Baseado no meu salário, qual a porcentagem de imposto que eu devo pagar?
        //
        double salarioAnual = 2000;
        String taxa;
        if (salarioAnual < 34712) {
            taxa = "Irá pagar 9.70%";
        } else if (salarioAnual >= 34712 && salarioAnual < 68507){
            taxa = "Irá pagar 37.35%";
        } else {
            taxa = "Irá pagar 49.50%";
        }
        System.out.println(taxa);

    }
}
