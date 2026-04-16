import taxes.TaxSystem;
import taxes.TaxSystemDebit;
import taxes.TaxSystemDebitMinusCredit;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Eltex", new TaxSystemDebitMinusCredit());
        company1.shiftMoney(1000);
        company1.payTaxes();
        Company company2 = new Company("Askon", new TaxSystemDebit());
        company2.shiftMoney(600);
        company2.shiftMoney(-1000);
        company2.payTaxes();
    }
}



