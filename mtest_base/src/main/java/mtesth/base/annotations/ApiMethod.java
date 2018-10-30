package mtesth.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018/10/30.
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiMethod {
    String value();

    String descript();

    ApiParam[] apiParams() default {};

    boolean needLogin() default false;

    boolean privateApi() default false;

    boolean backendApi() default false;
}
