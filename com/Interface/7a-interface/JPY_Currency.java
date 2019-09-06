// 3. Write a class called JPY_Currency that has the state called exchangeRate and the setter.
// The exchange fee if $200. Add an equals(Object obj) method that return true if the parameter obj equals to the object.

public class JPY_Currency implements CurrencyExchange {
  private int exchangeRate;

  public void setExchangeRate(int exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  @Override
  public int computeFee() {
    return 200;
  }

  //JPY_Currency j = new JPY_Currency();
  //j.equals(a);
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof JPY_Currency) {
      JPY_Currency other = (JPY_Currency) obj;
      return exchangeRate == other.exchangeRate;
    } else {
      return false;
    }
  }
}