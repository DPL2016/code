package com.kaishengit.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    public List<String> findAll() {
        List<String>names = new ArrayList<String>();
        names.add("AA");
        names.add("AB");
        names.add("BA");
        names.add("BB");
        return names;
    }
}
