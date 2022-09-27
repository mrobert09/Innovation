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
        filepaths.put("Calendar", "./src/imgs/two/Calendar.jpg");
        filepaths.put("Canal Building", "./src/imgs/two/CanalBuilding.jpg");
        filepaths.put("Construction", "./src/imgs/two/Construction.jpg");
        filepaths.put("Currency", "./src/imgs/two/Currency.jpg");
        filepaths.put("Fermenting", "./src/imgs/two/Fermenting.jpg");
        filepaths.put("Mapmaking", "./src/imgs/two/Mapmaking.jpg");
        filepaths.put("Mathematics", "./src/imgs/two/Mathematics.jpg");
        filepaths.put("Monotheism", "./src/imgs/two/Monotheism.jpg");
        filepaths.put("Philosophy", "./src/imgs/two/Philosophy.jpg");
        filepaths.put("Road Building", "./src/imgs/two/RoadBuilding.jpg");
        filepaths.put("Alchemy", "./src/imgs/three/Alchemy.jpg");
        filepaths.put("Compass", "./src/imgs/three/Compass.jpg");
        filepaths.put("Education", "./src/imgs/three/Education.jpg");
        filepaths.put("Engineering", "./src/imgs/three/Engineering.jpg");
        filepaths.put("Feudalism", "./src/imgs/three/Feudalism.jpg");
        filepaths.put("Machinery", "./src/imgs/three/Machinery.jpg");
        filepaths.put("Medicine", "./src/imgs/three/Medicine.jpg");
        filepaths.put("Optics", "./src/imgs/three/Optics.jpg");
        filepaths.put("Paper", "./src/imgs/three/Paper.jpg");
        filepaths.put("Anatomy", "./src/imgs/four/Anatomy.jpg");
        filepaths.put("Colonialism", "./src/imgs/four/Colonialism.jpg");
        filepaths.put("Enterprise", "./src/imgs/four/Enterprise.jpg");
        filepaths.put("Experimentation", "./src/imgs/four/Experimentation.jpg");
        filepaths.put("Gunpowder", "./src/imgs/four/Gunpowder.jpg");
        filepaths.put("Invention", "./src/imgs/four/Invention.jpg");
        filepaths.put("Navigation", "./src/imgs/four/Navigation.jpg");
        filepaths.put("Perspective", "./src/imgs/four/Perspective.jpg");
        filepaths.put("Printing Press", "./src/imgs/four/PrintingPress.jpg");
        filepaths.put("Reformation", "./src/imgs/four/Reformation.jpg");
        filepaths.put("Astronomy", "./src/imgs/five/Astronomy.jpg");
        filepaths.put("Banking", "./src/imgs/five/Banking.jpg");
        filepaths.put("Chemistry", "./src/imgs/five/Chemistry.jpg");
        filepaths.put("Coal", "./src/imgs/five/Coal.jpg");
        filepaths.put("Measurement", "./src/imgs/five/Measurement.jpg");
        filepaths.put("Physics", "./src/imgs/five/Physics.jpg");
        filepaths.put("Societies", "./src/imgs/five/Societies.jpg");
        filepaths.put("Statistics", "./src/imgs/five/Statistics.jpg");
        filepaths.put("Steam Engine", "./src/imgs/five/SteamEngine.jpg");
        filepaths.put("The Pirate Code", "./src/imgs/five/ThePirateCode.jpg");
        filepaths.put("Atomic Theory", "./src/imgs/six/AtomicTheory.jpg");
        filepaths.put("Canning", "./src/imgs/six/Canning.jpg");
        filepaths.put("Classification", "./src/imgs/six/Classification.jpg");
        filepaths.put("Democracy", "./src/imgs/six/Democracy.jpg");
        filepaths.put("Emancipation", "./src/imgs/six/Emancipation.jpg");
        filepaths.put("Encyclopedia", "./src/imgs/six/Encyclopedia.jpg");
        filepaths.put("Industrialization", "./src/imgs/six/Industrialization.jpg");
        filepaths.put("MachineTools", "./src/imgs/six/MachineTools.jpg");
        filepaths.put("Metric System", "./src/imgs/six/MetricSystem.jpg");
        filepaths.put("Vaccination", "./src/imgs/six/Vaccination.jpg");

    }

    public String getPath(String cardName) {
        return filepaths.get(cardName);
    }
}
