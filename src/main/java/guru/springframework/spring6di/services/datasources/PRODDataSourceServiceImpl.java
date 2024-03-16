package guru.springframework.spring6di.services.datasources;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class PRODDataSourceServiceImpl implements DataSourceService{
    @Override
    public String getConnectionString() {
        return "DATA_CONNECTION:DATASOURCE;ENV=PROD";
    }
}
