package innovation;

import java.util.HashMap;

public class FileCache {
    HashMap<String, String> filepaths = new HashMap<>();

    public FileCache() {
        filepaths.put("Agriculture", "./src/imgs/one/Agriculture.jpg");
        filepaths.put("Archery", "./src/imgs/one/Archery.jpg");
        filepaths.put("City States", "./src/imgs/one/CityStates.jpg");
        filepaths.put("Clothing", "./src/imgs/one/Clothing.jpg");
        filepaths.put("Code of Laws", "./src/imgs/one/CodeofLaws.jpg");
        filepaths.put("Domestication", "./src/imgs/one/Domestication.jpg");
        filepaths.put("Masonry", "./src/imgs/one/Masonry.jpg");
        filepaths.put("Metalworking", "./src/imgs/one/Metalworking.jpg");
        filepaths.put("Mysticism", "./src/imgs/one/Mysticism.jpg");
        filepaths.put("Oars", "./src/imgs/one/Oars.jpg");
        filepaths.put("Pottery", "./src/imgs/one/Pottery.jpg");
        filepaths.put("Sailing", "./src/imgs/one/Sailing.jpg");
        filepaths.put("The Wheel", "./src/imgs/one/TheWheel.jpg");
        filepaths.put("Tools", "./src/imgs/one/Tools.jpg");
        filepaths.put("Writing", "./src/imgs/one/Writing.jpg");
        filepaths.put("Calendar", "./src/imgs/one/Calendar.jpg");
        filepaths.put("Canal Building", "./src/imgs/one/CanalBuilding.jpg");
        filepaths.put("Construction", "./src/imgs/one/Construction.jpg");
        filepaths.put("Currency", "./src/imgs/one/Currency.jpg");
        filepaths.put("Fermenting", "./src/imgs/one/Fermenting.jpg");
        filepaths.put("Mapmaking", "./src/imgs/one/Mapmaking.jpg");
        filepaths.put("Mathematics", "./src/imgs/one/Mathematics.jpg");
        filepaths.put("Monotheism", "./src/imgs/one/Monotheism.jpg");
        filepaths.put("Philosophy", "./src/imgs/one/Philosophy.jpg");
        filepaths.put("Alchemy", "./src/imgs/one/Alchemy.jpg");
        filepaths.put("Compass", "./src/imgs/one/Compass.jpg");
        filepaths.put("Education", "./src/imgs/one/Education.jpg");
        filepaths.put("Engineering", "./src/imgs/one/Engineering.jpg");
        filepaths.put("Feudalism", "./src/imgs/one/Feudalism.jpg");
        filepaths.put("Machinery", "./src/imgs/one/Machinery.jpg");
        filepaths.put("Medicine", "./src/imgs/one/Medicine.jpg");
        filepaths.put("Optics", "./src/imgs/one/Optics.jpg");
        filepaths.put("Paper", "./src/imgs/one/Paper.jpg");
        filepaths.put("Translation", "./src/imgs/one/Translation.jpg");

    }

    public String getPath(String cardName) {
        return filepaths.get(cardName);
    }
}
