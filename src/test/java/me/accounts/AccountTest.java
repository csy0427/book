package me.accounts;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    public void getterSetter(){
        Account account=new Account();
        account.setUsername("soo");
        account.setPassword("password");
        assertThat(account.getUsername(),is("soo"));
    }
}
