package labsheet5.exercise3;

public class Thermometer {
   private int CurrentTemp;
   private int MaxTemp;
   private int MinTemp;

   public Thermometer(){
      setCurrentTemp(0);
      setMaxTemp(Integer.MAX_VALUE);
      setMinTemp(Integer.MIN_VALUE);

   }



   public Thermometer(int CurrentTemp){
      setCurrentTemp(CurrentTemp);
      setMaxTemp(CurrentTemp);
      setMinTemp(CurrentTemp);
   }

   public int getMaxTemp(){
      return MaxTemp;
   }
   public void setMaxTemp(int MaxTemp){
      this.MaxTemp = MaxTemp;
   }

   public int getMinTemp(){
      return MinTemp;
   }

   public void setMinTemp(int MinTemp){
      this.MinTemp = MinTemp;

   }

   public void setCurrentTemp(int CurrentTemp){
      this.CurrentTemp=CurrentTemp;
   }
      public void setTemperature(int CurrentTemp) {
         this.CurrentTemp = CurrentTemp;
         updateMaxMinTemp();
      }
      public int getCurrentTemp(){
      return CurrentTemp;
   }

   private void updateMaxMinTemp(){

      if(CurrentTemp<MinTemp)
         MinTemp=CurrentTemp;
      if (CurrentTemp>MaxTemp)
         MaxTemp=CurrentTemp;

   }

   public String toString()
   {
      return "Current temperature: " + getCurrentTemp() + "\n" +
              "Maximum temperature: " + getMaxTemp() + "\n" +
              "Minimum temperature: " + getMinTemp() + "\n";
   }

}



















