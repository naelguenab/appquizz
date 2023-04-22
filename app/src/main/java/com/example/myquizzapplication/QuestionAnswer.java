package com.example.myquizzapplication;

import java.io.OptionalDataException;

public class QuestionAnswer {

    public static OptionalDataException question;
    public static int[][] choices;

    public static class QuestionAnswer {

        public static String question[] = {
                "En quelle année le Titanic a-t-il coulé dans l'océan Atlantique le 15 avril, lors de son premier voyage au départ de Southampton?",
                "Quel est le titre du premier film Carry On réalisé et sorti en 1958?",
                "Quel est le nom de la plus grande entreprise technologique de Corée du Sud?"
        };
        public static String choices [][] = {
                {"1942","1877","1904","1956"},
                {"Continuer sergent","Carrie","Full Metal Jacket","Black Sergent"},
                {"Daewon","Samsung","Hyundai","LG"}
        };
        public static String correctAnswers[] ={
                "1942",
                "Continuer sergent",
                "Samsung"

        };
    }

}
