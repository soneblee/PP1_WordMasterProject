package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner s;
    @Override
    public Object add() {
        return null;
    }
    public void AddWord() {
        System.out.print("=> 난이도(1,2,3)& 새 단어 입력 : ");
        System.out.print("뜻 입력 : ");
    }
    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
}
