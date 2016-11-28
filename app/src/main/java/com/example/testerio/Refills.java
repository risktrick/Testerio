package com.example.testerio;


public class Refills {


    public int getMinRefills(final int[] x, final int L) {

        int n = x.length;

        int numRefills = 0;
        int lastRefillIndex = 0;

        for (int i = 0; i < n - 1; i++) {

            int nextStationKm = x[i + 1];
            int lastRefillStationKm = x[lastRefillIndex];

            System.out.print("Now we on the station = " + x[i] + "\t\t");
            if (nextStationKm - lastRefillStationKm <= L) {
                System.out.println("We have the fuel for go through nextStation = " + nextStationKm + " and we go");
            } else {
                System.out.print("We have to refill here = " + x[i]);
                if (x[i] + L >= nextStationKm) {
                    lastRefillIndex = i;
                    numRefills++;
                    System.out.println("\n");
                } else {
                    System.out.println(" BUT TANK IS TOO SMALL FOR GO TO " + nextStationKm + "\n");
                    return -1;
                }
            }
        }

        return numRefills;
    }

    public int shit_getMinRefills(final int[] x, final int L) {

        int n = x.length;

        int numRefills = 0;
        int i = 0;
        int lastRefill = 0;

//        System.out.println( "x[n] = " + x[n]);

        while (i <= n -1 ) {

            while (i <= n-1 && x[i + 1] - x[lastRefill] <= L) {
                System.out.println( "i = "          + i         + "\t" +
                                    "x[i + 1] = "   + x[i + 1]  + "\t" +
                                    "x[lastRefill] = "          + x[lastRefill]         + "\t" +
                                    "n = "                      + n);

                i++;
            }
            System.out.println("exiting");

            if (i == lastRefill) {
                return -1;
            }

            if (i <= n) {
                numRefills++;
            }

            lastRefill = i;
            System.out.println( "lastRefill = " + lastRefill);
        }

        return numRefills;
    }
}
