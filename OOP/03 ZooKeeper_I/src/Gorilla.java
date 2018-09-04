
public class Gorilla extends Mammal {
	public Gorilla() {
		
	}
	public void throwSomething() {
		this.setEnergy(this.displayEnergy() - 5);
	}
	public void eatBananas() {
		this.setEnergy(this.displayEnergy() + 10);
	}
	public void climb() {
		this.setEnergy(this.displayEnergy() - 10);
	}
}
