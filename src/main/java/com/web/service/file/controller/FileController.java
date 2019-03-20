package com.web.service.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.web.service.file.service.FileService;
import io.swagger.annotations.ApiOperation;

@RestController
public class FileController {

  @Autowired
  private FileService fileService;

  @ApiOperation(value = "Open file")
  @PostMapping(value = "/open")
  public void open(@RequestBody String filePath) {
    fileService.openDocument(filePath);
  }

}
