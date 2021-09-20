/*Scrivere un programma che chieda agli utenti due stringhe in ingresso,le stringhe possono valere solo: “carta”, “forbice” o “sasso”.
Il programma dovrà quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le note regole della “morra cinese”
(forbice vince su carta, carta vince su sasso, sasso vince su forbice). */

import java.util.Scanner;

class Morra{


    public static void main(String args[]){

        messaggioDiBenvenuto();
        String giocatore1 = new String(LeggiStr());
        String giocatore2 = new String(LeggiStr());

        System.out.println(DichiaraVincitore(giocatore1,giocatore2));

        System.out.println("Grazie per aver giocato~xz");

        while(true);

    }

    public static String LeggiStr(){

        String giocatore = new String("");

        Scanner input = new Scanner(System.in);

        while((!"sasso".equals(giocatore)) && (!"carta".equals(giocatore)) && (!"forbice".equals(giocatore))) {
            System.out.print("Inserisci la tua giocata: ");
            giocatore = input.nextLine();

            if ((!"sasso".equals(giocatore)) && (!"carta".equals(giocatore)) && (!"forbice".equals(giocatore)))
                System.out.println("Puoi scegliere solo tra sasso, carta e forbice. Riprova");

        }

        return giocatore;
    }

    public static String DichiaraVincitore(String giocatore1,String giocatore2){

        String vincitore = new String();

        if(giocatore1.equals("sasso") && giocatore2.equals("sasso"))
            vincitore = "Pareggio";
        else if (giocatore1.equals("carta") && giocatore2.equals("carta"))
            vincitore = "Pareggio";
        else if (giocatore1.equals("forbice") && giocatore2.equals("forbice"))
            vincitore = "Pareggio";

        else if (giocatore1.equals("sasso") && giocatore2.equals("forbice"))
            vincitore = "Vittoria al giocatore 1";
        else if (giocatore1.equals("carta") && giocatore2.equals("sasso"))
            vincitore = "Vittoria al giocatore 1";
        else if (giocatore1.equals("forbice") && giocatore2.equals("carta"))
            vincitore = "Vittoria al giocatore 1";

        else if (giocatore1.equals("forbice") && giocatore2.equals("sasso"))
            vincitore = "Vittoria al giocatore 2";
        else if (giocatore1.equals("sasso") && giocatore2.equals("carta"))
            vincitore = "Vittoria al giocatore 2";
        else if (giocatore1.equals("carta") && giocatore2.equals("forbice"))
            vincitore = "Vittoria al giocatore 2";

        return vincitore;
    }


    public static void messaggioDiBenvenuto(){
        System.out.println("\n" +
                "  ███▄ ▄███▓ ▒█████   ██▀███   ██▀███   ▄▄▄          ▄████▄   ██▓ ███▄    █ ▓█████   ██████ ▓█████ \n" +
                "  ▓██▒▀█▀ ██▒▒██▒  ██▒▓██ ▒ ██▒▓██ ▒ ██▒▒████▄       ▒██▀ ▀█  ▓██▒ ██ ▀█   █ ▓█   ▀ ▒██    ▒ ▓█   ▀ \n" +
                "  ▓██    ▓██░▒██░  ██▒▓██ ░▄█ ▒▓██ ░▄█ ▒▒██  ▀█▄     ▒▓█    ▄ ▒██▒▓██  ▀█ ██▒▒███   ░ ▓██▄   ▒███   \n" +
                "  ▒██    ▒██ ▒██   ██░▒██▀▀█▄  ▒██▀▀█▄  ░██▄▄▄▄██    ▒▓▓▄ ▄██▒░██░▓██▒  ▐▌██▒▒▓█  ▄   ▒   ██▒▒▓█  ▄ \n" +
                "  ▒██▒   ░██▒░ ████▓▒░░██▓ ▒██▒░██▓ ▒██▒ ▓█   ▓██▒   ▒ ▓███▀ ░░██░▒██░   ▓██░░▒████▒▒██████▒▒░▒████▒\n" +
                "  ░ ▒░   ░  ░░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░ ▒▓ ░▒▓░ ▒▒   ▓▒█░   ░ ░▒ ▒  ░░▓  ░ ▒░   ▒ ▒ ░░ ▒░ ░▒ ▒▓▒ ▒ ░░░ ▒░ ░\n" +
                "  ░  ░      ░  ░ ▒ ▒░   ░▒ ░ ▒░  ░▒ ░ ▒░  ▒   ▒▒ ░     ░  ▒    ▒ ░░ ░░   ░ ▒░ ░ ░  ░░ ░▒  ░ ░ ░ ░  ░\n" +
                "  ░      ░   ░ ░ ░ ▒    ░░   ░   ░░   ░   ░   ▒      ░         ▒ ░   ░   ░ ░    ░   ░  ░  ░     ░   \n" +
                "         ░       ░ ░     ░        ░           ░  ░   ░ ░       ░           ░    ░  ░      ░     ░  ░\n" +
                "                                                     ░                                              \n\n" +

                "Benvenuto nella morra cinese(v1.0), ti serviranno due giocatori. Digita per vincere sasso, carta o forbice.\n");
    }
}
