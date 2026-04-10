class MilitaryExecuter {

    public static void main(String[] a) {

        Military ref = new Military();

        boolean added = ref.addWeapon("Rifle");

        added = ref.addWeapon("Pistol");
        System.out.println(added);

        added = ref.addWeapon("Sniper");
        added = ref.addWeapon("Tank");
        added = ref.addWeapon("Missile");
        added = ref.addWeapon("Grenade");
        added = ref.addWeapon("Artillery");
        added = ref.addWeapon("Machine Gun");
        added = ref.addWeapon("Sword");
        added = ref.addWeapon("Bayonet");

        // extra weapon to check full condition
        added = ref.addWeapon("Extra Weapon");

        ref.getWeapons();
    }
}