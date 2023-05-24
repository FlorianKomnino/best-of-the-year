package org.java.bestoftheyear.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.bestoftheyear.Movie;
import org.java.bestoftheyear.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MyController {	
	
	public List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<>();
		Movie movie1 = new Movie(1, "Il signore degli anelli");
		Movie movie2 = new Movie(2, "Matrix");
		Movie movie3 = new Movie(3, "La foresta dei pugnali volanti");
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		
		return movies;
	}
	
	public List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<>();
		Song song1 = new Song(1, "Emozioni");
		Song song2 = new Song(2, "Trunky Funky");
		Song song3 = new Song(3, "La mia parte intollerante");
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		
		return songs;
	}
	
	@GetMapping("/bestOfTheYear")
	public String bestOfTheYear(Model model,
			@RequestParam(name = "name") String name) {
		
		model.addAttribute("name", name);
		
		return "index";
	}
	
	@GetMapping("/user/{id}")
	public String sayHelloToId(Model model,
			@PathVariable("id") int id) {
		
		model.addAttribute("name", "Florian " + id);
		
		return "index";
	}
	
	@GetMapping("/movies")
	public String getMovies(Model model) {
		
		List<Movie> lm = getBestMovies();
		String res = "I migliori film trovati sono:";
		int iter = 1;
		for(Movie m : lm) {
				res += " " + m.getName() + ",";
		}
		
		model.addAttribute("listOfMovies", res);
		
		return "index";
	}
}
