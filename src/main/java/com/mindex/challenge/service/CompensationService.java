package com.mindex.challenge.service;

//Imports
import com.mindex.challenge.data.Compensation;

public interface CompensationService {
    Compensation create(Compensation compensation);
    Compensation read(String id);
}
