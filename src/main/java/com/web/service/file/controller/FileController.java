package com.web.service.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

  @ApiOperation(value = "Do a post request: ", response = String.class)
  @PostMapping(value = "/post")
  public String post(@RequestParam(value = "a") String a) {
    if ("madrid".equalsIgnoreCase(a)) {
      return "This is a post: Hola " + a + " we are comming!";
    }
    return "This is a post: Parameter " + a;
  }

  @ApiOperation(value = "Do a get request: ", response = String.class)
  @GetMapping(value = "/get")
  public String get(@RequestParam(value = "a") String a) {
    if ("madrid".equalsIgnoreCase(a)) {
      return "This is a get: Hola " + a + " we are comming!";
    }
    return "This is a get: Parameter " + a;
  }

}
