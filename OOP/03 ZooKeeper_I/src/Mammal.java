
public class Mammal {
	private int energy;

	public Mammal() {
		this.setEnergy(100);
	}
	public int displayEnergy() {
		System.out.println(this.energy);
		return this.energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
