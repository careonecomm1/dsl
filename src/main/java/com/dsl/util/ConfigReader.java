package com.dsl.util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConfigReader {

    private String user;
    private String password;
    private String urldb;

    private Long chunk;
    private Long offset;

    private String apiDespegarUrl;
    private String apiKey;

    public String getApiDespegarUrl() {
        return apiDespegarUrl;
    }

    public void setApiDespegarUrl(String apiDespegarUrl) {
        this.apiDespegarUrl = apiDespegarUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getChunk() {
        return chunk;
    }

    public void setChunk(Long chunk) {
        this.chunk = chunk;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }


    public ConfigReader() {

        File credentials = getCustomerFileReader.apply("config/Credentials.json");

        JSONParser parser = new JSONParser();
        try (Reader is = new FileReader(credentials)) {
            JSONObject credentialsJson = (JSONObject)parser.parse(is);

            setUrldb(readCredentialsField.apply(credentialsJson,"jdbcUrl"));
            setUser(readCredentialsField.apply(credentialsJson,"user"));
            setPassword(readCredentialsField.apply(credentialsJson,"password"));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }

    public Function<String, File> getCustomerFileReader = filename -> {
        File customer = new File(filename);
        return customer;
    };


    /**
     * Read the JSON entry and return userdb
     */
    private BiFunction<JSONObject,String, String> readCredentialsField = (c,p) -> (String) ((JSONObject) ((JSONObject)
            c.get("dbConnections")).get("dsldb")).get(p);

    public String getUrldb() {
        return urldb;
    }

    public void setUrldb(String urldb) {
        this.urldb = urldb;
    }
}
