package bank;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQueries({
@NamedQuery(
name="findAcc",
query="select b from Bank b where b.name = :name and b.password = :pass"),
@NamedQuery(
name="findByAccno",
query="select b from Bank b where b.accno = :accno"),
@NamedQuery(
name="update",
query="update Bank b set b.balance = :bal where b.accno = :accno")
})
public class Bank implements Serializable
{
@Id
private long accno;
private String name;
private String password;
private long balance;
private long id;
public void setId(long id) {
this.id = id;
}
public long getId()
{
return id;
}
public Bank(){}
public Bank(long id,long accno, String name, String password, long balance)
{
this.id=id;
this.accno = accno;
this.name = name;
this.password = password;
this.balance = balance;
}
public long getAccno()
{
return accno;
}
public void setAccno(long accno)
{
this.accno= accno;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public String getPassword()
{
return password;
}
public void setPassword(String password)
{
this.password = password;
}
public long getBalance()
{
return balance;
}
public void setBalance(long balance)
{
this.balance = balance;
}
