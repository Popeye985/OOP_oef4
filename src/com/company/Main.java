package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Persoon2> personen = new ArrayList<>();
        personen.add(new Persoon2("Karen", "Damen", LocalDate.of(1974, 10, 28)));
        personen.add(new Persoon2("Kristel", "Verbeke", LocalDate.of(1975, 12, 10)));
        personen.add(new Persoon2("Kathleen", "Aerts", LocalDate.of(1978, 6, 18)));
        for(Persoon2 p: personen){
            System.out.println(p);
        }
    }
}
class Persoon2 {
    private String voornaam;
    private String achternaam;
    private LocalDate geboorteDatum;
    private int leeftijd;

    public Persoon2(String voornaam, String achternaam, LocalDate geboorteDatum) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboorteDatum = geboorteDatum;
    }
    public int getLeeftijd(){
        LocalDate vandaag = LocalDate.now();
        leeftijd = vandaag.getYear() - geboorteDatum.getYear();
        if (geboorteDatum.getDayOfYear() > vandaag.getDayOfYear()){
            leeftijd--;
        //Period periode = Period.between(geboorteDatum, LocalDate.now);
            // return periode.getYears();
        }return leeftijd;
    }



@Override
    public String toString(){
    return String.format("%s %s is %d jaar oud.", getVoornaam(), getAchternaam(), getLeeftijd() );
}

    public String getVoornaam() {
        return voornaam;
    }


    public String getAchternaam() {
        return achternaam;
    }
}


