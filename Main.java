import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        int[] ages = {22, 35}; // Nuevas edades
        int[] maritalStatuses = {2, 1}; // Nuevos estados civiles
        int[] heights = {180, 165}; // Nuevas alturas
        int[] genders = {1, 2};  


        int age, maritalStatus, height, gender;
        double averageAge = 0, averageHeight = 0, fulfillmentPercentage = 0;
        int validPersonCount = 0, totalAge = 0, totalHeight = 0;
        final int TOTAL_PERSONS = 2;


        for (int personIndex = 0; personIndex < TOTAL_PERSONS; personIndex++) {
            
            System.out.println("Datos para la persona " + (personIndex + 1) + ":");
            

            age = ages[personIndex];
            maritalStatus = maritalStatuses[personIndex];
            height = heights[personIndex];
            gender = genders[personIndex];

    
            System.out.printf("Edad: %d años\n", age);
            System.out.printf("Estado Civil: %s\n", (maritalStatus == 1 ? "Soltero" : "Casado"));
            System.out.printf("Estatura: %d cm\n", height);
            System.out.printf("Sexo: %s\n", (gender == 1 ? "Hombre" : "Mujer"));


            if (age > 18 && maritalStatus == 1 && height > 170 && gender == 1) {
                validPersonCount++;
                totalAge += age;
                totalHeight += height;
            }
        }


        if (validPersonCount > 0) {
            averageAge = (double) totalAge / validPersonCount;
            averageHeight = (double) totalHeight / validPersonCount;
            fulfillmentPercentage = (double) validPersonCount / TOTAL_PERSONS * 100;


            System.out.printf("Promedio de edad: %.2f años\n", averageAge);
            System.out.printf("Promedio de estatura: %.2f centímetros\n", averageHeight);
            System.out.printf("Porcentaje de personas que cumplen: %.2f%%\n", fulfillmentPercentage);
        } else {
            System.out.println("No hay personas que cumplan con los requisitos.");
        }

     
        scanner.close();
    }
}
