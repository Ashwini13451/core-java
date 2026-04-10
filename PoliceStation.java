class PoliceStation {

    String caseNames[] = new String[10];
    int index;

    // create operation
    public boolean addCase(String caseName) {
        boolean isCaseAdded = false;

        if (index < caseNames.length) {

            if (caseName != null && !caseName.isEmpty()) {
                caseNames[index++] = caseName;
                isCaseAdded = true;

            } else {
                System.out.println(caseName + " not added");
            }

        } else {
            System.out.println("Case list is already full");
        }

        return isCaseAdded;
    }

    // read operation
    public void getCases() {
        System.out.println("The available cases are:");
        for (String caseName : caseNames)
            System.out.println(caseName);
    }
}