package com.andi.spring05corebeanscope.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.andi.spring05corebeanscope.proxy",
                            "com.andi.spring05corebeanscope.repository",
                            "com.andi.spring05corebeanscope.service"})
public class ProjectConfig {
}
