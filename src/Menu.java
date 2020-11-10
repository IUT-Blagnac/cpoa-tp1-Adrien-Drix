import ComportementBenOuais.ComportementArc;
import ComportementBenOuais.ComportementArme;
import ComportementBenOuais.ComportementEpee;
import ComportementBenOuais.ComportementPoignard;
import Personnages.*;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String personnage;
        String armeChoisie;
        Personnage agent;
        ComportementArme arme = null;

        System.out.println("BIENVENUE");
        System.out.println("Quel personnage veux-tu ?\nRein\nRoi\nTroll\nChevalier");
        System.out.println("Ecris son nom :");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            personnage = scanner.nextLine();
            if (personnage == "Reine" || personnage == "Roi" || personnage == "Troll" || personnage == "Chevalier"){
                System.out.println(personnage + ", très bon choix...");
                break;
            }
            System.out.println("Valeur mal saisie, recommence:");
        }

        System.out.println("Quel arme veux-tu ?\nArc\nPoignard\nEpee");
        while (true) {
            armeChoisie = scanner.nextLine();
            if (armeChoisie == "Arc" || armeChoisie == "Poignard" || armeChoisie == "Epee" ){
                System.out.println(armeChoisie + ", ça va faire l'affaire...");
                if (armeChoisie == "Arc"){
                    arme = new ComportementArc();
                } else {
                    if (armeChoisie == "Poignard"){
                        arme = new ComportementPoignard();
                    } else {
                        if (armeChoisie == "Epee"){
                            arme = new ComportementEpee();
                        }
                    }
                }
                break;
            }
            System.out.println("Valeur mal saisie, recommence:");
        }

        try {
            if (arme != null) {
                if (personnage == "Reine"){
                    agent = new Reine(arme);
                }
                if (personnage == "Roi"){
                    agent = new Roi(arme);
                }
                if (personnage == "Troll"){
                    agent = new Troll(arme);
                }
                if (personnage == "Chevalier"){
                    agent = new Chevalier(arme);
                }
            } else {
                System.out.println("Ca ne peut pas passer par là");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
