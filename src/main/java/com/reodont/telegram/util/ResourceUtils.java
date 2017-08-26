package com.reodont.telegram.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ResourceUtils {

    private ResourceUtils() {
        throw new AssertionError("This class is not for you");
    }

    public static InputStream getResourceAsStream(final String fileName) throws IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader.getResourceAsStream(fileName);
    }

    public static Properties getResourceAsProperties(final String fileName) throws IOException {
        InputStream resourceAsStream = getResourceAsStream(fileName);
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        return properties;
    }
}
