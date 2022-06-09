package com.splitwise.splitapp.Services;

import java.util.Map;

public interface AuthenticationService {
    Map<String,String>verify(String email,String password);
    Map<String,String>registerUser(String email,String password);
}
