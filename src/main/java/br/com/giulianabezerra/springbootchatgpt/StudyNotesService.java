package br.com.giulianabezerra.springbootchatgpt;

import reactor.core.publisher.Mono;

public interface StudyNotesService {
  Mono<String> createStudyNotes(String topic);
}
