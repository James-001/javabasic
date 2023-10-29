package com.java.tips.config;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jackson.JsonNodeReader;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import org.springframework.util.ResourceUtils;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sddd {

        public static boolean valid(JsonNode jsonNode, String filePath) throws IOException {

            JsonNode schemaNode = new JsonNodeReader().fromReader(new FileReader((ResourceUtils.getFile(filePath))));


            //return getProcessingReport(jsonNode,schemaNode);
            ProcessingReport report = JsonSchemaFactory.byDefault().getValidator().validateUnchecked(schemaNode, jsonNode,true);
            if (report.isSuccess()) {
                System.out.println("JSON 解析成功");
                return true;
            } else {
                System.out.println("JSON 解析异常");

                return false;
            }
        }

    public static void main(String[] args) {
        Sddd sddd = new Sddd();
        sddd.add();
    }

    public void add() {
        try {
            String dataPath = "C:\\Users\\james\\Desktop\\aproject\\elastic-job\\src\\main\\resources\\jamesData.json";
            JsonNode jsonNode = new JsonNodeReader().fromReader(new FileReader((ResourceUtils.getFile(dataPath))));
            valid(jsonNode, "C:\\Users\\james\\Desktop\\aproject\\elastic-job\\src\\main\\resources\\jamesSchema.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
