package net.mrsistemas.healthy.data.service;

import net.mrsistemas.healthy.data.business.model.User;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class ConsumeService {

    public String getUserByService(String id) throws IOException {
        String url = "http://localhost:9001/healthyClientServer/users/id/20190604000046";
        String responseBody = null;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsib2F1dGgyLXJlc291cmNlIiwiVVNFUl9DTElFTlRfUkVTT1VSQ0UiLCJVU0VSX0FETUlOX1JFU09VUkNFIl0sInVzZXJfbmFtZSI6Im1heHRoZXI5MTFAZ21haWwuY29tIiwic2NvcGUiOlsicm9sZV9hZG1pbiIsInJvbGVfdXNlciIsInJlYWQiXSwiaWQiOjIwMTkwNjA0MDAwMDQ2LCJleHAiOjE1NjY1MTc5NDEsImF1dGhvcml0aWVzIjpbInJvbGVfYWRtaW4iLCJyb2xlX3VzZXIiLCJyZWFkIiwiY2FuX3JlYWRfdXNlciIsImZvbyIsImNhbl91cGRhdGVfdXNlciIsIndyaXRlIiwiY2FuX2NyZWF0ZV91c2VyIiwiY2FuX2RlbGV0ZV91c2VyIl0sImp0aSI6IjNhNjNmOTJlLWFmNjMtNGFhYS1hM2NjLTM1MzVhNGZmNzc4MSIsImVtYWlsIjoiam9obkBnbWFpbC5jb20iLCJjbGllbnRfaWQiOiJVU0VSX0NMSUVOVF9BUFAifQ.W183p_Pn8eyuBzhKJOCKhlLGko32nS8hoJl4KkPi_Y6Tjl2i0nbwFH9u7x_YLqs4FpyI2tj6AJK-_eQVr0BCx2oKPceEmH_P9FJbOBNq5fdK8PnjUivh3KCASFSUpTp24dvTmP18mV7qA_sf_PcA54NdOudbHXuWNCcgtMzindL_ZK5AGfgTxw8FwhMpiFXY2A99hkNVoqxsy5XMMylOXVZ07u2zSiTVy6EV3ZvKZZcx6J-ebaj5419PZmKiutCGHzxZ_yda6pwb4ttZZ175ZxyEPTUyqNiIJ7MgKl-kgl-3a59gj0iCWAVhhXYn8wVj5PldDw2xOaDbpJ5cDKVCTw").build();
        try (Response response = client.newCall(request).execute()) {
            responseBody = response.body().string();

        }
        return responseBody;
    }
}
