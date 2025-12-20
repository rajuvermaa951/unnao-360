package com.unnao360.controller;

import com.unnao360.entity.Admin;
import com.unnao360.repository.AdminRepository;
import com.unnao360.security.JwtUtil;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AdminRepository adminRepo;
    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthController(AdminRepository adminRepo, JwtUtil jwtUtil) {
        this.adminRepo = adminRepo;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Admin admin) {

        Admin dbAdmin = adminRepo.findByUsername(admin.getUsername())
                .orElseThrow(() -> new RuntimeException("Invalid username"));

        if (!encoder.matches(admin.getPassword(), dbAdmin.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String token = jwtUtil.generateToken(dbAdmin.getUsername());

        return Map.of("token", token);
    }



  

    

}
