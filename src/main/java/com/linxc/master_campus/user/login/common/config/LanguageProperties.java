package com.linxc.master_campus.user.login.common.config;

import org.springframework.context.annotation.Configuration;

import java.util.Locale;

/**
 * @author Administrator
 */
@Configuration
public class LanguageProperties {

    private Locale locale;

    public LanguageProperties(){
        locale = Locale.getDefault();
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Locale getDefaultLanguage(){
        return this.locale;
    }
}
