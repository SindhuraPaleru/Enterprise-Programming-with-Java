package com;
import java.util.concurrent.Future;
import javax.ejb.Local;
@Local
public interface NewSessionBeanLocal {
public void init(Future obj,int time);
public Future<Long> calculateMaxPrimeBelow(long upperLimit);
}
