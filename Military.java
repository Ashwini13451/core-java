class Military {

    String weaponNames[] = new String[10];
    int index;

    // create operation
    public boolean addWeapon(String weapon) {
        boolean isWeaponAdded = false;

        if (index < weaponNames.length) {

            if (weapon != null && !weapon.isEmpty()) {
                weaponNames[index++] = weapon;
                isWeaponAdded = true;

            } else {
                System.out.println(weapon + " not added");
            }

        } else {
            System.out.println("Weapon list is already full");
        }

        return isWeaponAdded;
    }

    // read operation
    public void getWeapons() {
        System.out.println("The available weapons are:");
        for (String weapon : weaponNames)
            System.out.println(weapon);
    }
}