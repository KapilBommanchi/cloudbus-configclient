package com.sample.cloudbus.client.cloudbusclient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "abc")
@Getter
@Setter
@ToString
public class Sample {
    String name;
}
