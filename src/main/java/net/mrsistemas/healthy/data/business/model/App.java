package net.mrsistemas.healthy.data.business.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class App {

    @Getter @Setter
    private String client_id;
    @Getter @Setter
    private String client_secret;
    @Getter @Setter
    private String resource_ids;
    @Getter @Setter
    private String scope;
    @Getter @Setter
    private String authorized_grant_types;
    @Getter @Setter
    private String web_server_redirect_uri;
    @Getter @Setter
    private String authorities;
    @Getter @Setter
    private String additional_information;
    @Getter @Setter
    private String autoapprove;
    @Getter @Setter
    private AppType type;
}
