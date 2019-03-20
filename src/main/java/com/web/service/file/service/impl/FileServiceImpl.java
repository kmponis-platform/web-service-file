package com.web.service.file.service.impl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Component;
import com.web.service.file.service.FileService;

@Component
public class FileServiceImpl implements FileService {

  @Override
  public void openDocument(String filePath) {
    Desktop dt = Desktop.getDesktop();
    try {
      dt.open(new File(filePath));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
