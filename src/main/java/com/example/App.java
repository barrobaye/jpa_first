package com.example;

import com.example.dao.PersistenceDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PersistenceDao.createTable();





        PersistenceDao.closeEntityManagerFactory();

    }
}
