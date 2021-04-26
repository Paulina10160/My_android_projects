package com.example.dogapp.connection;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabase implements IDatabase {

    @Override
    public List<String> getDogRaces() {
        List<String> rasyArr = new ArrayList<String>();
        rasyArr.add("Amstaf");
        rasyArr.add("Labrador");
        rasyArr.add("Pekińczyk");
        rasyArr.add("Owczarek niemiecki");
        rasyArr.add("Chow chow");
        rasyArr.add("Chihuahua");
        return rasyArr;
    }
}
