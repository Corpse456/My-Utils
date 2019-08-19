package workWithFiles.xml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertiesChanger {

    public static void main(String[] args) throws Exception {
        final List<String> listArgs = Arrays.asList(args);
        List<String> inputFiles = getOptionValues("file", listArgs);
        List<String> propertiesList = getOptionValues("property", listArgs);

        final Map<String, String> properties = getPropertiesMap(propertiesList);

        for (final String inputFile : inputFiles) {
            convert(inputFile, properties);
        }
        System.out.println("Done");
    }

    private static List<String> getOptionValues(final String property, final List<String> args) {
        final List<String> list = new ArrayList<>();
        final int propertyIndex = Integer.max(args.indexOf("--" + property), args.indexOf("-" + property.charAt(0)));

        for (int i = propertyIndex + 1; i < args.size() && args.get(i).charAt(0) != '-'; i++) {
            list.add(args.get(i));
        }
        return list;
    }

    private static Map<String, String> getPropertiesMap(final List<String> args) {
        final Map<String, String> properties = new HashMap<>();
        for (final String arg : args) {
            final String[] split = arg.split("=");
            properties.put(split[0], split[1]);
        }
        return properties;
    }

    private static void convert(String xmlName, final Map<String, String> properties) throws Exception {
        final StringBuilder result = new StringBuilder();
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(xmlName)));

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();

            final String property = line.split("=")[0].replaceAll(" ", "").replaceAll("#", "");
            if (properties.containsKey(property)) {
                line = property + "=" + properties.get(property);
            }
            result.append(line).append("\n");
        }
        bufferedReader.close();

        try (final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(xmlName)))) {
            bufferedWriter.write(result.toString());
        }
    }
}
