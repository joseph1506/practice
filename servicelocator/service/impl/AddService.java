package practice.servicelocator.service.impl;

import practice.servicelocator.service.Service;

public class AddService implements Service {
    @Override
    public String getName() {
        return "AddService";
    }

    @Override
    public void execute() {
        System.out.println("Adding to Database");
    }
}
