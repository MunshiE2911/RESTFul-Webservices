/*
 * package com.munshi.rest.webservices.restfulwebservices.config;
 * 
 * import org.springframework.vault.authentication.TokenAuthentication; import
 * org.springframework.vault.client.VaultEndpoint; import
 * org.springframework.vault.core.VaultTemplate; import
 * org.springframework.vault.support.VaultResponseSupport;
 * 
 * public class VaultImpl {
 * 
 * 
 * VaultTemplate vaultTemplate = new VaultTemplate(new VaultEndpoint(), new
 * TokenAuthentication("s.HgFGlqH1XdEeverVFmqeeOaO"));
 * 
 * 
 * public void writeSecrets() {
 * 
 * VaultEndpoint endpoint = new VaultEndpoint(); endpoint.setScheme("http");
 * 
 * VaultTemplate vaultTemplate = new VaultTemplate(endpoint, new
 * TokenAuthentication("s.HgFGlqH1XdEeverVFmqeeOaO")); Credentials credentials =
 * new Credentials("ebrahim", "munshi"); vaultTemplate.write("secret/myapp",
 * credentials); }
 * 
 * public void readSecrets() { VaultTemplate vaultTemplate = new
 * VaultTemplate(new VaultEndpoint(), new
 * TokenAuthentication("s.HgFGlqH1XdEeverVFmqeeOaO"));
 * 
 * VaultResponseSupport<Credentials> response = vaultTemplate.
 * read("secret/myapp", Credentials.class); String username =
 * response.getData().getUserId(); System.out.println("UserID: "+username);
 * 
 * String password = response.getData().getPassword();
 * System.out.println("password: "+password); } }
 */