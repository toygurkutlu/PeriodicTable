package io.github.toygurkutlu.periodic_table.domain;

import java.util.Locale;
import java.util.ResourceBundle;

public class Dictionary {

    private static ResourceBundle rb;

    static {
        setLocale(Locale.ENGLISH);
    }

    private Dictionary() {}

    public static synchronized void setLocale(Locale locale) {
        rb = ResourceBundle.getBundle(
                "lang/resource_bundle",
                locale,
                ResourceBundle.Control.getNoFallbackControl(ResourceBundle.Control.FORMAT_PROPERTIES)
        );
    }

    public static String getText(String key) {
        return rb.getString(key);
    }
}