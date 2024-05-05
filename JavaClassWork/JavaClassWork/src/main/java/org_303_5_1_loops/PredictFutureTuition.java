package org_303_5_1_loops;

public class PredictFutureTuition {

    //Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
    //In how many years will the tuition be doubled?

    double currentTuition = 10000;
    double doubleTuition = currentTuition * 2;
    double tuition = currentTuition;
    int years = 0;

        while (tuition < doubleTuition) {
        tuition = tuition * 1.07;
        years = years + 1;
    }

        System.out.println("It will take " + years + " years for the tuition to be doubled");
}

}
