public class RPS {

    public static String explainVar1 = "Paper covers rock.";
    public static String explainVar2 = "Scissors cut paper.";
    public static String explainVar3 = "Rock crushes scissors.";
    public static String choiceText(int choice){


        switch (choice){
            case 1:
                String choiceText = "Paper";
                return choiceText;
            case  2:
                return "Rock";
            case 3:
                return "Scissors";
            default:
                return "The number you enter does not correspond with the available selection.";
        }
    }

    public static String gameResults(int playerChoice, int computerChoice){
        if(playerChoice == computerChoice){
           if(computerChoice == 1){
               return "Tie game.";
           } else if (computerChoice == 2) {
               return "Tie game.";
           } else if (computerChoice == 3) {
               return "Tie game.";
           }


        }

        if(playerChoice == 1 && computerChoice == 2){
            return explainVar1 + "\nYou win.";
        } else if (playerChoice == 2 && computerChoice == 3) {
            return  explainVar3+ "\nYou win.";
        } else if (playerChoice == 3 && computerChoice == 1) {
            return  explainVar2 + "\nYou win.";
        } else if (playerChoice == 2 && computerChoice == 1) {
            return explainVar1 +  "\nYou lose.";
        } else if (playerChoice == 3 && computerChoice == 2) {
            return explainVar3 + "\nYou lose.";
        } else if (playerChoice == 1 && computerChoice == 3) {
            return  explainVar2 + "\nYou lose.";
        }

        return null;
    }
}
