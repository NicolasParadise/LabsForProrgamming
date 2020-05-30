package by.bsu.number_letter.sort;

import by.bsu.number_letter.info.Word;

public class SortWord {
    public static void Sort(Word[] word){
        for(int i = 0; i < word.length; i++){
            for (int j= i + 1; j < word.length; j++){
                if((word[i].getNumberSymbol() < word[j].getNumberSymbol()) && (word[i].getNumberSymbol() != 0) && (word[j].getNumberSymbol() != 0)) {
                    String temp = word[i].getWord();
                    word[i].setWord(word[j].getWord());
                    word[j].setWord(temp);
                }
            }
        }

        for (int i = 0; i < word.length; i++){
            if(word[i].getNumberSymbol() != 0){
                System.out.println(word[i].getWord());
            }
        }
    }
}
