package com.java;


import java.util.function.Predicate;

public class PredicateExample {

    boolean isNumeric(String number){
        try{
            Integer.parseInt(number.toString());
        }catch (Exception exe){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Predicate<String> p = new PredicateExample()::isNumeric;
        System.out.println(p.test("1000"));
        System.out.println(p.test("123E"));
        System.out.println(p.test("123"));
        System.out.println(p.test("A123E"));
    }

//https://www.softwaretestinghelp.com/java-8-interview-questions/
    //https://www.simplilearn.com/java-8-interview-questions-and-answers-article
    //https://www.javaguides.net/2018/11/java-8-interview-questions-and-answers.html
    //https://java2blog.com/java-8-interview-questions/
    //https://www.interviewbit.com/java-8-interview-questions/#what-is-type-interface

    //https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
    //https://javahungry.blogspot.com/2018/10/java-8-interview-questions-and-answers.html
    //https://www.java67.com/2018/10/java-8-stream-and-functional-programming-interview-questions-answers.html

    //https://mindmajix.com/java-stream-interview-questions
    //https://javarevisited.blogspot.com/2021/05/java-8-stream-lambda-expression-d.html#axzz7qZy7JZlv
    //https://quescol.com/interview-preparation/java-8-coding-interview-question
    //https://careerkaizen.com/java-8-interview-questions
}
