package com.stefan.designpattern.oop;

import com.stefan.designpattern.utils.IdGenerator;
import exception.InsufficientAmountException;
import exception.InvalidAmountException;

import java.math.BigDecimal;

public class Wallet {
    private String id;
    private long createTime;
    private BigDecimal balance;
    private long balanceLastModifiedTime;

    public Wallet() {
        this.id = IdGenerator.getInstance().generate();
        this.createTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    // 注意：下面对get方法做了代码折叠，是为了减少代码所占文章的篇幅
    public String getId() {
        return this.id;
    }
    public long getCreateTime() {
        return this.createTime;
    }
    public BigDecimal getBalance() {
        return this.balance;
    }
    public long getBalanceLastModifiedTime() {
        return this.balanceLastModifiedTime;
    }
    public void increaseBalance(BigDecimal increasedAmount) throws InvalidAmountException {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("invalid amount");
        }
        this.balance = this.balance.add(increasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }
    public void decreaseBalance(BigDecimal decreasedAmount) throws InvalidAmountException, InsufficientAmountException {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("invalid amount");
        }
        if (decreasedAmount.compareTo(this.balance) > 0) {
            throw new InsufficientAmountException("insufficient amount");
        }
        this.balance = this.balance.subtract(decreasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }
}
