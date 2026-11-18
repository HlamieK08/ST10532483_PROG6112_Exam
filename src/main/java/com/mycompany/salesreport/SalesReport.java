/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;



import java.util.Scanner;

public class SalesReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Single dimensional array
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Two dimensional array
        int[][] sales = new int[3][3];

        // Enter sales for each product
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(products, sales);

        // Create PrintProduct object
        PrintProduct report = new PrintProduct(product);

        // Display report
        report.PrintTotalSales();
        report.PrintAverageSales();
        report.PrintMostPopularProduct();

        input.close();
    }
}
