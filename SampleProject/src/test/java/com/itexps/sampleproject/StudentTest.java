/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.sampleproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manju
 */
public class StudentTest {
    Student stu;
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        stu=new Student();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFirst(){
        stu.setFirst("Tom");
        assertEquals("Tom", stu.getFirst());
    }
    
}
