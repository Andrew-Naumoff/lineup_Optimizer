package org.example.lineup_optimizer.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.lineup_optimizer.model.Root;

import java.io.IOException;
import java.io.InputStream;

public class DataLoader {
    public static Root loadTeamData() {
        ObjectMapper objectMapper = new ObjectMapper();
        Root root = null;
        try (InputStream inputStream = DataLoader.class.getResourceAsStream("/teamToOptimize.json")) {
            root = objectMapper.readValue(inputStream, Root.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }
}
