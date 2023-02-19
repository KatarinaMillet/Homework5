package com.hillel.hrytsaienko.homeworks.homework6;

public class Homework6 {
    public static void main(String[] args) {
        String teamName1 = "Mario";
        int frags1Player1 = 34523;
        int frags1Player2 = 27012;
        int frags1Player3 = 19545;
        int frags1Player4 = 38670;
        int frags1Player5 = 14901;
        int totalFrags1 = frags1Player1 + frags1Player2 + frags1Player3 + frags1Player4 + frags1Player5;
        double averageFrags1 = totalFrags1 / 5.0;

        String teamName2 = "Pacman";
        int frags2Player1 = 27834;
        int frags2Player2 = 34812;
        int frags2Player3 = 40987;
        int frags2Player4 = 30122;
        int frags2Player5 = 37254;
        int totalFrags2 = frags2Player1 + frags2Player2 + frags2Player3 + frags2Player4 + frags2Player5;
        double averageFrags2 = totalFrags2 / 5.0;

        String winnerName;
        int winnerFrags;
        if (averageFrags1 > averageFrags2) {
            winnerName = teamName1;
            winnerFrags = (int) averageFrags1;
        } else {
            winnerName = teamName2;
            winnerFrags = (int) averageFrags2;
        }

        System.out.println("Перемогла команда " + winnerName + ", набравши " + winnerFrags + " фрагів.");
    }
}
