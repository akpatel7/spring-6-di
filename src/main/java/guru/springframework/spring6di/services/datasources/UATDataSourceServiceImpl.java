package guru.springframework.spring6di.services.datasources;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class UATDataSourceServiceImpl implements DataSourceService{
    @Override
    public String getConnectionString() {
        return "DATA_CONNECTION:DATASOURCE;ENV=UAT";
    }
}
