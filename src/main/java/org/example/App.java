package org.example;

public class App 
{
    public enum Season{
        SPRING(5,15),
        SUMMER(10,19),
        AUTUMN(5,13),
        WINTER(1,10);

        private final int lowestTemp;
        private final int highestTemp;

        //Constructor
        Season(int lowestTemp, int highestTemp) {
            this.lowestTemp = lowestTemp;
            this.highestTemp = highestTemp;
        }

        //Methods
        public int getLowestTemp() {
            return lowestTemp;
        }

        public int getHighestTemp() {
            return highestTemp;
        }
    }

    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println("The average lowest temperature in the UK during the " +
                summer + " season is " + summer.getLowestTemp() +
                " and the highest average is " + summer.getHighestTemp());
    }
}
