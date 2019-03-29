// 2. Write a class called US_Currency that has the state called country and the getter.
// The exchange fee is $100.

public class US_Currency implements CurrencyExchange {
 private String country;

 public String getCountry() {
  return country;
 }

 public int computeFee() {
  return 100;
 }

 public boolean equals(Object obj) {
  if (obj instanceof US_Currency) {
   US_Currency other = (US_Currency) obj;
   return country.equals(other.country);
  } else {
   return false;
  }
 }
}