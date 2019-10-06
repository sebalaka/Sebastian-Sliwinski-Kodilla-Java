package com.kodilla.stream.beautifier;

public class PoemBeautifier{
    public void beautify(String text, PoemDecorator textToDecorate) {
        String result = textToDecorate.decorate(text);
        System.out.println(result);
    }
}