package com.academia.javaspring.academiajavaspring.controller;

import com.academia.javaspring.academiajavaspring.entity.Matricula;
import com.academia.javaspring.academiajavaspring.entity.form.MatriculaForm;
import com.academia.javaspring.academiajavaspring.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

  @Autowired
  private MatriculaServiceImpl service;

  @PostMapping
  public Matricula create(@Valid @RequestBody MatriculaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

}