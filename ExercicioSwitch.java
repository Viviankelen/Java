public class ExercicioSwitch {
    public static void main(String[] args) {
        // Utilizando o Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo é final de semana");
                break;
            case 2:
                System.out.println("Segunda é dia útil");
                break;
            case 3:
                System.out.println("Terça é dia útil");
                break;
            case 4:
                System.out.println("Quarta é dia útil");
                break;
            case 5:
                System.out.println("Quinta é dia útil");
                break;
            case 6:
                System.out.println("Sexta é dia útil");
                break;
            case 7:
                System.out.println("Sábado é final de semana");
                break;
            default:
                System.out.println("Opção Inválida");
                break;

        }

    }
}
