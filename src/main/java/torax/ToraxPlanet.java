
package torax;

import mindustry.content.Planets;
import mindustry.type.Planet;
import mindustry.maps.planet.SerpuloPlanetGenerator;
import mindustry.graphics.g3d.HexMesh;

public class ToraxPlanet {

    public static Planet torax;

    public static void load() {
        torax = new Planet("torax", Planets.sun, 1f, 3) {{

            generator = new SerpuloPlanetGenerator();

            meshLoader = () -> new HexMesh(this, 6);

            alwaysUnlocked = true;
            accessible = true;

            atmosphereColor = arc.graphics.Color.valueOf("36bfc1");
            iconColor = arc.graphics.Color.valueOf("36bfc1");

            startSector = 0;
        }};
    }
}
