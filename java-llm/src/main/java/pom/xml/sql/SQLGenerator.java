package pom.xml.sql;

import io.github.amithkoujalgi.ollama4j.core.OllamaAPI;
import io.github.amithkoujalgi.ollama4j.core.models.OllamaResult;
import io.github.amithkoujalgi.ollama4j.core.utils.OptionsBuilder;
import pom.xml.AppConfig;


public class SQLGenerator {

    private AppConfig appConfig;

    public SQLGenerator(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public String getSQL(String question, String databaseSchema) {
        String sqlQuery = "";
        String ollamaUrl= appConfig.getOllamaUrl();
        
        try {
            OllamaAPI ollamaAPI = new OllamaAPI(ollamaUrl);
            ollamaAPI.setRequestTimeoutSeconds(1000);

            String template = appConfig.getTemplate();
            String prompt = template.replace("<<<question>>>", question);
            prompt = prompt.replace("<<<database_schema>>>", databaseSchema);
            
            OllamaResult result =
                    ollamaAPI.generate(appConfig.getOllamaModel(), prompt,
                        new OptionsBuilder()
                        .build()
                    );

            sqlQuery = result.getResponse();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        return sqlQuery;

    }

}