package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {
        ICCIBank komal = new ICCIBank("Komal", 100);
        //long bal = komal.bal; Not going to work
        long bal = komal.getBal();
        System.out.println(bal);

        komal.setBal(500, false);
        long bal2 = komal.getBal();
        System.out.println(bal2);

        komal.setBal(500, true);
        long bal3 = komal.getBal();
        System.out.println(bal3);


    }
}

class ICCIBank {

    private String name;
    private long bal;

    public ICCIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the bal");
        }


    }
}
