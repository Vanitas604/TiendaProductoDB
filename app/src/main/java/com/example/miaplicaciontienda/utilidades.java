package com.example.miaplicaciontienda;

import java.util.Base64;

import java.util.Base64;
public class utilidades {
    static String url_consulta = "http://192.168.1.111:5984/tienda/_design/tienda/_view/tienda";
    static String url_mto = "http://192.168.1.111:5984/tienda";
    static String user = "Josuealejandro";//Agregar usuario
    static String passwd = "123456789";//Agregar contraseña
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user + ":" + passwd).getBytes());
    public String generarUnicoId(){
        return java.util.UUID.randomUUID().toString();
    }
}

