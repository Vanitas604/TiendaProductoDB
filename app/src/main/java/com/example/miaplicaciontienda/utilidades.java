package com.example.miaplicaciontienda;

import java.util.Base64;

public class utilidades {

    static String url_consulta = "http://192.168.1.5:5984/tienda/_design/tienda/_view/tienda";
    static String url_mto = "http://192.168.1.5:5984/tienda";
    static String user = "admin";
    static String password = "1234";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user + ":"+ password).getBytes());
    public String generarUnicoId(){
        return java.util.UUID.randomUUID().toString();
    }
}
