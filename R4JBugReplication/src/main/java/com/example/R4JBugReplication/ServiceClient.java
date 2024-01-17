package com.example.R4JBugReplication;

public interface ServiceClient {
    public String getResource();
    public String fallback(Exception e);

}
