package guru.springframework.spring6di.services.datasources;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service
public class DevDataSourceServiceImpl implements DataSourceService{
    @Override
    public String getConnectionString() {
        return "DATA_CONNECTION:DATASOURCE;ENV=DEV";
    }
}
