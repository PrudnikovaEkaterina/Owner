package ru.prudnikova.config;

import org.aeonbits.owner.Config;
@Config.Sources({
//        "file:/tmp/secret.properties",
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {
    @Key("phone")
    String phone();

    @Key("password")
    String password();
}
