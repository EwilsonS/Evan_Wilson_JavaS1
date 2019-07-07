package com.evanco.controller;

import com.evanco.model.Answer;
import com.evanco.model.Quote;
import com.evanco.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteWordMagicController {

    /**
     * GET random Quote object from path: /quote.
     * Make method to create a Quote object based
     * on the Quote model and return the quote Object
     */
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getOneRandomQuote() {

        // Instantiate 10 new Quote objects
        Quote quote1 = new Quote();
        quote1.setAuthor("Dr Seuss");
        quote1.setQuote("Today you are you! That is truer than true! There is no one alive who is you-er than you!");

        Quote quote2 = new Quote();
        quote2.setAuthor("My Dad");
        quote2.setQuote("Evan, you can have a Cadillac when you have Cadillac money.");

        Quote quote3 = new Quote();
        quote3.setAuthor("Jay-Z");
        quote3.setQuote("I'm not a Business-Man! I'm a Business... man!");

        Quote quote4 = new Quote();
        quote4.setAuthor("T.S. Elliot");
        quote4.setQuote("Every moment is a fresh beginning.");

        Quote quote5 = new Quote();
        quote5.setAuthor("Mark Twain");
        quote5.setQuote("Never regret anything that made you smile.");

        Quote quote6 = new Quote();
        quote6.setAuthor("Pablo Picasso");
        quote6.setQuote("Everything you can imagine is real.");

        Quote quote7 = new Quote();
        quote7.setAuthor("Leonardo da Vinci");
        quote7.setQuote("Simplicity is the ultimate sophistication.");

        Quote quote8 = new Quote();
        quote8.setAuthor("Walt Disney");
        quote8.setQuote("Whatever you do, do it well. ");

        Quote quote9 = new Quote();
        quote9.setAuthor("Buddha");
        quote9.setQuote("What we think, we become.");

        Quote quote10 = new Quote();
        quote10.setAuthor("Kendrick Lamar");
        quote10.setQuote("If I’m gonna tell a real story, I’m gonna start with my name");

        // Add the new Quote objects to a List
        List<Quote> quotesList = new ArrayList<>();
        quotesList.add(quote1);
        quotesList.add(quote2);
        quotesList.add(quote3);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote9);
        quotesList.add(quote10);

        // Handle randomization logic
        Random rand = new Random();
        int n = rand.nextInt(quotesList.size());

        // return a random elements quote property from quotesList
        return quotesList.get(n);
    }


    /**
     * GET random Word object from path: /word.
     * Make method to create and return Word objects
     */
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWordAndDefinition() {

        // Instantiate 10 new Word objects
        Word word1 = new Word();
        word1.setWord("Serendipity");
        word1.setDefinition("The chance occurrence of events in a beneficial way.");

        Word word2 = new Word();
        word2.setWord("Petrichor");
        word2.setDefinition("The pleasant, earthy smell after rain.");

        Word word3 = new Word();
        word3.setWord("Supine");
        word3.setDefinition("Lying face upwards");

        Word word4 = new Word();
        word4.setWord("Solitude");
        word4.setDefinition("A state of seclusion or isolation.");

        Word word5 = new Word();
        word5.setWord("Aurora");
        word5.setDefinition("The dawn early in the morning");

        Word word6 = new Word();
        word6.setWord("Idyllic");
        word6.setDefinition("Extremely happy, peaceful, or picturesque");

        Word word7 = new Word();
        word7.setWord("Clinomania");
        word7.setDefinition("Excessive desire to stay in bed");

        Word word8 = new Word();
        word8.setWord("Pluviophile");
        word8.setDefinition("A love of rain; someone who finds joy and peace during rainy days");

        Word word9 = new Word();
        word9.setWord("Euphoria");
        word9.setDefinition("A feeling or state of intense excitement and happiness");

        Word word10 = new Word();
        word10.setWord("Sequoia");
        word10.setDefinition("A redwood tree");

        // Add the new Quote objects to a List
        List<Word> wordList = new ArrayList<>();
        wordList.add(word1);
        wordList.add(word2);
        wordList.add(word3);
        wordList.add(word4);
        wordList.add(word5);
        wordList.add(word6);
        wordList.add(word7);
        wordList.add(word8);
        wordList.add(word9);
        wordList.add(word10);

        // Handle randomization logic
        Random rand = new Random();
        int n = rand.nextInt(wordList.size());

        // return a random definition object from wordList
        return wordList.get(n);
    }


    /**
     * POST json object {"question": "yes/no question here"} to path: /magic.
     * Make method to create Answer object.
     * Return the random 8-ball response with user's question in json format.
     * The @Valid annotation tells the Spring framework to run the validation rules
     */
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer createEightBall(@RequestBody @Valid Answer input) {

        // Store 8-ball responses in a string array
        String[] eightBallWisdoms = {
                "Not likely",
                "You SHOULD put all your eggs in that basket",
                "The answer is in the question my friend",
                "Perhaps",
                "YES!!!",
                "That one could go either way."
        };

        // generate random index to pair incoming Q's with A's
        Random rand = new Random();
        int n = rand.nextInt(eightBallWisdoms.length);

        // Use Answer getters/setters to pair Q's & A's for json formatting
        Answer answer = new Answer();
        answer.setQuestion(input.getQuestion());
        answer.setAnswer(eightBallWisdoms[n]);

        return answer;
    }

}
