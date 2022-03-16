public class Darbuotojas
{
    // Susikuriame kintamuosius, kuriuos turės ši klasė
    // Kintamuosius pagal enkapsuliacijos taisykles privaloma daryti PRIVATE ir juos norint pasiekti sukurtu jiems getterius ir setterius
    private String vardas;
    private String pavarde;
    private String pareigos;
    private Double alga;
    private String vidurinisVardas;
    private String kraujoGrupė;
    private int papildomasSkaicius;
    private double kaina;

    // Sugeneruojamas tuščias konstruktorius
    public Darbuotojas()
    {
       // vardas = "Vardenis";
       // pavarde = "Pavardenis";
    }

    // Sugeneruojamas pilnas konstruktorius
    public Darbuotojas(String vardas, String pavarde, String pareigos, Double alga)
    {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pareigos = pareigos;
        this.alga = alga;
    }


    // Susigeneruoti getterius ir setterius visiems (arba ne visiems) kintamiesiems
    public String getVardas()
    {
        return vardas;
    }

    public void setVardas(String vardas)
    {
        this.vardas = vardas;
    }

    public String getPavarde()
    {
        return pavarde;
    }

    public void setPavarde(String pavarde)
    {
        this.pavarde = pavarde;
    }

    public String getPareigos()
    {
        return pareigos;
    }

    public void setPareigos(String pareigos)
    {
        this.pareigos = pareigos;
    }

    public Double getAlga()
    {
        return alga;
    }

    public void setAlga(Double alga)
    {
        this.alga = alga;
    }


    // Susigeneruojame toString() funkciją, jog galėtume išvesti normaliai į konsolę Objektą
    @Override
    public String toString()
    {
        return "Darbuotojas{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", pareigos='" + pareigos + '\'' +
                ", alga=" + alga + '}';
    }


    //-------------- Klasės metodai-------------
    public double bonusoApskaiciavimas()
    {
        double bonusas;
        bonusas = alga * 0.2;
        return bonusas;
        // return alga * 0.2;
    }
}
