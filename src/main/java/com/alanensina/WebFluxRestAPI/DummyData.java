// Use this class only to start the application for the first time just to populate the database, after that, comment the class below.

/*
package com.alanensina.WebFluxRestAPI;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alanensina.WebFluxRestAPI.document.Playlist;
import com.alanensina.WebFluxRestAPI.repository.PlaylistRepository;

import reactor.core.publisher.Flux;


// This class is in charge for populating the database with mocked data

@Component
public class DummyData implements CommandLineRunner {

	private final PlaylistRepository repository;

	public DummyData(PlaylistRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll()
				.thenMany(Flux
						.just("Guns N' Roses", "AC/DC", "Led Zeppelin", "U2", "Black Sabbath", "Alter Bridge", "Aerosmith","Foo Fighters", "Queen", "KISS")
						.map(name -> new Playlist(UUID.randomUUID().toString(), name)).flatMap(repository::save))
				.subscribe(System.out::println);
	}
}
*/