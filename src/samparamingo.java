import java.util.Scanner;

class samparamingo {
    public static void main(String[] args) {
        Scanner drukarka = new Scanner(System.in);
        System.out.println("Podaj % doskonałości: (Zakres 0-100)");
        double percent = drukarka.nextDouble();
        double poziom;
        double wartosc;
        String poziomNazwa = "";
        if(percent < 0 || percent > 100) {
            System.out.println("Nieprawidłowe dane");
        }
        else {
            poziom = Math.pow(percent,2) / 10000 * 5;
            if(poziom < 2) {
                poziomNazwa = "Casual";
            }
            else if(poziom >= 2 && poziom < 3) {
                poziomNazwa = "Tribunal";
            }
            else if(poziom >= 3 && poziom < 4) {
                poziomNazwa = "Dragon";
            }
            else if(poziom >= 4 && poziom < 5) {
                poziomNazwa = "Godly";
            }
            else {
                poziomNazwa = "SK";
            }
            wartosc =  100/(100-percent);
            System.out.println("Twój procent doskonałości to: " + percent + "%");

                System.out.println("Twój poziom ucznia to: " + poziom + "(" +poziomNazwa +")");
                System.out.println("Twoja wartość mocy to: " + wartosc + "p");

            double mnoznik = wartosc / 2;
            if(wartosc >= 2) {
                System.out.println("Jesteś potężniejszy od przeciętnego człowieka " + mnoznik + " razy!!");

            }
            else {
                mnoznik = 1 / (wartosc/2);
                System.out.println("Jesteś słabszy od przeciętnego człowieka " + mnoznik + " razy :(");
            }
        }

    }
}