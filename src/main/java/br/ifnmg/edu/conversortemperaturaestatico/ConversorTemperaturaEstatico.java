package br.ifnmg.edu.conversortemperaturaestatico;

/**
 * Classe principal do programa, com o método estático main.
 * @author André (@andref03)
 */
public class ConversorTemperaturaEstatico {

    public static void main(String[] args) {

        try {
            System.out.println(">> De Kelvin para Celsius:\t" 
                    + ConversorFormulas.converterKelvinParaCelsius(150.45f));

            System.out.println(">> De Kelvin para Fahrenheit:\t"
                    + ConversorFormulas.converterKelvinParaFahrenheit(210f));

            System.out.println(">> De Celsius para Kelvin:\t"
                    + ConversorFormulas.converterCelsiusParaKelvin(25.8f));

            System.out.println(">> De Celsius para Fahrenheit:\t"
                    + ConversorFormulas.converterCelsiusParaFahrenheit(-273f));

            System.out.println(">> De Fahrenheit para Kelvin:\t"
                    + ConversorFormulas.converterFahrenheitParaKelvin(390.55f));

            System.out.println(">> De Fahrenheit para Celsius:\t"
                    + ConversorFormulas.converterFahrenheitParaCelsius(100f));

            // OS CASOS ABAIXO GERAM EXCEPTIONS

            //<editor-fold defaultstate="collapsed" desc="casosExceptions">
                        
//            System.out.println(">> De Kelvin para Celsius:\t" 
//                    + ConversorFormulas.converterKelvinParaCelsius(-2.5f));
//            
//            System.out.println(">> De Kelvin para Fahrenheit:\t"
//                    + ConversorFormulas.converterKelvinParaFahrenheit(-10f));
//            
//            System.out.println(">> De Celsius para Kelvin:\t"
//                    + ConversorFormulas.converterCelsiusParaKelvin(-300f));
//            
//            System.out.println(">> De Celsius para Fahrenheit:\t"
//                    + ConversorFormulas.converterCelsiusParaFahrenheit(-280.5f));
//            
//            System.out.println(">> De Fahrenheit para Kelvin:\t"
//                    + ConversorFormulas.converterFahrenheitParaKelvin(-500f));
//            
//            System.out.println(">> De Fahrenheit para Celsius:\t"
//                    + ConversorFormulas.converterFahrenheitParaCelsius(-480.75f));

            //</editor-fold>

        } catch (Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
        }

    }
}
