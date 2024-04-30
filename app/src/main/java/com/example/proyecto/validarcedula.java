package com.example.proyecto;

public class validarcedula {
    public boolean validarcedula(String cedula) {
        // Verificar si la cadena está vacía
        if (cedula == null || cedula.isEmpty()) {
            return false;
        }

        // Verificar si todos los caracteres son dígitos
        for (int i = 0; i < cedula.length(); i++) {
            if (!Character.isDigit(cedula.charAt(i))) {
                return false;
            }
        }


        return true;
    }
}
