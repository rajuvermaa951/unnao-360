package com.unnao360.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix="jwt")
@Component
@Data
public class JwtProperties {
	@Value("$jwt.key")
	private String key;
	
     @Value("${jwt.expiration}")
	private long expiration;

}
