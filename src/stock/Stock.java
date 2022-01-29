package stock;

import java.text.MessageFormat;

/**
 * Stocks class represents a stock to be traded.
 */
public class Stock {

  // init attributes
  private String symbol;
  private String name;
  private double costBasis;
  private double currentPrice;
  private double changePercent;

  /**
   * Stock Constructor for Stock class.
   *
   * @param symbolIn String
   * @param nameIn String
   * @param costBasisIn double
   */
  public Stock(String symbolIn, String nameIn, double costBasisIn) {
    this.symbol = symbolIn;
    this.name = nameIn;
    this.costBasis = costBasisIn;
    this.currentPrice = 0;
    this.changePercent = 100.00;
  }

  /**
   * Getter method for the symbol of the stock.

   * @return Symbol
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * Getter: Returns the Stock name.
   *
   * @return String
   */
  public String getName() {
    return name;
  }

  /**
   * Getter: Returns the Stock Cost basis.
   *
   * @return double
   */
  public double getCostBasis() {
    return costBasis;
  }

  /**
   * Getter: Returns the Stock current price.
   *
   * @return double
   */
  public double getCurrentPrice() {
    return currentPrice;
  }

  /**
   * Setter: Returns the stock cost basis.
   *
   * @param newCostBasis double
   */
  public void setCostBasis(double newCostBasis) {
    costBasis = newCostBasis;
  }

  /**
   * Setter: Returns the set Stock current price.
   *
   * @param newCurrentPrice double
   */
  public void setCurrentPrice(double newCurrentPrice) {
    currentPrice = newCurrentPrice;
  }

  /**
   * Getter: Returns the Stock Gain/Loss (Change Percent).
   *
   * @return double
   */
  public double getChangePercent() {
    return ((currentPrice - costBasis) / costBasis) * 100;
  }

  /**
   * String method to present stock information.
   *
   * @return String
   */
  @Override
  public String toString() {
    return MessageFormat.format("Company name: {0} {1}\n{2}", this.name,
            String.format("Computer Current Price: $%f", this.currentPrice),
            String.format("Gain/Loss: $" + this.changePercent + "%%"));
  }

}
