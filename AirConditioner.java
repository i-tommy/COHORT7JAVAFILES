public class AirConditioner{
	
	private boolean isOn;
	
	private String productName;

	private int temperature;

	public AirConditioner(String name){}

	public void decreaseTemperature(){};

	public String productName(){
			return this.productName;
	}

	public int getTemperature(){
		return this.temperature;

	}
	public void increaseTemperature(){}
	public boolean isOn(){
		return this.isOn;
	}

	public void setOn(boolean isOn){};
	public void setproductName(String productName){}
	public void setTemperature(int temperature){}

}