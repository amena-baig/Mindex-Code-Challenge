package com.mindex.challenge.controller;

//Imports
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
    This is where I create the ReportingStructure REST endpoint.
 */
@RestController
public class ReportingStructureController
{
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);

    @Autowired
    private ReportingStructureService ReportingStructureService;

    //This endpoint reads a ReportingStructure with a provided id
    @GetMapping("/reportingStructure/{id}")
    public ReportingStructure read(@PathVariable String id) {
        LOG.debug("Received reportingStructure read request for id [{}]", id);

        return ReportingStructureService.read(id);
    }
}
