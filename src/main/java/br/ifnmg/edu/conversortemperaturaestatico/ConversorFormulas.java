package br.ifnmg.edu.conversortemperaturaestatico;

/**
 *
 * @author André (@andref03)
 */
public class ConversorFormulas {

    public static float converterKelvinParaCelsius(float tempKelvin) throws Exception {
        if (tempKelvin < 0) {
            throw new Exception(">>> Exception em Kelvin: a temperatura deve ser maior "
                    + "ou igual a 0 K.\n\t>> Valor passado: " + tempKelvin + " K.");
        }
        return tempKelvin - 273;
    }

    public static float converterKelvinParaFahrenheit(float tempKelvin) throws Exception {
        if (tempKelvin < 0) {
            throw new Exception(">>> Exception em Kelvin: a temperatura deve ser maior "
                    + "ou igual a 0 K.\n\t>> Valor passado: " + tempKelvin + " K.");
        }
        return (9 * (tempKelvin - 273f)) / 5 + 32;
    }

    public static float converterCelsiusParaKelvin(float tempCelsius) throws Exception {
        if (tempCelsius < -273) {
            throw new Exception(">>> Exception em Celsius: a temperatura deve ser maior "
                    + "ou igual a -273 ºC.\n\t>> Valor passado: " + tempCelsius + " ºC.");
        }
        return tempCelsius + 273;
    }

    public static float converterCelsiusParaFahrenheit(float tempCelsius) throws Exception {
        if (tempCelsius < -273) {
            throw new Exception(">>> Exception em Celsius: a temperatura deve ser maior "
                    + "ou igual a -273 ºC.\n\t>> Valor passado: " + tempCelsius + " ºC.");
        }
        return (9 * tempCelsius) / 5 + 32;
    }

    public static float converterFahrenheitParaKelvin(float tempFahrenheit) throws Exception {
        if (tempFahrenheit < -459) {
            throw new Exception(">>> Exception em Fahrenheit: a temperatura deve ser maior "
                    + "ou igual a -459 ºF.\n\t>> Valor passado: " + tempFahrenheit + " ºF.");
        }
        return (5 * (tempFahrenheit - 32)) / 9 + 273f;
    }

    public static float converterFahrenheitParaCelsius(float tempFahrenheit) throws Exception {
        if (tempFahrenheit < -459) {
            throw new Exception(">>> Exception em Fahrenheit: a temperatura deve ser maior "
                    + "ou igual a -459 ºF.\n\t>> Valor passado: " + tempFahrenheit + " ºF.");
        }
        return (5 * (tempFahrenheit - 32)) / 9;
    }

}
