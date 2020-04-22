package com;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
@ServerEndpoint("/chat")
public class NewWSEndpoint {
Iterator<Session> iterator;
static Set<Session> chatroomusers=Collections.synchronizedSet(new HashSet<Session>());
@OnOpen
public void handleOpen(Session usersession){
chatroomusers.add(usersession);
}
@OnMessage
public void onMessage(String message,Session usersession) throws IOException {
String un=(String)usersession.getUserProperties().get("un");
if(un==null){
usersession.getUserProperties().put("un",message);
usersession.getBasicRemote().sendText("Connected:"+message);
}
else{
iterator=chatroomusers.iterator();
while(iterator.hasNext()){
iterator.next().getBasicRemote().sendText(un+":"+message);
}
}
}
@OnClose
public void handleClose(Session usersession){
chatroomusers.remove(usersession);
}
}
