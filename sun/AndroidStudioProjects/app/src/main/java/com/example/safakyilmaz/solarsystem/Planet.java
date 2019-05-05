package com.example.safakyilmaz.solarsystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by atanaltay on 01/04/2017.
 */

public class Planet implements Serializable{

    private String name;
    private int img;
    private String description;
    private String category;

    public Planet() {
    }

    public Planet(String name, int img, String description, String category) {
        this.name = name;
        this.img = img;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static List<Planet> getAllPlanets(){
        Planet p0 = new Planet("The Sun",R.drawable.sun,"\n" +
                "Size comparison of the Sun and the planets\n" +
                "The Sun is the Solar System's star and by far its most massive component. Its large mass (332,900 Earth masses)[48] produces temperatures and densities in its core high enough to sustain nuclear fusion of hydrogen into helium, making it a main-sequence star.[49] This releases an enormous amount of energy, mostly radiated into space as electromagnetic radiation peaking in visible light.","Star");
        Planet p1 = new Planet("Mercury",R.drawable.mercury,"Mercury (0.4 AU from the Sun) is the closest planet to the Sun and the smallest planet in the Solar System (0.055 Earth masses). Mercury has no natural satellites; besides impact craters, its only known geological features are lobed ridges or rupes that were probably produced by a period of contraction early in its history.[68] Mercury's very tenuous atmosphere consists of atoms blasted off its surface by the solar wind.[69] Its relatively large iron core and thin mantle have not yet been adequately explained. Hypotheses include that its outer layers were stripped off by a giant impact; or, that it was prevented from fully accreting by the young Sun's energy.","Planet");
        Planet p2 = new Planet("Venus",R.drawable.venus,"Venus (0.7 AU from the Sun) is close in size to Earth (0.815 Earth masses) and, like Earth, has a thick silicate mantle around an iron core, a substantial atmosphere, and evidence of internal geological activity. It is much drier than Earth, and its atmosphere is ninety times as dense. Venus has no natural satellites. It is the hottest planet, with surface temperatures over 400 °C (752 °F), most likely due to the amount of greenhouse gases in the atmosphere.[72] No definitive evidence of current geological activity has been detected on Venus, but it has no magnetic field that would prevent depletion of its substantial atmosphere, which suggests that its atmosphere is being replenished by volcanic eruptions","Planet");
        Planet p3 = new Planet("Earth",R.drawable.earth,"Earth (1 AU from the Sun) is the largest and densest of the inner planets, the only one known to have current geological activity, and the only place where life is known to exist.[74] Its liquid hydrosphere is unique among the terrestrial planets, and it is the only planet where plate tectonics has been observed. Earth's atmosphere is radically different from those of the other planets, having been altered by the presence of life to contain 21% free oxygen.[75] It has one natural satellite, the Moon, the only large satellite of a terrestrial planet in the Solar System","Planet");
        Planet p4 = new Planet("Mars",R.drawable.mars,"Mars (1.5 AU from the Sun) is smaller than Earth and Venus (0.107 Earth masses). It has an atmosphere of mostly carbon dioxide with a surface pressure of 6.1 millibars (roughly 0.6% of that of Earth).[76] Its surface, peppered with vast volcanoes, such as Olympus Mons, and rift valleys, such as Valles Marineris, shows geological activity that may have persisted until as recently as 2 million years ago.[77] Its red colour comes from iron oxide (rust) in its soil.[78] Mars has two tiny natural satellites (Deimos and Phobos) thought to be captured asteroids","Planet");
        Planet p5 = new Planet("Asteroid Belt",R.drawable.asteroidbelt,"\n" +
                "The donut-shaped asteroid belt is located between the orbits of Mars and Jupiter.\n" +
                "  Sun\n" +
                "  Jupiter trojans\n" +
                "  Planetary orbit\t  Asteroid belt\n" +
                "  Hilda asteroids\n" +
                "  NEOs (selection)\n" +
                "Asteroids except for the largest, Ceres, are classified as small Solar System bodies[e] and are composed mainly of refractory rocky and metallic minerals, with some ice.[80][81] They range from a few metres to hundreds of kilometres in size. Asteroids smaller than one meter are usually called meteoroids and micrometeoroids (grain-sized), depending on different, somewhat arbitrary definitions.","Asteroids");
        Planet p6 = new Planet("Jupiter",R.drawable.jupyter,"Jupiter (5.2 AU), at 318 Earth masses, is 2.5 times the mass of all the other planets put together. It is composed largely of hydrogen and helium. Jupiter's strong internal heat creates semi-permanent features in its atmosphere, such as cloud bands and the Great Red Spot. Jupiter has 69 known satellites. The four largest, Ganymede, Callisto, Io, and Europa, show similarities to the terrestrial planets, such as volcanism and internal heating.[89] Ganymede, the largest satellite in the Solar System, is larger than Mercury.","Planet");
        Planet p7 = new Planet("Ganymede",R.drawable.ganymede,"\n" +
                "Ganymede\n" +
                "Ganymede g1 true-edit1.jpg\n" +
                "Image of Ganymede's anti-Jovian hemisphere taken by the Galileo orbiter (contrast is enhanced). Lighter surfaces, such as in recent impacts, grooved terrain and the whitish north polar cap at upper right, are enriched in water ice.\n" +
                "Discovery\n" +
                "Discovered by\tGalileo Galilei\n" +
                "Discovery date\tJanuary 7, 1610[1][2]\n" +
                "Designations\n" +
                "Alternative names\n" +
                "Jupiter III\n" +
                "Adjectives\tGanymedian, Ganymedean\n" +
                "Orbital characteristics\n" +
                "Periapsis\t1069200 km[a]\n" +
                "Apoapsis\t1071600 km[b]\n" +
                "Semi-major axis\n" +
                "1070400 km[3]\n" +
                "Eccentricity\t0.0013[3]\n" +
                "Orbital period\n" +
                "7.15455296 d[3]\n" +
                "Average orbital speed\n" +
                "10.880 km/s\n" +
                "Inclination\t2.214° (to the ecliptic)\n" +
                "0.20° (to Jupiter's equator)[3]\n" +
                "Satellite of\tJupiter\n" +
                "Physical characteristics\n" +
                "Mean radius\n" +
                "2634.1±0.3 km (0.413 Earths)[4]\n" +
                "Surface area\n" +
                "8.72×107 km2 (0.171 Earths)[c]\n" +
                "Volume\t7.6×1010 km3 (0.0704 Earths)[d]\n" +
                "Mass\t1.4819×1023 kg (0.025 Earths)[4]\n" +
                "Mean density\n" +
                "1.936 g/cm3[4]\n" +
                "Surface gravity\n" +
                "1.428 m/s2 (0.146 g)[e]\n" +
                "Moment of inertia factor\n" +
                "0.3105±0.0028[4] (estimate)\n" +
                "Escape velocity\n" +
                "2.741 km/s[f]\n" +
                "Rotation period\n" +
                "synchronous\n" +
                "Axial tilt\n" +
                "0–0.33°[5]\n" +
                "Albedo\t0.43±0.02[6]\n" +
                "Surface temp.\tmin\tmean\tmax\n" +
                "K\t70[8]\t110[8]\t152[9]\n" +
                "Apparent magnitude\n" +
                "4.61 (opposition)[6]\n" +
                "4.38 (in 1951)[7]\n" +
                "Atmosphere\n" +
                "Surface pressure\n" +
                "Trace\n" +
                "Composition by volume\tOxygen[10]\n" +
                "Ganymede /ˈɡænɪmiːd/[11] (Jupiter III) is the largest and most massive moon of Jupiter and in the Solar System. The ninth largest object in the Solar System, it is the largest without a substantial atmosphere. It has a diameter of 5,268 km (3,273 mi) and is 8% larger than the planet Mercury, although only 45% as massive","Moon of Jupyter");
        Planet p8 = new Planet("Saturn",R.drawable.saturn,"Saturn (9.5 AU), distinguished by its extensive ring system, has several similarities to Jupiter, such as its atmospheric composition and magnetosphere. Although Saturn has 60% of Jupiter's volume, it is less than a third as massive, at 95 Earth masses. Saturn is the only planet of the Solar System that is less dense than water.[90] The rings of Saturn are made up of small ice and rock particles. Saturn has 62 confirmed satellites composed largely of ice. Two of these, Titan and Enceladus, show signs of geological activity.[91] Titan, the second-largest moon in the Solar System, is larger than Mercury and the only satellite in the Solar System with a substantial atmosphere.","Planet");
        Planet p9 = new Planet("Titan",R.drawable.titan,"Titan is the largest moon of Saturn. It is the only moon known to have a dense atmosphere, and the only object in space other than Earth where clear evidence of stable bodies of surface liquid has been found.","Moon of Saturn");
        Planet p10 = new Planet("Uranus",R.drawable.uranus,"Uranus (19.2 AU), at 14 Earth masses, is the lightest of the outer planets. Uniquely among the planets, it orbits the Sun on its side; its axial tilt is over ninety degrees to the ecliptic. It has a much colder core than the other giant planets and radiates very little heat into space.[92] Uranus has 27 known satellites, the largest ones being Titania, Oberon, Umbriel, Ariel, and Miranda.\n","Planet");
        Planet p11 = new Planet("Neptune",R.drawable.neptune,"Neptune (30.1 AU), though slightly smaller than Uranus, is more massive (equivalent to 17 Earths) and hence more dense. It radiates more internal heat, but not as much as Jupiter or Saturn.[93] Neptune has 14 known satellites. The largest, Triton, is geologically active, with geysers of liquid nitrogen.[94] Triton is the only large satellite with a retrograde orbit. Neptune is accompanied in its orbit by several minor planets, termed Neptune trojans, that are in 1:1 resonance with it.","Planet");
        Planet p12 = new Planet("Pluton",R.drawable.pluto,"The dwarf planet Pluto (39 AU average) is the largest known object in the Kuiper belt. When discovered in 1930, it was considered to be the ninth planet; this changed in 2006 with the adoption of a formal definition of planet. Pluto has a relatively eccentric orbit inclined 17 degrees to the ecliptic plane and ranging from 29.7 AU from the Sun at perihelion (within the orbit of Neptune) to 49.5 AU at aphelion. Pluto has a 3:2 resonance with Neptune, meaning that Pluto orbits twice round the Sun for every three Neptunian orbits. Kuiper belt objects whose orbits share this resonance are called plutinos.[106]","Planet");

        List<Planet> planets = new ArrayList<>();
        planets.add(p0);
        planets.add(p1);
        planets.add(p2);
        planets.add(p3);
        planets.add(p4);
        planets.add(p5);
        planets.add(p6);
        planets.add(p7);
        planets.add(p8);
        planets.add(p9);
        planets.add(p10);
        planets.add(p11);
        planets.add(p12);

        return planets;

    }


}
