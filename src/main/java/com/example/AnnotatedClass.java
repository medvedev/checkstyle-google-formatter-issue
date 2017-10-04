package com.example;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
  initParams = {
    @WebInitParam(
      name = "required name",
      value = "Let's put here a really long string to demonstrate the issue."
    )
  }
)
public class AnnotatedClass {}
