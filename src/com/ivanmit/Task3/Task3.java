package com.ivanmit.Task3;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String path1 = args[0];
        String path2 = args[1];

        Gson gson = new Gson();

        Tests tests = gson.fromJson(new FileReader(path1), Tests.class);
        Values values = gson.fromJson(new FileReader(path2), Values.class);
        System.out.println();

        FileWriter fileWriter = new FileWriter("C:\\Users\\ivanm\\IdeaProjects\\PerformanceLabTests\\src\\com\\ivanmit\\Task3\\report.json");
        for (Value v: values.values){
            join(tests.tests, v);
        }

        String json = gson.toJson(tests);
        fileWriter.write(json);
        fileWriter.flush();
        fileWriter.close();

    }


    private static void join(List<Test> tests, Value value){
        for (Test t: tests){
            if (t.id == value.id){
                t.value = value.value;
                return;
            }
            join(t.values, value);
        }
    }
}
