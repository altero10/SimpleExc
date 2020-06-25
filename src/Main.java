import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        double temp;
        double convert;
        String response;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator stopni. Proszę wybrać i wpisać poniżej na jakie stopnie przeliczyć podaną temperaturę. Opcje do wyboru: Celsjusz, Fahrenheit: ");
        response = scanner.nextLine();


        if(response.equalsIgnoreCase("Fahrenheit")) {
            System.out.println("Proszę podać temperature w Celsjuszach: ");
            temp = scanner.nextDouble();
            convert = 9 / 5.0 * temp + 32;
            System.out.println(temp + " stopni Celsjusza, na stopnie Fahrenheita to: " + convert);
        }else if(response.equalsIgnoreCase("Celsjusz")){
            System.out.println("Prosze podać temperature w Fahrenheitach: ");
            temp = scanner.nextDouble();
            convert = 5/9.0 *(temp - 32);
            System.out.println(temp + "stopni Fahrenheita, na stopnie Celsjusza to: " + convert);
        } else  {
            System.out.println("Wystąpił błąd. Proszę spróbować ponownie.");
        }





    }



}
