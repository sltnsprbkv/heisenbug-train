package io.github.sltnsprbkv.heisenbug.train.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.github.sltnsprbkv.heisenbug.train.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
