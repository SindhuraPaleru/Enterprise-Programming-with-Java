package com;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
public class NewJerseyClient {
private WebTarget webTarget;
private Client client;
private static final String BASE_URI = "http://localhost:8080/Labprg7_100/webresources";
public NewJerseyClient() {
client = javax.ws.rs.client.ClientBuilder.newClient();
webTarget = client.target(BASE_URI).path("generic");
}
public NewJerseyClient(String username, String password) {
this();
setUsernamePassword(username, password);
}
public String getText() throws ClientErrorException {
WebTarget resource = webTarget;
return resource.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
}
public void putText(Object requestEntity) throws ClientErrorException {
webTarget.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.TEXT_PLAIN));
}
public void close() {
client.close();
}
public final void setUsernamePassword(String username, String password) {
webTarget.register(new org.glassfish.jersey.client.filter.HttpBasicAuthFilter(username, password));
}
}
