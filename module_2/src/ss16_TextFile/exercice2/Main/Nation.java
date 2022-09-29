package ss16_TextFile.exercice2.Main;

import ss16_TextFile.exercice2.Model.World;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Nation {
    public static void main(String[] args) throws IOException {
        File file = new File("module_2/src/ss16_TextFile/exercice2/data/Nation.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String display;
        List<World> worldList = new ArrayList<>();
        String[] info;
        World world;
        while ((display = bufferedReader.readLine()) !=null){
            info = display.split(",");
            world = new World(Integer.parseInt(info[0]),info[1],info[2]);
            worldList.add(world);
        }
        bufferedReader.close();
        for (World w : worldList){
            System.out.println(w);
        }
    }

}