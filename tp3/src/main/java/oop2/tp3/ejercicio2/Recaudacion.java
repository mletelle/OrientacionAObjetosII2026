package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {

    public static final int NOMBRE_COMPANIA = 1;
    public static final int CIUDAD = 4;
    public static final int PROVINCIA = 5;
    public static final int RONDA = 9;
    public static final int PERMALINK = 0;
    public static final int NUMERO_EMPLEADOS = 2;
    public static final int CATEGORIA = 3;
    public static final int FECHA_FUNDACION = 6;
    public static final int DINERO_RECAUDADO = 7;
    public static final int MONEDA = 8;
    public static final String RUTA = "src/main/resources/data.csv";

    public static List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        List<String[]> csvData = cargarCSV();
        csvData = filtrarPor(options, "company_name", csvData, NOMBRE_COMPANIA);
        csvData = filtrarPor(options, "city", csvData, CIUDAD);
        csvData = filtrarPor(options, "state", csvData, PROVINCIA);
        csvData = filtrarPor(options, "round", csvData, RONDA);
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();
        return mapearRegistros(csvData);
    }

    private static List<String[]> filtrarPor(Map<String, String> options, String key, List<String[]> csvData, int indiceColumna) {
        if (options.containsKey(key)) {
            List<String[]> results = new ArrayList<String[]>();
            for (String[] csvDatum : csvData) {
                if (csvDatum[indiceColumna].equals(options.get(key))) {
                    results.add(csvDatum);
                }
            }
            csvData = results;
        }
        return csvData;
    }

    private static List<Map<String, String>> mapearRegistros(List<String[]> csvData) {
        List<Map<String, String>> output = new ArrayList<>();
        for (String[] csvDatum : csvData) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", csvDatum[PERMALINK]);
            mapped.put("company_name", csvDatum[NOMBRE_COMPANIA]);
            mapped.put("number_employees", csvDatum[NUMERO_EMPLEADOS]);
            mapped.put("category", csvDatum[CATEGORIA]);
            mapped.put("city", csvDatum[CIUDAD]);
            mapped.put("state", csvDatum[PROVINCIA]);
            mapped.put("funded_date", csvDatum[FECHA_FUNDACION]);
            mapped.put("raised_amount", csvDatum[DINERO_RECAUDADO]);
            mapped.put("raised_currency", csvDatum[MONEDA]);
            mapped.put("round", csvDatum[RONDA]);
            output.add(mapped);
        }
        return output;
    }

    private static List<String[]> cargarCSV() throws IOException {
        List<String[]> csvData = new ArrayList<String[]>();
        CSVReader reader = new CSVReader(new FileReader(RUTA));
        //este path se podria insertar por parametro?
        String[] row = null;
        while ((row = reader.readNext()) != null) {//exception?
            csvData.add(row);
        }
        reader.close();
        csvData.remove(PERMALINK);
        return csvData;
    }
}
