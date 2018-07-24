import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RecipeApp {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");


        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> portionList = new ArrayList<Integer>();
        ArrayList<String> ingredientsList = new ArrayList<String>();
        ArrayList<String> cuisineList = new ArrayList<String>();
        ArrayList<Double> cookTime = new ArrayList<Double>();
        ArrayList<String> difficultyList = new ArrayList<String>();

        String input = "";

        while (!input.equalsIgnoreCase("q")){

            printer("Enter the name of your recipe: ");
            nameList.add(keyboard.next());
            printer("Enter the serving size");
            portionList.add(keyboard.nextInt());
           String input2 = "";
           while(!input2.equalsIgnoreCase("done")){
               printer("Enter the list of your ingrients. Type done when you add all.");
                              printer("Do you want to add another ingredient");
               input2 = keyboard.next();

           }

            printer("Enter type of cuisine: ");
            cuisineList.add(keyboard.next());
            printer("Enter your the time it takes you to cook it: ");
            cookTime.add(keyboard.nextDouble());
            printer("Enter difficulty level.  Say low, medium or high");
            difficultyList.add(keyboard.next());

            printer("Do you have a recipe to add? Type yes or q to exit");
            input = keyboard.next();
        }

        printer("============================================================================" + "\n" +
                  "MY               RECIPE                        BOOK" + "\n" +
                   "Name" + "\t\t" + "Serving Size" + "\t\t" + "Ingredients" + "\t\t" + "Cuisine" + "\t\t" + "Time" + "\t\t" + "Difficulty");

        for (int i=0; i<nameList.size(); i++) {
            System.out.println(nameList.get(i) + "\t\t" + portionList.get(i) +"\t\t"
                    + ingredientsList + "\t\t" + cuisineList.get(i) + "\t\t"
                    + formatter.format(cookTime.get(i)) + "\t\t" + difficultyList.get(i)) ;
        }
    }

    private static void printer(String message){
        System.out.println(message);
    }
}
