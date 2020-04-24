package bank;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateful
public class BankSessionBean implements BankSessionBeanLocal
{
@PersistenceContext
private EntityManager em;
private long acc;
private long balance;
@Override
public long getAcc()
{
return acc;
}
@Override
public long getBal(long toacc)
{
Bank bank;
bank = em.find(Bank.class,toacc);
if(bank!=null)
return bank.getBalance();
else
return -1;
}
@Override
public int withdraw(long accno,long amount)
{
long bal = getBal(accno);
if(bal>=amount)
{
bal = bal-amount;
Query query = em.createNamedQuery("update");
query.setParameter("accno", accno);
query.setParameter("bal", bal);
query.executeUpdate();
return 1;
}
else
return 0;
}
@Override
public void deposit(long accno,long amount)
{
long bal = getBal(accno);
bal = bal+amount;
Query query = em.createNamedQuery("update");
query.setParameter("accno", accno);
query.setParameter("bal", bal);
query.executeUpdate();
}
@Override
public void add(long id,long acc, String name, String pass,long bal)
{
Bank bank = new Bank(id,acc,name,pass,bal);
this.em.persist(bank);
}
@Override
public int validate(String name, String pass)
{
int flag = 0;
Query query = em.createNamedQuery("findAcc");
query.setParameter("name", name);
query.setParameter("pass", pass);
try{
Bank bank = (Bank)query.getSingleResult();
flag=1;
this.balance = bank.getBalance();
this.acc = bank.getAccno();
}catch(Exception e){
return flag;
}
return flag;
}
}
