package live.fanxing.security.annotation;

import live.fanxing.security.FanxingSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ImportAutoConfiguration(FanxingSecurityAutoConfiguration.class)
public @interface EnableFanxingSecurity {
}