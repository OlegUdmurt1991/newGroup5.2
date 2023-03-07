package HW.Lesson66.Task1.com.megabankcorp.records;

import java.math.BigDecimal;

/**
 * Представим, что вы занимаетесь проектированием банковской системы учета.
 * Ваша задача описать базовые классы, на основании которых могут делаться остальные.
 * Спроектируйте классы Account (счет) и Database (база данных) согласно описанию:
 * <p>
 * Database
 * Этот класс является абстрактным шаблоном для реализаций,
 * которые будут создаваться в виде наследников этого класса.
 * В нем находятся методы, которые наследники обязаны реализовать.
 * Или реализации методов по-умолчанию.
 * Вам наследников реализовывать не надо.
 * <p>
 * находится в пакете com.megabankcorp.system
 * содержит заготовки методов
 * - deposit - сохраняет указанную сумму на указанный счет
 * не содержит реализации, просто сигнатура с описанием
 * доступен отовсюду
 * <p>
 * - withdraw - снимает указанную сумму с указанного счета
 * не содержит реализации, просто сигнатура с описанием
 * доступен отовсюду
 * <p>
 * - getAmount - получает значение суммы с указанного счета
 * не содержит реализации, просто сигнатура с описанием
 * доступен только из пакета и реализаций
 * <p>
 * - transfer - передает указанную сумму с одного указанного счета на другой
 * содержит реализацию по умолчанию, использующую методы deposit и withdraw
 * доступен только из пакета
 * <p>
 * Для суммы используйте тип BigDecimal.
 * Для параметров счетов используете класс Account
 * <p>
 * Account
 * это простой класс, который находится в пакете com.megabankcorp.records
 * содержит
 * поле для текущей суммы на счете
 * поле для текущего номера счета
 * поле для номера клиента банка
 * <p>
 * Для суммы используйте тип BigDecimal, для номеров - long
 */
public class Account {
    /**
     * поле для текущей суммы на счете
     */
    private BigDecimal balance;
    /**
     * поле для текущего номера счета
     */
    private long accountNumber;
    /**
     * поле для номера клиента банка
     */
    private long clientNumber;

    /**
     * Создаем констркуктор с копиями наших переменных и получиаем доступ к переменным(копиям)
     */
    public Account(BigDecimal balance, long accountNumber, long clientNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.clientNumber = clientNumber;
    }

    /**
     * гетер получает значение переменной(копии)
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Принимает новое значение переменной ,но приэтом старое значение вызвать с помощью get
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * гетер получает значение переменной(копии)
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Принимает новое значение переменной ,но приэтом старое значение вызвать с помощью get
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * гетер получает значение переменной(копии)
     */
    public long getClientNumber() {
        return clientNumber;
    }

    /**
     * Принимает новое значение переменной ,но приэтом старое значение вызвать с помощью get
     */
    public void setClientNumber(long clientNumber) {
        this.clientNumber = clientNumber;
    }
}