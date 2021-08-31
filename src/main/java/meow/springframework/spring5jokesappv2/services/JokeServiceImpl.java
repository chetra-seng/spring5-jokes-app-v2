package meow.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    @Override
    public String getJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
