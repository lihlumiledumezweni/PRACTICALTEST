public class Main {
    public static void main(String[] args) {


        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] sales = {{1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s%-10s%-10s%10s%n", "", "PS5", "XBOX", "SWITCH");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales.length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-15s %d%n",
                    cities[i], cityTotal);

            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("------------------------------------------------------------");
    }
}