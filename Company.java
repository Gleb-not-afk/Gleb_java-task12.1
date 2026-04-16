import taxes.TaxSystem;

public class Company {
    String title;
    int debit;
    int credit;
    TaxSystem taxSystem;

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        else if (amount < 0){
            credit += Math.abs(amount);
        }
    }
    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        debit = 0;
        credit = 0;
    }
    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб."); //todo добавить пробелы при выводе (в целом поправить по заданию форматирование)
        debit = 0;
        credit = 0;
    }
}
