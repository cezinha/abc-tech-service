package br.com.fiap.abctechservice.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesComponentTests {
    private PropertiesComponent propertiesComponent;

    @BeforeEach
    void setUp() {
        propertiesComponent = new PropertiesComponent();
    }

    @Test
    void testGetName() {
        Assertions.assertNotNull(propertiesComponent.getName());
    }
    @Test
    void testGetVersion() {
        Assertions.assertNotNull(propertiesComponent.getVersion());
    }
}
