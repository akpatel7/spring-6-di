package guru.springframework.spring6di.services.datasources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("UAT")
@SpringBootTest
class UATDataSourceServiceImplTest {

    @Autowired
    DataSourceService dataSourceService;

    @Test
    void getConnectionString() {
        System.out.println(dataSourceService.getConnectionString());
    }
}