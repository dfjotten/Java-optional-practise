package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.

        clubNames.forEach(System.out::println);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        for(int i=0; i<clubNames.size(); i++){
            System.out.println(i + " - " + clubNames.get(i));
        }

//      This shit doesnt count an index (i)
//      for (String element : clubNames) {
//      System.out.println(element);
//        }

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.

        if (clubNames.contains("AA Aachen")) {
            System.out.println("Club zit al in de lijst");
        } else {
            clubNames.add("AA Aachen");
        }

        clubNames.forEach(System.out::println);

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.

        int index = clubNames.indexOf("PSV");
        System.out.println(index);

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        


        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");



    }

}
