package com.andi.spring04abstraction.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.andi.spring04abstraction.proxy",
                            "com.andi.spring04abstraction.repository",
                            "com.andi.spring04abstraction.service"})
public class ProjectConfig {
}
