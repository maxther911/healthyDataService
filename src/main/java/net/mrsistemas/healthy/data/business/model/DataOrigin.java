package net.mrsistemas.healthy.data.business.model;

import lombok.Getter;
import lombok.Setter;

public class DataOrigin {
    @Getter @Setter
    private String appId;
    @Getter @Setter
    private AppType appType;
    @Getter @Setter
    private String AppName;

}
