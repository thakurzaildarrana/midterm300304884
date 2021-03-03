package com.example.demo.Model;

import com.example.demo.Random.RandomJokes;

public class OurModel {
	
	String joke;
    RandomJokes rj;
	public OurModel() {
		
		joke = rj.getRandomJokes();
	}

	

	public String getJoke() {
		return joke;
	}

	public void setJoke() {
		joke = rj.getRandomJokes();
	}
	@Override
	public String toString() {
		return joke;
	}

}
