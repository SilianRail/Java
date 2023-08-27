public class nine {
    public static void main(String[] args){
        // //static arrays
        // String[] cars = {"Camaro", "Corvette", "tesla"};

        // //dynamic arrays
        // String[] cars2 = new String[3];

        // cars[0] = "Camaro";
        // cars[1] = "Corvette";
        // cars[2] = "Tesla";

        // for(int i = 0; i < cars.length; i++){
        //     System.out.print(cars[i] + "  ");
        // }


        //2D arrays
        String[][] cars = new String[3][3];
        //populating the 2D array
        for(int i = 0; i < cars.length;i++){
            for(int j = 0; j < cars[i].length; j++){
                cars[i][j] = "Corvette";
                System.out.println(cars[i][j] + " ");
            }
        }

        //another way to initialize
        String[][] cars2 = {{"Camaro", "Corvette", "Silverado"}, 
                            {"Mustang", "Ranger", "Tesla"}};
        //2 rows and 3 columns matrix

    }
}
