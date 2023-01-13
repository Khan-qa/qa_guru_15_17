package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebDriverConfig extends Config{

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browserVersion")
    @DefaultValue("100")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remote")
    String remote();

    @Key("baseUrl")
    @DefaultValue("https://market.forte.kz")
    String baseUrl();
}
