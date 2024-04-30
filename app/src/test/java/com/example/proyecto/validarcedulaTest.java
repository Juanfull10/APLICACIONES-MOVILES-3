package com.example.proyecto;

import static org.junit.Assert.*;

import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;

public class validarcedulaTest {

    private validarcedula mvalidacion;
    private MainActivity mainActivity;

    @Before
    public void setUp(){
        mvalidacion = new validarcedula();

    }

    //valida que lo que se ingrese en el campo de cedula si sea numeros y no letras
    @Test
    public void cedula() {
        assertTrue(mvalidacion.validarcedula("22222222"));
    }

    //error aproposito para probar cedula
    @Test
    public void error(){
        assertFalse(mvalidacion.validarcedula("aaa1111111"));
    }
    //error aproposito para probar vacio
    public void vacio(){
        assertFalse(mvalidacion.validarcedula(""));
    }



}