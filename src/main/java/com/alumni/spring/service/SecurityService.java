package com.alumni.spring.service;

public interface SecurityService {
    String trouverConnexionParLogin();

    void autoLogin(String login, String password);
}
