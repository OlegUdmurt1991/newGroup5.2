package HW.Lesson60.com.megabankcorp.system;

import HW.Lesson60.com.megabankcorp.records.Account;

import java.math.BigDecimal;

public abstract class Database extends Account{
    /**
     * сохраняет указанную сумму на указанный счет
     * не содержит реализации, просто сигнатура с описанием
     * доступен отовсюду
     */
    public abstract void deposit(Account account, BigDecimal amount);

    /**
     * снимает указанную сумму с указанного счета
     * не содержит реализации, просто сигнатура с описанием
     * доступен отовсюду
     */
    public abstract void withdraw(Account account, BigDecimal amount);

    /**
     * получает значение суммы с указанного счета
     * не содержит реализации, просто сигнатура с описанием
     * доступен только из пакета и реализаций
     */
    abstract BigDecimal getAmount(Account account);

    /**
     * передает указанную сумму с одного указанного счета на другой
     * содержит реализацию по умолчанию, использующую методы deposit и withdraw
     * доступен только из пакета
     */
    void transfer(Account fromAccount, Account toAccount, BigDecimal amount) {
        BigDecimal fromAmount = getAmount(fromAccount);
        if (fromAmount.compareTo(amount) >= 0) {
            withdraw(fromAccount, amount);
            deposit(toAccount, amount);
        }
    }

}
