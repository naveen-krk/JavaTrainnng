package DesignPattern;
public class BuilderPattern{
	public static void main(String[] args) {
		Bike mybike=new Bike.BikeBuilder().setEngine("rapidcool").setColor("black").setCc(350).setFuelTankCapacity(15).setHeadlight("retro").setTyre("MRF").build();
		System.out.println(mybike);
		
	}
}
class Bike{
	class Parts{
		String engine,headlight,tyre,color;
		int cc,fuelTankCapacity;
		public Parts(String engine, String headlight, String tyre, String color, int cc, int fuelTankCapacity) {
			super();
			this.engine = engine;
			this.headlight = headlight;
			this.tyre = tyre;
			this.color = color;
			this.cc = cc;
			this.fuelTankCapacity = fuelTankCapacity;
		}
		@Override
		public String toString() {
			return "Parts [engine=" + engine + ", headlight=" + headlight + ", tyre=" + tyre + ", color=" + color
					+ ", cc=" + cc + ", fuelTankCapacity=" + fuelTankCapacity + "]";
		}
		
	}
	Parts part;
	String brand;
	public Bike(BikeBuilder bike) {
		part=new Parts(bike.engine,bike.headlight,bike.tyre,bike.color,bike.cc,bike.fuelTankCapacity);
		brand="Honda";
	}
	
	@Override
	public String toString() {
		return "Bike[b=" + part+ ", brand=" + brand + "]";
	}
	static class BikeBuilder{
		String engine,headlight,tyre,color;
		int cc,fuelTankCapacity;
		public BikeBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}
		public BikeBuilder setHeadlight(String headlight) {
			this.headlight = headlight;
			return this;
		}
		public BikeBuilder setTyre(String tyre) {
			this.tyre = tyre;
			return this;
		}
		public BikeBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		public BikeBuilder setCc(int cc) {
			this.cc = cc;
			return this;
		}
		public BikeBuilder setFuelTankCapacity(int fuelTankCapacity) {
			this.fuelTankCapacity = fuelTankCapacity;
			return this;
		}
		public Bike build() {
			return new Bike(this);
		}
		
	}
}
//creational Pattern
//best way to create objects
//builderclass constructor-public
//class within a class is used
