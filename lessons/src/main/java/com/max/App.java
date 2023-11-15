package com.max;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Commit commit = new Commit("Тестируем первый коммит", 1);
        System.out.println(commit);
    }
}