package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.FunctionDao;
import com.model.Function;

@Service
public class FunctionService {
    @Autowired
    private FunctionDao functionDao;
    
    
    public List<Function> getAllFunction(){
    	    return functionDao.getAllFunction();
    }
}
