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
        Commit commit2 = new Commit("Commit 2", 2);
        Commit commit3 = new Commit("Commit 3", 3);

        System.out.println(commit);
        System.out.println(commit2);
        System.out.println(commit3);
    }
}