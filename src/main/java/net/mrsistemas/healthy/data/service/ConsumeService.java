package net.mrsistemas.healthy.data.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.mrsistemas.healthy.data.business.config.PropertiesConfig;
import net.mrsistemas.healthy.data.business.model.User;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

public class ConsumeService {

    public User getUserByService(Long id, String token) throws Exception {
        String url = new StringBuilder(new PropertiesConfig().getProperty("endpoint.service.user.id")).append(id).toString();
        String responseBody = null;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token).build();

        try (Response response = client.newCall(request).execute()) {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.body().string(), User.class);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
