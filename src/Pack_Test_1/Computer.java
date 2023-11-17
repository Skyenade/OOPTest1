package Pack_Test_1;

public class Computer {

	private static int numOfComp = 1;
	private static long serialnumbercounter = 1000;

	private String brand;
	private String model;
	private long SN = 1000;
	private double price;
	private int numcomp = 0;
	

	public Computer(String b, String m, double p) {
		brand = b;
		model = m;
		price = p;
		SN = serialnumbercounter;
		serialnumbercounter++;
		numcomp = numOfComp;
		numOfComp++;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String b) {
		brand = b;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String m) {
		model = m;
	}

	public long getSN() {
		return SN;
	}

	public void setSN(long serialnum) {
		SN = serialnum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		price = p;
	}
	
	public int getNumcomp() {
		return numcomp;
	}
	
	public void setNumcomp(int nc) {
		numcomp = nc;
	}
	
	
	
	public int findNumberOfCreatedComputers() {		
		return numOfComp;
	}
	

	@Override
	public String toString() {
		System.out.println("Computer #" + numcomp);
		System.out.println("Brand: " + brand);
		System.out.println("Computer Model: " + model);
		System.out.println("Serial Number (SN): " + SN);
		System.out.println("Computer price: " + price);
		return "Computer brand=" + brand + 
				", model=" + model + 
				", SN=" + SN + 
				", price=" + price + 
				", numcomp="+ numcomp;
	}
	
	
	
	public boolean equals(Computer c) {
		if (brand == c.brand && model == c.model && price == c.price) {
			return true;
		} else {
			return false;
		}
	}
	
}
