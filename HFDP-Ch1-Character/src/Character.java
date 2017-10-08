
public abstract class Character {
	public WeaponBehavior weaponBehavior;
	
	public void setWeapon(WeaponBehavior wb){
		this.weaponBehavior = wb;
	}
	
	public void fight(){
		System.out.println("Ja sam: " + this.getClass().getSimpleName());
		System.out.println("Borim se iiiii...: ");
		this.weaponBehavior.useWeapon();
	}
}
