package ru.np;

import com.google.common.cache.CacheBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableCaching
public class CbrApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(CbrApplication.class).run(args);
    }

    @Bean
    public org.springframework.cache.CacheManager cacheManager() {

        return new ConcurrentMapCacheManager() {

            // кэшируем ответ ЦБ на 2 минуты
            // TODO если курс не меняется в течение суток, можно убрать ограничение кэширования по времени

            @Override
            protected Cache createConcurrentMapCache(final String name) {
                return new ConcurrentMapCache(name,
                        CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.MINUTES).build().asMap(), false);
            }
        };
    }
}