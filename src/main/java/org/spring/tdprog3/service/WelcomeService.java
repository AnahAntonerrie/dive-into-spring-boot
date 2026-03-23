package org.spring.tdprog3.service;

import org.spring.tdprog3.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WelcomeService {
    public String getWelcomeMessage(String name) {
        return "Welcome, " + name;
    }
}
