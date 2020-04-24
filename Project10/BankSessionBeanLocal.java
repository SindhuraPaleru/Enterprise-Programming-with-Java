package bank;
import javax.ejb.Local;
@Local
public interface BankSessionBeanLocal
{
public long getAcc();
public long getBal(long toacc);
public int withdraw(long accno, long amount);
public void deposit(long accno, long amount);
public void add(long id,long acc, String name, String pass,long bal);
public int validate(String name, String pass);
}
