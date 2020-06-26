package com.example.covid_19survey;

public class SurveyBook {
    public static String[] questions = new String[]{
            "Have you travelled to a high risk country/Indian state (or) been in contact with someone who is ill and has travelled to a high risk country/Indian state in the last 14 days?",
            "Have you been in close contact with a laboratory confirmed COVID-19 patients within 14 days?",
            "Do you have fever?",
            "Do you have cough?",
            "Do you have shortness in breath?",
            "Do you have a chronic illness(Heart, Lung (or) Kidney Disease, Diabetics) or are immunocompromised(Cancer,HIV,Autoimmune Disease)?"


    };
    public static int[] images=new int[]{
            R.drawable.flight, R.drawable.contact, R.drawable.fever, R.drawable.coughing, R.drawable.breath, R.drawable.chronic
    };


    public static boolean[] answers = new boolean[]{
                    true,true,true,true,true,true
    };
}
