/**
 * This class is not actually used, it is put in place for future implementation
 * @author cbentson
 *
 */
public class Action {
	
	String actionType;

	int builderSelf, brickSelf, soldierSelf, weaponSelf, magicSelf, crystalSelf, 
			castleSelf, fenceSelf, builderOpp, brickOpp, soldierOpp, weaponOpp, 
			magicOpp, crystalOpp, castleOpp, fenceOpp;

	public Action(String actionType, int builderSelf, int brickSelf, int soldierSelf, int weaponSelf, int magicSelf, int crystalSelf,
			int castleSelf, int fenceSelf, int builderOpp, int brickOpp, int soldierOpp, int weaponOpp, int magicOpp,
			int crystalOpp, int castleOpp, int fenceOpp) {
		this.actionType = actionType;
		this.builderSelf = builderSelf;
		this.brickSelf = brickSelf;
		this.soldierSelf = soldierSelf;
		this.weaponSelf = weaponSelf;
		this.magicSelf = magicSelf;
		this.crystalSelf = crystalSelf;
		this.castleSelf = castleSelf;
		this.fenceSelf = fenceSelf;
		this.builderOpp = builderOpp;
		this.brickOpp = brickOpp;
		this.soldierOpp = soldierOpp;
		this.weaponOpp = weaponOpp;
		this.magicOpp = magicOpp;
		this.crystalOpp = crystalOpp;
		this.castleOpp = castleOpp;
		this.fenceOpp = fenceOpp;
	}
	
	public String getActionType(){
		return actionType;
	}
	
	public void setActionType(String actionType){
		this.actionType = actionType;
	}

	public int getBuilderSelf() {
		return builderSelf;
	}

	public void setBuilderSelf(int builderSelf) {
		this.builderSelf = builderSelf;
	}

	public int getBrickSelf() {
		return brickSelf;
	}

	public void setBrickSelf(int brickSelf) {
		this.brickSelf = brickSelf;
	}

	public int getSoldierSelf() {
		return soldierSelf;
	}

	public void setSoldierSelf(int soldierSelf) {
		this.soldierSelf = soldierSelf;
	}

	public int getWeaponSelf() {
		return weaponSelf;
	}

	public void setWeaponSelf(int weaponSelf) {
		this.weaponSelf = weaponSelf;
	}

	public int getMagicSelf() {
		return magicSelf;
	}

	public void setMagicSelf(int magicSelf) {
		this.magicSelf = magicSelf;
	}

	public int getCrystalSelf() {
		return crystalSelf;
	}

	public void setCrystalSelf(int crystalSelf) {
		this.crystalSelf = crystalSelf;
	}

	public int getCastleSelf() {
		return castleSelf;
	}

	public void setCastleSelf(int castleSelf) {
		this.castleSelf = castleSelf;
	}

	public int getFenceSelf() {
		return fenceSelf;
	}

	public void setFenceSelf(int fenceSelf) {
		this.fenceSelf = fenceSelf;
	}

	public int getBuilderOpp() {
		return builderOpp;
	}

	public void setBuilderOpp(int builderOpp) {
		this.builderOpp = builderOpp;
	}

	public int getBrickOpp() {
		return brickOpp;
	}

	public void setBrickOpp(int brickOpp) {
		this.brickOpp = brickOpp;
	}

	public int getSoldierOpp() {
		return soldierOpp;
	}

	public void setSoldierOpp(int soldierOpp) {
		this.soldierOpp = soldierOpp;
	}

	public int getWeaponOpp() {
		return weaponOpp;
	}

	public void setWeaponOpp(int weaponOpp) {
		this.weaponOpp = weaponOpp;
	}

	public int getMagicOpp() {
		return magicOpp;
	}

	public void setMagicOpp(int magicOpp) {
		this.magicOpp = magicOpp;
	}

	public int getCrystalOpp() {
		return crystalOpp;
	}

	public void setCrystalOpp(int crystalOpp) {
		this.crystalOpp = crystalOpp;
	}

	public int getCastleOpp() {
		return castleOpp;
	}

	public void setCastleOpp(int castleOpp) {
		this.castleOpp = castleOpp;
	}

	public int getFenceOpp() {
		return fenceOpp;
	}

	public void setFenceOpp(int fenceOpp) {
		this.fenceOpp = fenceOpp;
	}
	
	
	
}