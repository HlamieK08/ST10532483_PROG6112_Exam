/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package productsalesapplication;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductSalesTest {

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {

        ProductSales sales = new ProductSales();

        int expected = 2;

        int actual = sales.GetSalesOverLimit();

        assertEquals(expected, actual);
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {

        ProductSales sales = new ProductSales();

        int expected = 4;

        int actual = sales.GetSalesUnderLimit();

        assertEquals(expected, actual);
    }
}
