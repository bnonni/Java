class Thermometer {
 private int temperature

 public Thermometer(int degrees) {
  temperature = degrees;
 }

 public Thermometer() {
  temperature = 0.0;
 }

 public void makeWarmer(int degrees) {
  temperature = +degrees;
 }

 public void makeCooler(int degrees) {
  temperature -= degrees;
 }

 public getTemperature() {
  return temperature;
 }

 public string tostring() {
  return temperature + ' degrees';
 }
}