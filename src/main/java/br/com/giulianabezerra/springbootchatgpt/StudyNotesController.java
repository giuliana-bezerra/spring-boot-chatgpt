package br.com.giulianabezerra.springbootchatgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class StudyNotesController {
  @Autowired
  private StudyNotesService service;

  @PostMapping("study-notes")
  public Mono<String> createStudyNotes(@RequestBody String topic) {
    return service.createStudyNotes(topic);
  }
}
