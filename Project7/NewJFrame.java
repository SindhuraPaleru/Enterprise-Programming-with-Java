import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
public class NewJFrame extends javax.swing.JFrame {
private WebTarget webTarget;
private Client client;
private static final String BASE_URI = "http://localhost:8080/Labprg7_100/webresources";
int flag=0;
public NewJFrame() {
initComponents();
}
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
jTextField1 = new javax.swing.JTextField();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();
jButton6 = new javax.swing.JButton();
jButton7 = new javax.swing.JButton();
jButton8 = new javax.swing.JButton();
jButton9 = new javax.swing.JButton();
jButton10 = new javax.swing.JButton();
jButton11 = new javax.swing.JButton();
jButton12 = new javax.swing.JButton();
jButton13 = new javax.swing.JButton();
jButton14 = new javax.swing.JButton();
jButton15 = new javax.swing.JButton();
jButton16 = new javax.swing.JButton();
jButton17 = new javax.swing.JButton();
jButton18 = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
jButton1.setText("1");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});
jButton2.setText("2");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
});
jButton3.setText("3");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});
jButton4.setText("4");
jButton4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton4ActionPerformed(evt);
}
});
jButton5.setText("5");
jButton5.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton5ActionPerformed(evt);
}
});
jButton6.setText("6");
jButton6.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton6ActionPerformed(evt);
}
});
jButton7.setText("7");
jButton7.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton7ActionPerformed(evt);
}
});
jButton8.setText("8");
jButton8.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton8ActionPerformed(evt);
}
});
jButton9.setText("9");
jButton9.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton9ActionPerformed(evt);
}
});
jButton10.setText("0");
jButton10.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton10ActionPerformed(evt);
}
});
jButton11.setText("=");
jButton11.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton11ActionPerformed(evt);
}
});
jButton12.setText("+");
jButton12.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton12ActionPerformed(evt);
}
});
jButton13.setText("-");
jButton13.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton13ActionPerformed(evt);
}
});
jButton14.setText("*");
jButton14.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton14ActionPerformed(evt);
}
});
jButton15.setText("/");
jButton15.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton15ActionPerformed(evt);
}
});
jButton16.setText(".");
jButton16.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton16ActionPerformed(evt);
}
});
jButton17.setText("<-");
jButton17.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton17ActionPerformed(evt);
}
});
jButton18.setText("+/-");
jButton18.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton18ActionPerformed(evt);
}
});
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
.addContainerGap(266, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(layout.createSequentialGroup()
.addComponent(jButton1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jButton2)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton3))
.addGroup(layout.createSequentialGroup()
.addComponent(jButton4)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jButton5)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton6)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton12)
.addComponent(jButton13)))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addComponent(jButton16)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jButton10))
.addGroup(layout.createSequentialGroup()
.addComponent(jButton7)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jButton8)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jButton9)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton14))
.addGroup(layout.createSequentialGroup()
.addComponent(jButton11)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton15)))))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton17)
.addComponent(jButton18)))))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1)
.addComponent(jButton2)
.addComponent(jButton3)
.addComponent(jButton12)
.addComponent(jButton17))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton4)
.addComponent(jButton5)
.addComponent(jButton6)
.addComponent(jButton13)
.addComponent(jButton18))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton7)
.addComponent(jButton8)
.addComponent(jButton9)
.addComponent(jButton14))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton10)
.addComponent(jButton11)
.addComponent(jButton15)
.addComponent(jButton16))
.addContainerGap(98, Short.MAX_VALUE))
);
pack();
}// </editor-fold>
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton5.getText();
jTextField1.setText(text);
}
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton2.getText();
jTextField1.setText(text);
}
private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton10.getText();
jTextField1.setText(text);
}
private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
String s=jTextField1.getText();
int a=s.length();
if(a==0)
{
jTextField1.setText("");
}
else
{
int b=a-1;
jTextField1.setText(jTextField1.getText().substring(0,b));
}
}
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton1.getText();
jTextField1.setText(text);
}
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton3.getText();
jTextField1.setText(text);
}
private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton4.getText();
jTextField1.setText(text);
}
private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton6.getText();
jTextField1.setText(text);
}
private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton7.getText();
jTextField1.setText(text);
}
private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton8.getText();
jTextField1.setText(text);
}
private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton9.getText();
jTextField1.setText(text);
}
private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText()+jButton16.getText();
jTextField1.setText(text);
}
private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
try{
String s1=jTextField1.getText();
System.out.println(s1+""+s1.length());
String s="";
char[] c=new char[s1.length()];
for(int i=0;i<s1.length();i++)
{
c[i]=s1.charAt(i);
if(c[i]=='/')
c[i]='|';
}
for(int i=0;i<s1.length();i++)
{
s+=c[i];
}
System.out.println("="+s);
client = javax.ws.rs.client.ClientBuilder.newClient();
webTarget = client.target(BASE_URI).path("generic").path(s);
jTextField1.setText(webTarget.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class));
}
catch(Exception e)
{
System.out.println(e);
}
}
private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
try{
String text="";
text=jTextField1.getText();
if(text.length()==0)
{
jTextField1.setText(jButton13.getText());
}
else{
client = javax.ws.rs.client.ClientBuilder.newClient();
webTarget = client.target(BASE_URI).path("generic").path(text);
String str=webTarget.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
if(text.endsWith("-"))
{
String str2=str.substring(0,str.length()-1);
jTextField1.setText(str2+"-");
}
else
{
String str2=str+jButton12.getText();
jTextField1.setText(str2);
}
}
}
catch(Exception e)
{
jTextField1.setText("Error!");
}
}
private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
try{
String text="";
text=jTextField1.getText();
if(text.length()==0)
{
jTextField1.setText(jButton13.getText());
}
else{
client = javax.ws.rs.client.ClientBuilder.newClient();
webTarget = client.target(BASE_URI).path("generic").path(text);
String str=webTarget.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
if(text.endsWith("-"))
{
String str2=str.substring(0,str.length()-1);
jTextField1.setText(str2+"+");
}
else if(text.endsWith("+")){
String str2=str.substring(0,str.length()-1);
jTextField1.setText(str2+"-");
}
else if(text.endsWith("*"))
{
if(text.startsWith("-"))
{
text=text.substring(1);
jTextField1.setText(text);
}
else{
text="-"+text;
jTextField1.setText(text);
}
}
else if(text.endsWith("/"))
{
if(text.startsWith("-"))
{
text=text.substring(1);
jTextField1.setText(text);
}
else{
text="-"+text;
jTextField1.setText(text);
}
}
else
{
String str2=str+jButton13.getText();
jTextField1.setText(str2);
}
}
}
catch(Exception e)
{
jTextField1.setText("Error!");
}
}
private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
try{
String text="";
text=jTextField1.getText();
if(text.length()==0)
{
jTextField1.setText(jButton14.getText());
}
else{
client = javax.ws.rs.client.ClientBuilder.newClient();
webTarget = client.target(BASE_URI).path("generic").path(text);
String str=webTarget.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
String str2=str+jButton14.getText();
jTextField1.setText(str2);
}
}
catch(Exception e)
{
jTextField1.setText("Error!!!");
}
}
private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
try{
String text="";
text=jTextField1.getText();
if(text.length()==0)
{
jTextField1.setText(jButton15.getText());
}
else{
client = javax.ws.rs.client.ClientBuilder.newClient();
webTarget = client.target(BASE_URI).path("generic").path(text);
String str=webTarget.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
String str2=str+jButton15.getText();
jTextField1.setText(str2);
}
}
catch(Exception e)
{
jTextField1.setText("Error!");
}
}
private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
String text=jTextField1.getText();
if(text.startsWith("-"))
{
text=text.substring(1);
jTextField1.setText(text);
}
else
{
text="-"+text;
jTextField1.setText(text);
}
}
public static void main(String args[]) {
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new NewJFrame().setVisible(true);
}
});
}
// Variables declaration - do not modify
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton10;
private javax.swing.JButton jButton11;
private javax.swing.JButton jButton12;
private javax.swing.JButton jButton13;
private javax.swing.JButton jButton14;
private javax.swing.JButton jButton15;
private javax.swing.JButton jButton16;
private javax.swing.JButton jButton17;
private javax.swing.JButton jButton18;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JButton jButton5;
private javax.swing.JButton jButton6;
private javax.swing.JButton jButton7;
private javax.swing.JButton jButton8;
private javax.swing.JButton jButton9;
private javax.swing.JTextField jTextField1;
// End of variables declaration
}
