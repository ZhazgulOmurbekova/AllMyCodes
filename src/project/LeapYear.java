package project;

public class LeapYear {
    /**
     * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved.
     * Any redistribution or reproduction of part or all of the contents in any form is
     * prohibited without the express consent of CyberTek.
     */
    private static final int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};int month;
  int day;
  int year;
  public String dateToWords() {
        String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] yearWords = {"Hundred", "Thousand"};
        // TO DO
        String str = "";
        for (int i = 1; i <= monthWords.length; i++) {
            if (this.month == i) {
                str += monthWords[i] + " ";
            }
        }
        for (int j = 0; j < 31; j++) {
            if (j <= 10) {
                if (this.day == j) {
                    str += numbersLessThanTen[j] + " ";
                }
            } else if (j > 10 && j < 20) {
                if (this.day == j) {
                    str += numbersBetweenTenAndTwenty[j] + " ";
                }
            } else if (j > 20 && j < 30 && j > 30) {
                if (this.day == j) {
                    int lastnumber = j % 10;
                    int firstnumber = j / 10;
                    str += multiplesOfTen[firstnumber] + " " + multiplesOfTen[lastnumber] + " ";
                }
            } else if (j == 20) {
                str += multiplesOfTen[1];
            } else if (j == 30) {
                str += multiplesOfTen[2];
            }
            int thousant = year/1000;
            int hundred = year % 1000 / 100;
            int yearsTensAndSingles = year - thousant*1000 - hundred * 100;
            int yearsTens = yearsTensAndSingles / 10;
            int yearsSingles = yearsTensAndSingles % 10;
            if (year < 2000) {
                str += "One Thousand Nine Hundred " + multiplesOfTen[yearsTens - 1] + " " + numbersLessThanTen[yearsSingles - 1];
            } else if (year >= 2000 && year < 2100) {
                str += "Two thousand " + multiplesOfTen[yearsTens - 1] + " " + numbersLessThanTen[yearsSingles - 1];
            }

        }
        return str;

    }
}