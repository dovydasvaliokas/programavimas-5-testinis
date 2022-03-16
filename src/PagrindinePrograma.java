import java.util.Scanner;

public class PagrindinePrograma
{
    public static void main(String[] args)
    {
        // Sukuriamas tuščias darbuotojo objektas
        Darbuotojas pirmasDarbuotojas = new Darbuotojas();

        // Iš konsolės nuskaitome duomenis ir su setteriais įdedame į darbuotojo objektą.
        Scanner konsolesSkaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite darb. vardą");
        String vardas = konsolesSkaitytuvas.nextLine();

        // Su setteriu įdedu vardą į darbuotojo objektą
        pirmasDarbuotojas.setVardas(vardas);

        System.out.println(pirmasDarbuotojas);


        // Nuskaitome pavardę
        System.out.println("Įveskite darb. pavardę");
        String pavarde = konsolesSkaitytuvas.nextLine();

        // Su setteriu įdedu pavardę į darbuotojo objektą
        pirmasDarbuotojas.setPavarde(pavarde);

        System.out.println(pirmasDarbuotojas);


        // Nuskaitome pareigas
        System.out.println("Įveskite darbuotojo pareigas");
        String pareigos = konsolesSkaitytuvas.nextLine();

        // Su setteriu įdedu pavardę į darbuotojo objektą
        pirmasDarbuotojas.setPareigos(pareigos);

        System.out.println(pirmasDarbuotojas);
        // Visus šis tris pavyzdžius buvo galima sutrumpinti iki:
        // pirmasDarbuotojas.setVardas(konsolesSkaitytuvas.nextLine());



        // Nuskaitome algą
        System.out.println("Įveskite algą");
        Double alga = konsolesSkaitytuvas.nextDouble();

        // Su setteriu įdedame algą į darbuotojo objektą
        pirmasDarbuotojas.setAlga(alga);

        System.out.println(pirmasDarbuotojas);




        // Išvedame tik vieną iš darbuotojo kintamųjų, pvz. algą
        System.out.println("Pirmo darbuotojo alga yra: " + pirmasDarbuotojas.getAlga());


        // Išvedame darbuotojo bonusą, naudojant darbuotojo klasės funkciją
        System.out.println("Pirmo darbuotojo bonusas yra: " + pirmasDarbuotojas.bonusoApskaiciavimas());
    }


}
