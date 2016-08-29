package practice.servicelocator.service.impl;

import practice.servicelocator.service.Service;

public class RetrievalService implements Service {
    @Override
    public String getName() {
        return "Retrieval Service";
    }

    @Override
    public void execute() {
        System.out.println("Retrieving from Database");
    }
}
