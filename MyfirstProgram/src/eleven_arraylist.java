import java.util.*;
public class eleven_arraylist {
    public static void main(String[] args){
        //make sure to always use wrapper classes for ArrayLists
        //1D array list
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("RoastedPotato");
        food.add("Burger");

        food.set(0, "paneer");
        food.remove(2);
        food.clear();
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        //2D array lists

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomato");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");
        drinksList.add("tea");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(1).get(1));
    }
}
