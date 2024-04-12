package com.example.g116;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.security.enterprise.credential.UsernamePasswordCredential;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.security.enterprise.identitystore.IdentityStore;

import java.util.*;

import static jakarta.security.enterprise.identitystore.CredentialValidationResult.INVALID_RESULT;

@ApplicationScoped
public class gimnasioIdentityStore implements IdentityStore {
    private Map<String,String> credenciales; //ejemplo de almacén de credenciales
    public gimnasioIdentityStore() {
        credenciales = new HashMap<>();
        credenciales.put("usuario1", "clave1");
        credenciales.put("usuario2", "clave2");
    }
    public CredentialValidationResult validate (
            UsernamePasswordCredential usernamePasswordCredential ) {
//Recuperar credenciales proporcionadas por el servidor
        String username = usernamePasswordCredential.getCaller();
        String password = usernamePasswordCredential.getPasswordAsString();
//Ejemplo simple de verificación de credenciales
        String validPassword = credenciales.get(username);
        if (validPassword != null && validPassword.equals(password)) {
//Autenticación completada, obtener los roles del usuario...
            Set<String> roles = new HashSet<>(Arrays.asList("USUARIOS"));
//Pasar datos del usuario al servidor
            return new CredentialValidationResult(username,roles);
        }
        return INVALID_RESULT; //Autenticación inválida
    }
}