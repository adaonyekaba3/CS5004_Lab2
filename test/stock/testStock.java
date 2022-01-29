package stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * testStock class represents a module to test the Stock class.
 */
public class testStock {

  private Stock stock1;
  private Stock stock2;

  /**
   * Initialize two new stock objects to access attributes.
   */
  @Before
  public void setUp(){
    stock1 = new Stock("AAA", "Apple", 52.14);
    stock2 = new Stock("BBB", "BirdCorp", 87.06);
  }

  /**
   * Test: Get Symbol of Stock
   */
  @Test
  public void getSymbolTest(){
    assertEquals("AAA", stock1.getSymbol());
    assertEquals("BBB", stock2.getSymbol());
  }

  /**
   * Test: getName of Stock
   */
  @Test
  public void getNameTest(){
    assertEquals("Apple", stock1.getName());
    assertEquals("BirdCorp", stock2.getName());
  }

  /**
   * Test: get the stock cost basis
   */
  @Test
  public void getCostBasisTest(){
    assertEquals(52.14, stock1.getCostBasis(), 0.001);
    assertEquals(87.06, stock2.getCostBasis(), 0.001);
  }

  /**
   * Test: get the current price of the stock
   */
  @Test
  public void getCurrentPriceTest(){
    assertEquals(0.0, stock1.getCurrentPrice(), 0.001);
    assertEquals(0.0, stock2.getCurrentPrice(), 0.001);
  }

  /**
   * Test: set the cost basis of the Stock
   */
  @Test
  public void setCostBasisTest(){
    stock1.setCostBasis(142.69);
    stock2.setCostBasis(100.32);
    assertEquals(142.69, stock1.getCostBasis(), 0.001);
    assertEquals(100.32, stock2.getCostBasis(), 0.001);
  }

  /**
   * Test: set the new current price of the Stock object
   */
  @Test
  public void setCurrentPriceTest(){
    stock1.setCurrentPrice(90.00);
    stock2.setCurrentPrice(105.22);
    assertEquals(90.00, stock1.getCurrentPrice(), 0.001);
    assertEquals(105.22, stock2.getCurrentPrice(), 0.001);
  }

  /**
   * Test: get the Change percent of the current Stock object
   */
  @Test
  public void getChangePercentTest() {
    stock1.getChangePercent();
    stock2.getChangePercent();
    assertEquals(-100, stock1.getChangePercent(), 0.001);
    assertEquals(-100, stock2.getChangePercent(), 0.001);
  }

  /**
   * Test: test the Stock toString method
   */
  @Test
  public void testToString() {
    stock1.setCurrentPrice(202.12);
    stock1.getChangePercent();
    assertEquals("Company name: Apple Computer Current Price: $202.120000\n" +
                           "Gain/Loss: $100.0%", stock1.toString());
  }
}
