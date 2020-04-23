package com;
import java.util.concurrent.Future;
import javax.annotation.Resource;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {
private Timer timer;
@Resource
private SessionContext context;
Future obj1;
@Override
public void init(Future obj,int time)
{
obj1=obj;
TimerService timerService = context.getTimerService();
timer = timerService.createSingleActionTimer(time,null);
}
@Timeout
public void timeOutMethod(Timer t)
{
System.out.println("rt "+t.getTimeRemaining());
obj1.cancel(true);
System.out.println("Timedout");
timer.cancel();
}
@Override
@Asynchronous
public Future<Long> calculateMaxPrimeBelow(long upperLimit)
{
System.out.println("Timer started");
Long current = null;
for (long candidate = 2; candidate < upperLimit+1; candidate++)
{
if (isPrime(candidate))
current = candidate;
if (context.wasCancelCalled()) {
System.out.println("Cancel was called....");
return null;
}
}
return new AsyncResult<Long>(current);
}
private boolean isPrime(long l)
{
for (long i = 2; i <= (long) l/2; i++)
{
if ((l % i) == 0)
return false;
}
return true;
}
}
