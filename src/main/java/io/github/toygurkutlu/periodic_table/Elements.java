package io.github.toygurkutlu.periodic_table;

import io.github.toygurkutlu.periodic_table.domain.Keys;
import io.github.toygurkutlu.periodic_table.records.*;;

import java.util.List;

public enum Elements {
    HYDROGEN(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.HYDROGEN, "H", 1, 1.0080,
                                          120, 1, 1, Keys.ElementProperties.NON_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                                List.of("+1", "-1"),
                                                1, "s-block",
                                                "<html>1s<sup><small>1</small></sup></html>",
                                                2.2, 0.754, 13.598))
                     .physical(new PhysicalData("13.81", "20.28", 14.418,
                                                14303.571, 0.00008988))
                     .metadata(new Metadata(1766, "Henry Cavendish", "12385-13-6",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Hydrogen",
                                            "https://en.wikipedia.org/wiki/Hydrogen"))
                     .build()),
    HELIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.HELIUM, "He", 2, 4.00260,
                                        140, 18, 1, Keys.ElementProperties.NOBLE_GAS))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                              List.of("0"),
                                              1, "s-block",
                                              "<html>1s<sup><small>2</small></sup></html>",
                                              null, 0.0, 24.587))
                   .physical(new PhysicalData("0.95", "4.22", 20.78,
                                              5191.625, 0.0001785))
                   .metadata(new Metadata(1868, "Joseph Norman Lockyer", "7440-59-7",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Helium",
                                          "https://en.wikipedia.org/wiki/Helium"))
                   .build()),
    LITHIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.LITHIUM, "Li", 3, 7.0, 182,
                                         1, 2, Keys.ElementProperties.ALKALI_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+1"), 2, "s-block",
                                               "<html>[He]2s<sup><small>1</small></sup></html>",
                                               0.98, 0.618, 5.392))
                    .physical(new PhysicalData("453.65", "1615", 24.86,
                                               3582.133, 0.534))
                    .metadata(new Metadata(1817, "Johan August Arfwedson", "7439-93-2",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Lithium",
                                           "https://en.wikipedia.org/wiki/Lithium"))
                    .build()),
    BERYLLIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.BERYLLIUM, "Be", 4, 9.012183,
                                           153, 2, 2,
                                           Keys.ElementProperties.ALKALINE_EARTH_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+2"), 2, "s-block",
                                                 "<html>[He]2s<sup><small>2</small></sup></html>",
                                                 1.57, 0.0, 9.323))
                      .physical(new PhysicalData("1560", "2744", 16.443,
                                                 1824.527, 1.85))
                      .metadata(new Metadata(1798, "Nicholas-Louis Vauquelin", "7440-41-7",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Beryllium",
                                             "https://en.wikipedia.org/wiki/Beryllium"))
                      .build()),
    BORON(new ElementBuilder()
                  .basic(new BasicData(Keys.Elements.BORON, "B", 5, 10.81, 192,
                                       13, 2, Keys.ElementProperties.METALLOID))
                  .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                             List.of("+3"), 2, "p-block",
                                             "<html>[He]2s<sup><small>2</small></sup>2p<sup><small>1</small></sup></html>",
                                             2.04, 0.277, 8.298))
                  .physical(new PhysicalData("2348", "4273", 11.087,
                                             1025.624, 2.37))
                  .metadata(new Metadata(1808, "Louis-Joseph Gay-Lussac and Louis-Jacques Thenard",
                                         "7440-42-8",
                                         "https://pubchem.ncbi.nlm.nih.gov/element/Boron",
                                         "https://en.wikipedia.org/wiki/Boron"))
                  .build()),
    CARBON(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.CARBON, "C", 6, 12.011, 170,
                                        14, 2, Keys.ElementProperties.NON_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+4", "+2", "-4"), 2, "p-block",
                                              "<html>[He]2s<sup><small>2</small></sup>2p<sup><small>2</small></sup></html>",
                                              2.55, 1.263, 11.26))
                   .physical(new PhysicalData("3823", "4098", 8.517,
                                              709.1, 2.2670))
                   .metadata(new Metadata(0, "Egyptians and Sumerians", "7440-44-0",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Carbon",
                                          "https://en.wikipedia.org/wiki/Carbon"))
                   .build()),
    NITROGEN(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.NITROGEN, "N", 7, 14.007,
                                          155, 15, 2, Keys.ElementProperties.NON_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                                List.of("+5", "+4", "+3", "+2", "+1", "-1", "-2", "-3"),
                                                2, "p-block",
                                                "<html>[He]2s<sup><small>2</small></sup>2p<sup><small>3</small></sup></html>",
                                                3.04, 0.0, 14.534))
                     .physical(new PhysicalData("63.15", "77.36", 14.562,
                                                1039.623, 0.0012506))
                     .metadata(new Metadata(1772, "Daniel Rutherford", "17778-88-0",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Nitrogen",
                                            "https://en.wikipedia.org/wiki/Nitrogen"))
                     .build()),
    OXYGEN(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.OXYGEN, "O", 8, 15.999, 152,
                                        16, 2, Keys.ElementProperties.NON_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                              List.of("-2"),
                                              2, "p-block",
                                              "<html>[He]2s<sup><small>2</small></sup>2p<sup><small>4</small></sup></html>",
                                              3.44, 1.461, 13.618))
                   .physical(new PhysicalData("54.36", "90.2", 14.689,
                                              918.12, 0.001429))
                   .metadata(new Metadata(1774, "Joseph Priestley", "7782-44-7",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Oxygen",
                                          "https://en.wikipedia.org/wiki/Oxygen"))
                   .build()),
    FLUORINE(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.FLUORINE, "F", 9, 18.99840316,
                                          135, 17, 2, Keys.ElementProperties.HALOGEN))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                                List.of("-1"), 2, "p-block",
                                                "<html>[He]2s<sup><small>2</small></sup>2p<sup><small>5</small></sup></html>",
                                                3.98, 3.339, 17.423))
                     .physical(new PhysicalData("53.53", "85.03", 15.652,
                                                823.876, 0.001696))
                     .metadata(new Metadata(1670, "Schwandhard", "7782-41-4",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Fluorine",
                                            "https://en.wikipedia.org/wiki/Fluorine"))
                     .build()),
    NEON(new ElementBuilder()
                 .basic(new BasicData(Keys.Elements.NEON, "Ne", 10, 20.180, 154,
                                      18, 2, Keys.ElementProperties.NOBLE_GAS))
                 .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                            List.of("0"), 2, "p-block",
                                            "<html>[He]2s<sup><small>2</small></sup>2p<sup><small>6</small></sup></html>",
                                            null, 0.0, 21.565))
                 .physical(new PhysicalData("24.56", "27.07", 20.79,
                                            1030.228, 0.0008999))
                 .metadata(new Metadata(1898, "William Ramsay and Morris William Travers", "7440-01-9",
                                        "https://pubchem.ncbi.nlm.nih.gov/element/Neon",
                                        "https://en.wikipedia.org/wiki/Neon"))
                 .build()),
    SODIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.SODIUM, "Na", 11, 22.9897693,
                                        227, 1, 3, Keys.ElementProperties.ALKALI_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+1"), 3, "s-block",
                                              "<html>[Ne]3s<sup><small>1</small></sup></html>",
                                              0.93, 0.548, 5.139))
                   .physical(new PhysicalData("370.95", "1156", 28.23,
                                              1227.925, 0.9688))
                   .metadata(new Metadata(1807, "Humphry Davy", "7440-23-5",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Sodium",
                                          "https://en.wikipedia.org/wiki/Sodium"))
                   .build()),
    MAGNESIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.MAGNESIUM, "Mg", 12, 24.305,
                                           173, 2, 3,
                                           Keys.ElementProperties.ALKALINE_EARTH_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+2"), 3, "s-block",
                                                 "<html>[Ne]3s<sup><small>2</small></sup></html>",
                                                 1.31, 0.0, 7.646))
                      .physical(new PhysicalData("923", "1363", 24.869,
                                                 1023.205, 1.737))
                      .metadata(new Metadata(1808, "Humphry Davy", "7439-95-4",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Magnesium",
                                             "https://en.wikipedia.org/wiki/Magnesium"))
                      .build()),
    ALUMINIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.ALUMINIUM, "Al", 13, 26.981538,
                                           184, 13, 3,
                                           Keys.ElementProperties.POST_TRANSITION_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+3"), 3, "p-block",
                                                 "<html>[Ne]3s<sup><small>2</small></sup>3p<sup><small>1</small></sup></html>",
                                                 1.61, 0.441, 5.986))
                      .physical(new PhysicalData("933.437", "2792", 24.2,
                                                 896.894, 2.699))
                      .metadata(new Metadata(0, "Greeks and Romans", "7429-90-5",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/13",
                                             "https://en.wikipedia.org/wiki/Aluminium"))
                      .build()),
    SILICON(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.SILICON, "Si", 14, 28.085,
                                         210, 14, 3, Keys.ElementProperties.METALLOID))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+4", "+2", "-4"), 3, "p-block",
                                               "<html>[Ne]3s<sup><small>2</small></sup>3p<sup><small>2</small></sup></html>",
                                               1.9, 1.385, 8.152))
                    .physical(new PhysicalData("1687", "3538", 19.789,
                                               704.611, 2.3296))
                    .metadata(new Metadata(1854, "Henri Sainte-Claire Deville", "7440-21-3",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Silicon",
                                           "https://en.wikipedia.org/wiki/Silicon"))
                    .build()),
    PHOSPHORUS(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.PHOSPHORUS, "P", 15, 30.97376200,
                                            180, 15, 3, Keys.ElementProperties.NON_METAL))
                       .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                  List.of("+5", "+3", "-3"), 3, "p-block",
                                                  "<html>[Ne]3s<sup><small>2</small></sup>3p<sup><small>3</small></sup></html>",
                                                  2.19, 0.746, 10.487))
                       .physical(new PhysicalData("317.3", "553.65", 23.824,
                                                  769.161, 1.82))
                       .metadata(new Metadata(1669, "Hennig Brand", "12185-10-3",
                                              "https://pubchem.ncbi.nlm.nih.gov/element/Phosphorus",
                                              "https://en.wikipedia.org/wiki/Phosphorus"))
                       .build()),
    SULFUR(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.SULFUR, "S", 16, 32.07, 180,
                                        16, 3, Keys.ElementProperties.NON_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+6", "+4", "-2"), 3, "p-block",
                                              "<html>[Ne]3s<sup><small>2</small></sup>3p<sup><small>4</small></sup></html>",
                                              2.58, 2.077, 10.36))
                   .physical(new PhysicalData("388.36", "717.75", 22.75,
                                              709.607, 2.067))
                   .metadata(new Metadata(0, null, "7704-34-9",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Sulfur",
                                          "https://en.wikipedia.org/wiki/Sulfur"))
                   .build()),
    CHLORINE(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.CHLORINE, "Cl", 17, 35.45,
                                          175, 17, 3, Keys.ElementProperties.HALOGEN))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                                List.of("+7", "+5", "+1", "-1"), 3, "p-block",
                                                "<html>[Ne]3s<sup><small>2</small></sup>3p<sup><small>5</small></sup></html>",
                                                3.16, 3.617, 12.968))
                     .physical(new PhysicalData("171.65", "239.11", 16.9745,
                                                478.829, 0.003214))
                     .metadata(new Metadata(1774, "Carl-Wilhelm Scheele", "7782-50-5",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Chlorine",
                                            "https://en.wikipedia.org/wiki/Chlorine"))
                     .build()),
    ARGON(new ElementBuilder()
                  .basic(new BasicData(Keys.Elements.ARGON, "Ar", 18, 39.9, 188,
                                       18, 3, Keys.ElementProperties.NOBLE_GAS))
                  .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                             List.of("0"), 3, "p-block",
                                             "<html>[Ne]3s<sup><small>2</small></sup>3p<sup><small>6</small></sup></html>",
                                             null, 0.0, 15.76))
                  .physical(new PhysicalData("83.8", "87.3", 20.85,
                                             521.902, 0.0017837))
                  .metadata(new Metadata(1894, "William Ramsay and Robert John Strutt (Lord Rayleigh)",
                                         "7440-37-1", "https://pubchem.ncbi.nlm.nih.gov/element/Argon",
                                         "https://en.wikipedia.org/wiki/Argon"))
                  .build()),
    POTASSIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.POTASSIUM, "K", 19, 39.0983,
                                           275, 1, 4, Keys.ElementProperties.ALKALI_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+1"), 4, "s-block",
                                                 "<html>[Ar]4s<sup><small>1</small></sup></html>",
                                                 0.82, 0.501, 4.341))
                      .physical(new PhysicalData("336.53", "1032", 29.6,
                                                 757.072, 0.89))
                      .metadata(new Metadata(1807, "Humphry Davy", "7440-09-7",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Potassium",
                                             "https://en.wikipedia.org/wiki/Potassium"))
                      .build()),
    CALCIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.CALCIUM, "Ca", 20, 40.08, 231,
                                         2, 4, Keys.ElementProperties.ALKALINE_EARTH_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+2"), 4, "s-block",
                                               "<html>[Ar]4s<sup><small>2</small></sup></html>",
                                               1.0, 0.0, 6.113))
                    .physical(new PhysicalData("1115", "1757", 25.929,
                                               646.963, 1.54))
                    .metadata(new Metadata(0, "Romans", "7440-70-2",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Calcium",
                                           "https://en.wikipedia.org/wiki/Calcium"))
                    .build()),
    SCANDIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.SCANDIUM, "Sc", 21, 44.95591,
                                          211, 3, 4, Keys.ElementProperties.TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+3"), 4, "d-block",
                                                "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>1</small></sup></html>",
                                                1.36, 0.188, 6.561))
                     .physical(new PhysicalData("1814", "3109", 25.52,
                                                567.666, 2.99))
                     .metadata(new Metadata(1879, "Lars Fredrik Nilson", "7440-20-2",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Scandium",
                                            "https://en.wikipedia.org/wiki/Scandium"))
                     .build()),
    TITANIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.TITANIUM, "Ti", 22, 47.867,
                                          187, 4, 4, Keys.ElementProperties.TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+4", "+3", "+2"), 4, "d-block",
                                                "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>2</small></sup></html>",
                                                1.54, 0.079, 6.828))
                     .physical(new PhysicalData("1941", "3560", 25.06,
                                                523.534, 4.5))
                     .metadata(new Metadata(1791, "William Gregor", "7440-32-6",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Titanium",
                                            "https://en.wikipedia.org/wiki/Titanium"))
                     .build()),
    VANADIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.VANADIUM, "V", 23, 50.9415,
                                          179, 5, 4, Keys.ElementProperties.TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+5", "+4", "+3", "+2"), 4, "d-block",
                                                "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>3</small></sup></html>",
                                                1.63, 0.525, 6.746))
                     .physical(new PhysicalData("2183", "3680", 24.89,
                                                488.595, 6.0))
                     .metadata(new Metadata(1801, "Andres Manuel del Rio y Fernandez", "7440-62-2",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Vanadium",
                                            "https://en.wikipedia.org/wiki/Vanadium"))
                     .build()),
    CHROMIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.CHROMIUM, "Cr", 24, 51.996,
                                          189, 6, 4, Keys.ElementProperties.TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+6", "+3", "+2"), 4, "d-block",
                                                "<html>[Ar]3d<sup><small>5</small></sup>4s<sup><small>1</small></sup></html>",
                                                1.66, 0.666, 6.767))
                     .physical(new PhysicalData("2180", "2944", 23.35,
                                                449.073, 7.15))
                     .metadata(new Metadata(1797, "Nicolas-Louis Vauquelin", "7440-47-3",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Chromium",
                                            "https://en.wikipedia.org/wiki/Chromium"))
                     .build()),
    MANGANESE(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.MANGANESE, "Mn", 25, 54.93804,
                                           197, 7, 4, Keys.ElementProperties.TRANSITION_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+7", "+4", "+3", "+2"), 4, "d-block",
                                                 "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>5</small></sup></html>",
                                                 1.55, 0.0, 7.434))
                      .physical(new PhysicalData("1519", "2334", 26.32,
                                                 479.086, 7.3))
                      .metadata(new Metadata(1774, "Carl-Wilhelm Scheele", "7439-96-5",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Manganese",
                                             "https://en.wikipedia.org/wiki/Manganese"))
                      .build()),
    IRON(new ElementBuilder()
                 .basic(new BasicData(Keys.Elements.IRON, "Fe", 26, 55.84, 194,
                                      8, 4, Keys.ElementProperties.TRANSITION_METAL))
                 .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                            List.of("+3", "+2"), 4, "d-block",
                                            "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>6</small></sup></html>",
                                            1.83, 0.163, 7.902))
                 .physical(new PhysicalData("1811", "3134", 25.1,
                                            449.458, 7.874))
                 .metadata(new Metadata(0, null, "7439-89-6",
                                        "https://pubchem.ncbi.nlm.nih.gov/element/Iron",
                                        "https://en.wikipedia.org/wiki/Iron"))
                 .build()),
    COBALT(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.COBALT, "Co", 27, 58.93319, 192,
                                        9, 4, Keys.ElementProperties.TRANSITION_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+3", "+2"), 4, "d-block",
                                              "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>7</small></sup></html>",
                                              1.88, 0.661, 7.881))
                   .physical(new PhysicalData("1768", "3200", 24.81,
                                              420.987, 8.86))
                   .metadata(new Metadata(1735, "Georg Brandt", "7440-48-4",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Cobalt",
                                          "https://en.wikipedia.org/wiki/Cobalt"))
                   .build()),
    NICKEL(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.NICKEL, "Ni", 28, 58.693, 163,
                                        10, 4, Keys.ElementProperties.TRANSITION_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+3", "+2"), 4, "d-block",
                                              "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>8</small></sup></html>",
                                              1.91, 1.156, 7.64))
                   .physical(new PhysicalData("1728", "3186", 26.07,
                                              444.176, 8.912))
                   .metadata(new Metadata(1751, "Axel-Frederik Cronstedt", "7440-02-0",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Nickel",
                                          "https://en.wikipedia.org/wiki/Nickel"))
                   .build()),
    COPPER(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.COPPER, "Cu", 29, 63.55, 140,
                                        11, 4, Keys.ElementProperties.TRANSITION_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+2", "+1"), 4, "d-block",
                                              "<html>[Ar]4s<sup><small>1</small></sup>3d<sup><small>10</small></sup></html>",
                                              1.9, 1.228, 7.726))
                   .physical(new PhysicalData("1357.77", "2835", 24.44,
                                              384.603, 8.933))
                   .metadata(new Metadata(0, "Romans", "7440-50-8",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Copper",
                                          "https://en.wikipedia.org/wiki/Copper"))
                   .build()),
    ZINC(new ElementBuilder()
                 .basic(new BasicData(Keys.Elements.ZINC, "Zn", 30, 65.4, 139,
                                      12, 4, Keys.ElementProperties.TRANSITION_METAL))
                 .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                            List.of("+2"), 4, "d-block",
                                            "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>10</small></sup></html>",
                                            1.65, 0.0, 9.394))
                 .physical(new PhysicalData("692.68", "1180", 25.47,
                                            389.569, 7.134))
                 .metadata(new Metadata(0, "Indian metallurgists", "7440-66-6",
                                        "https://pubchem.ncbi.nlm.nih.gov/element/Zinc",
                                        "https://en.wikipedia.org/wiki/Zinc"))
                 .build()),
    GALLIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.GALLIUM, "Ga", 31, 69.723, 187,
                                         13, 4, Keys.ElementProperties.POST_TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+3"), 4, "p-block",
                                               "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>10</small></sup>4p<sup><small>1</small></sup></html>",
                                               1.81, 0.3, 5.999))
                    .physical(new PhysicalData("302.91", "2477", 25.86,
                                               370.896, 5.91))
                    .metadata(new Metadata(1875, "Paul-Emile Lecoq de Boisbaudran", "7440-55-3",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Gallium",
                                           "https://en.wikipedia.org/wiki/Gallium"))
                    .build()),
    GERMANIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.GERMANIUM, "Ge", 32, 72.63,
                                           211, 14, 4, Keys.ElementProperties.METALLOID))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+4", "+2"), 4, "p-block",
                                                 "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>10</small></sup>4p<sup><small>2</small></sup></html>",
                                                 2.01, 1.35, 7.9))
                      .physical(new PhysicalData("1211.4", "3106", 23.222,
                                                 319.73, 5.323))
                      .metadata(new Metadata(1886, "Clemens-Alexander Winkler", "7440-56-4",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Germanium",
                                             "https://en.wikipedia.org/wiki/Germanium"))
                      .build()),
    ARSENIC(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.ARSENIC, "As", 33, 74.92159,
                                         185, 15, 4, Keys.ElementProperties.METALLOID))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+5", "+3", "-3"), 4, "p-block",
                                               "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>10</small></sup>4p<sup><small>3</small></sup></html>",
                                               2.18, 0.81, 9.815))
                    .physical(new PhysicalData("1090", "887", 24.64,
                                               328.875, 5.776))
                    .metadata(new Metadata(0, "Arabic alchemists", "7440-38-2",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Arsenic",
                                           "https://en.wikipedia.org/wiki/Arsenic"))
                    .build()),
    SELENIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.SELENIUM, "Se", 34, 78.97,
                                          190, 16, 4, Keys.ElementProperties.NON_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+6", "+4", "-2"), 4, "p-block",
                                                "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>10</small></sup>4p<sup><small>4</small></sup></html>",
                                                2.55, 2.021, 9.752))
                     .physical(new PhysicalData("493.65", "958", 25.363,
                                                321.169, 4.809))
                     .metadata(new Metadata(1817, "Jöns Jacob Berzelius", "7782-49-2",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Selenium",
                                            "https://en.wikipedia.org/wiki/Selenium"))
                     .build()),
    BROMINE(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.BROMINE, "Br", 35, 79.90,
                                         183, 17, 4, Keys.ElementProperties.HALOGEN))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.LIQUID,
                                               List.of("+5", "+1", "-1"), 4, "p-block",
                                               "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>10</small></sup>4p<sup><small>5</small></sup></html>",
                                               2.96, 3.365, 11.814))
                    .physical(new PhysicalData("265.95", "331.95", 37.845,
                                               473.631, 3.11))
                    .metadata(new Metadata(1826, "Antoine-Jérôme Balard", "7726-95-6",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Bromine",
                                           "https://en.wikipedia.org/wiki/Bromine"))
                    .build()),
    KRYPTON(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.KRYPTON, "Kr", 36, 83.80,
                                         202, 18, 4, Keys.ElementProperties.NOBLE_GAS))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                               List.of("0"), 4, "p-block",
                                               "<html>[Ar]4s<sup><small>2</small></sup>3d<sup><small>10</small></sup>4p<sup><small>6</small></sup></html>",
                                               3.0, 0.0, 14.0))
                    .physical(new PhysicalData("115.79", "119.93", 20.95,
                                               250.006, 0.003733))
                    .metadata(new Metadata(1898, "Morris William Travers", "7439-90-9",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Krypton",
                                           "https://en.wikipedia.org/wiki/Krypton"))
                    .build()),
    RUBIDIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.RUBIDIUM, "Rb", 37, 85.468,
                                          303, 1, 5, Keys.ElementProperties.ALKALI_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+1"), 5, "s-block",
                                                "<html>[Kr]5s<sup><small>1</small></sup></html>",
                                                0.82, 0.468, 4.177))
                     .physical(new PhysicalData("312.46", "961", 31.06,
                                                363.411, 1.53))
                     .metadata(new Metadata(1861, "Robert Wilhelm Bunsen and Gustav-Robert Kirchoff",
                                            "7440-17-7", "https://pubchem.ncbi.nlm.nih.gov/element/Rubidium",
                                            "https://en.wikipedia.org/wiki/Rubidium"))
                     .build()),
    STRONTIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.STRONTIUM, "Sr", 38, 87.62, 249,
                                           2, 5, Keys.ElementProperties.ALKALINE_EARTH_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+2"), 5, "s-block",
                                                 "<html>[Kr]5s<sup><small>2</small></sup></html>",
                                                 0.95, 0.0, 5.695))
                      .physical(new PhysicalData("1050", "1655", 26.4,
                                                 301.301, 2.64))
                      .metadata(new Metadata(1790, "Adair Crawford", "7440-24-6",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Strontium",
                                             "https://en.wikipedia.org/wiki/Strontium"))
                      .build()),
    YTTRIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.YTTRIUM, "Y", 39, 88.90584, 219,
                                         3, 5, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+3"), 5, "d-block",
                                               "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>1</small></sup></html>",
                                               1.22, 0.307, 6.217))
                    .physical(new PhysicalData("1795", "3618", 26.53,
                                               298.405, 4.47))
                    .metadata(new Metadata(1794, "Johan Gadolin", "7440-65-5",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Yttrium",
                                           "https://en.wikipedia.org/wiki/Yttrium"))
                    .build()),
    ZIRCONIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.ZIRCONIUM, "Zr", 40, 91.22,
                                           186, 4, 5, Keys.ElementProperties.TRANSITION_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+4"), 5, "d-block",
                                                 "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>2</small></sup></html>",
                                                 1.33, 0.426, 6.634))
                      .physical(new PhysicalData("2128", "4682", 25.36,
                                                 277.997, 6.52))
                      .metadata(new Metadata(1789, "Martin-Heinrich Klaproth", "7440-67-7",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Zirconium",
                                             "https://en.wikipedia.org/wiki/Zirconium"))
                      .build()),
    NIOBIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.NIOBIUM, "Nb", 41, 92.90637,
                                         207, 5, 5, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+5", "+3"), 5, "d-block",
                                               "<html>[Kr]5s<sup><small>1</small></sup>4d<sup><small>4</small></sup></html>",
                                               1.6, 0.893, 6.759))
                    .physical(new PhysicalData("2750", "5017", 24.6,
                                               264.784, 8.57))
                    .metadata(new Metadata(1801, "Charles Hatchett", "7440-03-1",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Niobium",
                                           "https://en.wikipedia.org/wiki/Niobium"))
                    .build()),
    MOLYBDENUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.MOLYBDENUM, "Mo", 42, 95.95,
                                            209, 6, 5, Keys.ElementProperties.TRANSITION_METAL))
                       .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                  List.of("+6"), 5, "d-block",
                                                  "<html>[Kr]5s<sup><small>1</small></sup>4d<sup><small>5</small></sup></html>",
                                                  2.16, 0.746, 7.092))
                       .physical(new PhysicalData("2896", "4912", 24.06,
                                                  250.756, 10.2))
                       .metadata(new Metadata(1778, "Carl Wilhelm Scheele", "7439-98-7",
                                              "https://pubchem.ncbi.nlm.nih.gov/element/Molybdenum",
                                              "https://en.wikipedia.org/wiki/Molybdenum"))
                       .build()),
    TECHNETIUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.TECHNETIUM, "Tc", 43, 96.90636,
                                            209, 7, 5, Keys.ElementProperties.TRANSITION_METAL))
                       .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                  List.of("+7", "+6", "+4"), 5, "d-block",
                                                  "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>5</small></sup></html>",
                                                  1.9, 0.55, 7.28))
                       .physical(new PhysicalData("2430", "4538", 24.27,
                                                  null, 11.0))
                       .metadata(new Metadata(1937, "Carlo Perrier and Emilio Segrè", "7440-26-8",
                                              "https://pubchem.ncbi.nlm.nih.gov/element/Technetium",
                                              "https://en.wikipedia.org/wiki/Technetium"))
                       .build()),
    RUTHENIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.RUTHENIUM, "Ru", 44, 101.1,
                                           207, 8, 5, Keys.ElementProperties.TRANSITION_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+3"), 5, "d-block",
                                                 "<html>[Kr]5s<sup><small>1</small></sup>4d<sup><small>7</small></sup></html>",
                                                 2.2, 1.05, 7.361))
                      .physical(new PhysicalData("2607", "4423", 24.06,
                                                 238.053, 12.1))
                      .metadata(new Metadata(1827, "Gottfried Wilhelm Osann", "7440-18-8",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Ruthenium",
                                             "https://en.wikipedia.org/wiki/Ruthenium"))
                      .build()),
    RHODIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.RHODIUM, "Rh", 45, 102.9055,
                                         195, 9, 5, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+3"), 5, "d-block",
                                               "<html>[Kr]5s<sup><small>1</small></sup>4d<sup><small>8</small></sup></html>",
                                               2.28, 1.137, 7.459))
                    .physical(new PhysicalData("2237", "3968", 24.98,
                                               242.736, 12.4))
                    .metadata(new Metadata(1803, "William Hyde Wollaston", "7440-16-6",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Rhodium",
                                           "https://en.wikipedia.org/wiki/Rhodium"))
                    .build()),
    PALLADIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.PALLADIUM, "Pd", 46, 106.42,
                                           202, 10, 5, Keys.ElementProperties.TRANSITION_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+3", "+2"), 5, "d-block",
                                                 "<html>[Kr]4d<sup><small>10</small></sup></html>",
                                                 2.2, 0.557, 8.337))
                      .physical(new PhysicalData("1828.05", "3236", 25.98,
                                                 244.127, 12.0))
                      .metadata(new Metadata(1803, "William Hyde Wollaston", "7440-05-3",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Palladium",
                                             "https://en.wikipedia.org/wiki/Palladium"))
                      .build()),
    SILVER(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.SILVER, "Ag", 47, 107.868,
                                        172, 11, 5, Keys.ElementProperties.TRANSITION_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+1"), 5, "d-block",
                                              "<html>[Kr]5s<sup><small>1</small></sup>4d<sup><small>10</small></sup></html>",
                                              1.93, 1.302, 7.576))
                   .physical(new PhysicalData("1234.93", "2435", 25.35,
                                              235.005, 10.501))
                   .metadata(new Metadata(0, null, "7440-22-4",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Silver",
                                          "https://en.wikipedia.org/wiki/Silver"))
                   .build()),
    CADMIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.CADMIUM, "Cd", 48, 112.41, 158,
                                         12, 5, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+2"), 5, "d-block",
                                               "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>10</small></sup></html>",
                                               1.69, 0.0, 8.994))
                    .physical(new PhysicalData("594.22", "1040", 26.02,
                                               231.474, 8.69))
                    .metadata(new Metadata(1817, "Friedrich Stromeyer", "7440-43-9",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Cadmium",
                                           "https://en.wikipedia.org/wiki/Cadmium"))
                    .build()),
    INDIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.INDIUM, "In", 49, 114.818,
                                        193, 13, 5, Keys.ElementProperties.POST_TRANSITION_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+3"), 5, "p-block",
                                              "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>10</small></sup>5p<sup><small>1</small></sup></html>",
                                              1.78, 0.3, 5.786))
                   .physical(new PhysicalData("429.75", "2345", 26.74,
                                              232.886, 7.31))
                   .metadata(new Metadata(1863, "Ferdinand Reich and Hieronymus Theodor Richter",
                                          "7440-74-6", "https://pubchem.ncbi.nlm.nih.gov/element/Indium",
                                          "https://en.wikipedia.org/wiki/Indium"))
                   .build()),
    TIN(new ElementBuilder()
                .basic(new BasicData(Keys.Elements.TIN, "Sn", 50, 118.71, 217,
                                     14, 5, Keys.ElementProperties.POST_TRANSITION_METAL))
                .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                           List.of("+4", "+2"), 5, "p-block",
                                           "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>10</small></sup>5p<sup><small>2</small></sup></html>",
                                           1.96, 1.2, 7.344))
                .physical(new PhysicalData("505.08", "2875", 27.112,
                                           228.389, 7.287))
                .metadata(new Metadata(0, null, "7440-31-5",
                                       "https://pubchem.ncbi.nlm.nih.gov/element/Tin",
                                       "https://en.wikipedia.org/wiki/Tin"))
                .build()),
    ANTIMONY(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.ANTIMONY, "Sb", 51, 121.760,
                                          206, 15, 5, Keys.ElementProperties.METALLOID))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+5", "+3", "-3"), 5, "p-block",
                                                "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>10</small></sup>5p<sup><small>3</small></sup></html>",
                                                2.05, 1.07, 8.64))
                     .physical(new PhysicalData("903.78", "1860", 25.23,
                                                207.211, 6.685))
                     .metadata(new Metadata(0, "Arabic alchemists", "7440-36-0",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Antimony",
                                            "https://en.wikipedia.org/wiki/Antimony"))
                     .build()),
    TELLURIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.TELLURIUM, "Te", 52, 127.6,
                                           206, 16, 5, Keys.ElementProperties.METALLOID))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+6", "+4", "-2"), 5, "p-block",
                                                 "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>10</small></sup>5p<sup><small>4</small></sup></html>",
                                                 2.1, 1.971, 9.01))
                      .physical(new PhysicalData("722.66", "1261", 25.73,
                                                 201.646, 6.232))
                      .metadata(new Metadata(1782, "Franz Joseph Müller von Reichenstein", "13494-80-9",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Tellurium",
                                             "https://en.wikipedia.org/wiki/Tellurium"))
                      .build()),
    IODINE(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.IODINE, "I", 53, 126.9045, 198,
                                        17, 5, Keys.ElementProperties.HALOGEN))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+7", "+5", "+1", "-1"), 5, "p-block",
                                              "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>10</small></sup>5p<sup><small>5</small></sup></html>",
                                              2.66, 3.059, 10.451))
                   .physical(new PhysicalData("386.85", "457.55", 54.44,
                                              null, 4.93))
                   .metadata(new Metadata(1811, "Bernard Courtois", "7553-56-2",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Iodine",
                                          "https://en.wikipedia.org/wiki/Iodine"))
                   .build()),
    XENON(new ElementBuilder()
                  .basic(new BasicData(Keys.Elements.XENON, "Xe", 54, 131.29, 216,
                                       18, 5, Keys.ElementProperties.NOBLE_GAS))
                  .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.GAS,
                                             List.of("0"), 5, "p-block",
                                             "<html>[Kr]5s<sup><small>2</small></sup>4d<sup><small>10</small></sup>5p<sup><small>6</small></sup></html>",
                                             2.6, 0.0, 12.13))
                  .physical(new PhysicalData("161.36", "165.03", 21.01,
                                             160.027, 0.005887))
                  .metadata(new Metadata(1898, "William Ramsay and Morris William Travers",
                                         "7440-63-3", "https://pubchem.ncbi.nlm.nih.gov/element/Xenon",
                                         "https://en.wikipedia.org/wiki/Xenon"))
                  .build()),
    CAESIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.CAESIUM, "Cs", 55, 132.9054520,
                                         343, 1, 6, Keys.ElementProperties.ALKALI_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+1"), 6, "s-block",
                                               "<html>[Xe]6s<sup><small>1</small></sup></html>",
                                               0.79, 0.472, 3.894))
                    .physical(new PhysicalData("301.59", "944", 32.21,
                                               242.344, 1.93))
                    .metadata(new Metadata(1860, "Robert Wilhelm Bunsen and Gustav Robert Kirchhoff",
                                           "7440-46-2", "https://pubchem.ncbi.nlm.nih.gov/element/55",
                                           "https://en.wikipedia.org/wiki/Caesium"))
                    .build()),
    BARIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.BARIUM, "Ba", 56, 137.33, 268,
                                        2, 6, Keys.ElementProperties.ALKALINE_EARTH_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+2"), 6, "s-block",
                                              "<html>[Xe]6s<sup><small>2</small></sup></html>",
                                              0.89, 0.0, 5.212))
                   .physical(new PhysicalData("1000", "2170", 28.07,
                                              204.398, 3.62))
                   .metadata(new Metadata(1808, "Sir Humphry Davy", "7440-39-3",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Barium",
                                          "https://en.wikipedia.org/wiki/Barium"))
                   .build()),
    LANTHANUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.LANTHANUM, "La", 57, 138.9055,
                                           240, 4, 8, Keys.ElementProperties.LANTHANIDE))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+3"), 6, "f-block",
                                                 "<html>[Xe]6s<sup><small>2</small></sup>5d<sup><small>1</small></sup></html>",
                                                 1.1, 0.5, 5.577))
                      .physical(new PhysicalData("1191", "3737", 27.11,
                                                 195.162, 6.15))
                      .metadata(new Metadata(1839, "Carl-Gustav Mosander", "7439-91-0",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Lanthanum",
                                             "https://en.wikipedia.org/wiki/Lanthanum"))
                      .build()),
    CERIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.CERIUM, "Ce", 58, 140.116, 235,
                                        5, 8, Keys.ElementProperties.LANTHANIDE))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+4", "+3"), 6, "f-block",
                                              "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>1</small></sup>5d<sup><small>1</small></sup></html>",
                                              1.12, 0.5, 5.539))
                   .physical(new PhysicalData("1071", "3697", 26.94,
                                              192.264, 6.770))
                   .metadata(new Metadata(1803, "Martin Heinrich Klaproth, Wilhelm Hisinger, Jöns Jakob Berzelius",
                                          "7440-45-1", "https://pubchem.ncbi.nlm.nih.gov/element/Cerium",
                                          "https://en.wikipedia.org/wiki/Cerium"))
                   .build()),
    PRASEODYMIUM(new ElementBuilder()
                         .basic(new BasicData(Keys.Elements.PRASEODYMIUM, "Pr", 59, 140.90766,
                                              239, 6, 8, Keys.ElementProperties.LANTHANIDE))
                         .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                    List.of("+3"), 6, "f-block",
                                                    "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>3</small></sup></html>",
                                                    1.13, null, 5.464))
                         .physical(new PhysicalData("1204", "3793", 27.2,
                                                    193.031, 6.77))
                         .metadata(new Metadata(1885, "Carl F. Auer von Welsbach", "7440-10-0",
                                                "https://pubchem.ncbi.nlm.nih.gov/element/Praseodymium",
                                                "https://en.wikipedia.org/wiki/Praseodymium"))
                         .build()),
    NEODYMIUM(new ElementBuilder().
                      basic(new BasicData(Keys.Elements.NEODYMIUM, "Nd", 60, 144.24,
                                          229, 7, 8, Keys.ElementProperties.LANTHANIDE))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+3"), 6, "f-block",
                                                 "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>4</small></sup></html>",
                                                 1.14, null, 5.525))
                      .physical(new PhysicalData("1294", "3347", 27.45,
                                                 190.308, 7.01))
                      .metadata(new Metadata(1885, "Carl F. Auer von Welsbach", "7440-00-8",
                                             "https://pubchem.ncbi.nlm.nih.gov/element/Neodymium",
                                             "https://en.wikipedia.org/wiki/Neodymium"))
                      .build()),
    PROMETHIUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.PROMETHIUM, "Pm", 61, 144.91276,
                                            236, 8, 8, Keys.ElementProperties.LANTHANIDE))
                       .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                  List.of("+3"), 6, "f-block",
                                                  "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>5</small></sup></html>",
                                                  null, null, 5.55))
                       .physical(new PhysicalData("1315", "3273", null,
                                                  null, 7.26))
                       .metadata(new Metadata(1945, "Jacob A. Marinsky, Lawrence E. Glendenin and Charles D. Coryell",
                                              "7440-12-2", "https://pubchem.ncbi.nlm.nih.gov/element/Promethium",
                                              "https://en.wikipedia.org/wiki/Promethium"))
                       .build()),
    SAMARIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.SAMARIUM, "Sm", 62, 150.4,
                                          229, 9, 8, Keys.ElementProperties.LANTHANIDE))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+3", "+2"), 6, "f-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>6</small></sup></html>",
                                                1.17, null, 5.644))
                     .physical(new PhysicalData("1347", "2067", 29.54,
                                                196.462, 7.52))
                     .metadata(new Metadata(1879, "Paul-Emile Lecoq de Boisbaudran", "7440-19-9",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Samarium",
                                            "https://en.wikipedia.org/wiki/Samarium"))
                     .build()),
    EUROPIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.EUROPIUM, "Eu", 63, 151.964,
                                          233, 10, 8, Keys.ElementProperties.LANTHANIDE))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+3", "+2"), 6, "f-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>7</small></sup></html>",
                                                null, null, 5.67))
                     .physical(new PhysicalData("1095", "1802", 27.66,
                                                182.022, 5.24))
                     .metadata(new Metadata(1901, "Eugène-Anatole Demarçay", "7440-53-1",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Europium",
                                            "https://en.wikipedia.org/wiki/Europium"))
                     .build()),
    GADOLINIUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.GADOLINIUM, "Gd", 64, 157.25,
                                            237, 11, 8, Keys.ElementProperties.LANTHANIDE))
                       .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                  List.of("+3"), 6, "f-block",
                                                  "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>7</small></sup>5d<sup><small>1</small></sup></html>",
                                                  1.2, null, 6.15))
                       .physical(new PhysicalData("1586", "3546", 37.03,
                                                  235.485, 7.90))
                       .metadata(new Metadata(1880, "Jean Charles Galissard de Marignac",
                                              "7440-54-2", "https://pubchem.ncbi.nlm.nih.gov/element/Gadolinium",
                                              "https://en.wikipedia.org/wiki/Gadolinium"))
                       .build()),
    TERBIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.TERBIUM, "Tb", 65, 158.92535, 221,
                                         12, 8, Keys.ElementProperties.LANTHANIDE))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+3"), 6, "f-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>9</small></sup></html>",
                                               null, null, 5.864))
                    .physical(new PhysicalData("1629", "3503", 28.91,
                                               181.904, 8.23))
                    .metadata(new Metadata(1843, "Carl-Gustav Mosander", "7440-27-9",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Terbium",
                                           "https://en.wikipedia.org/wiki/Terbium"))
                    .build()),
    DYSPROSIUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.DYSPROSIUM, "Dy", 66, 162.500,
                                            229, 13, 8, Keys.ElementProperties.LANTHANIDE))
                       .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                  List.of("+3"), 6, "f-block",
                                                  "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>10</small></sup></html>",
                                                  1.22, null, 5.939))
                       .physical(new PhysicalData("1685", "2840", 27.7,
                                                  170.462, 8.55))
                       .metadata(new Metadata(1886, "Paul-Émile Lecoq de Boisbaudran",
                                              "7429-91-6", "https://pubchem.ncbi.nlm.nih.gov/element/Dysprosium",
                                              "https://en.wikipedia.org/wiki/Dysprosium"))
                       .build()),
    HOLMIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.HOLMIUM, "Ho", 67, 164.93033,
                                         216, 14, 8, Keys.ElementProperties.LANTHANIDE))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+3"), 6, "f-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>11</small></sup></html>",
                                               1.23, null, 6.022))
                    .physical(new PhysicalData("1747", "2973", 27.15,
                                               164.615, 8.80))
                    .metadata(new Metadata(1878, "J. L. Soret", "7440-60-0",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Holmium",
                                           "https://en.wikipedia.org/wiki/Holmium"))
                    .build()),
    ERBIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.ERBIUM, "Er", 68, 167.26, 235,
                                        15, 8, Keys.ElementProperties.LANTHANIDE))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+3"), 6, "f-block",
                                              "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>12</small></sup></html>",
                                              1.24, null, 6.108))
                   .physical(new PhysicalData("1802", "3141", 28.12,
                                              168.121, 9.07))
                   .metadata(new Metadata(1843, "Carl-Gustav Mosander", "7440-52-0",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Erbium",
                                          "https://en.wikipedia.org/wiki/Erbium"))
                   .build()),
    THULIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.THULIUM, "Tm", 69, 168.93422,
                                         227, 16, 8, Keys.ElementProperties.LANTHANIDE))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+3"), 6, "f-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>13</small></sup></html>",
                                               1.25, null, 6.184))
                    .physical(new PhysicalData("1818", "2223", 27.03,
                                               160.007, 9.32))
                    .metadata(new Metadata(1879, "Per Theodor Cleve", "7440-30-4",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Thulium",
                                           "https://en.wikipedia.org/wiki/Thulium"))
                    .build()),
    YTTERBIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.YTTERBIUM, "Yb", 70, 173.05,
                                           242, 17, 8, Keys.ElementProperties.LANTHANIDE))
                      .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                 List.of("+3", "+2"), 6, "f-block",
                                                 "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup></html>",
                                                 null, null, 6.254))
                      .physical(new PhysicalData("1092", "1469", 26.74,
                                                 154.522, 6.90))
                      .metadata(new Metadata(1878, "Jean-Charles Galissard de Marignac",
                                             "7440-64-4", "https://pubchem.ncbi.nlm.nih.gov/element/Ytterbium",
                                             "https://en.wikipedia.org/wiki/Ytterbium"))
                      .build()),
    LUTETIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.LUTETIUM, "Lu", 71, 174.9667,
                                          221, 18, 8, Keys.ElementProperties.LANTHANIDE))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+3"), 6, "d-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>1</small></sup></html>",
                                                1.27, null, 5.426))
                     .physical(new PhysicalData("1936", "3675", 26.86,
                                                153.512, 9.84))
                     .metadata(new Metadata(1907, "Georges Urbain", "7439-94-3",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Lutetium",
                                            "https://en.wikipedia.org/wiki/Lutetium"))
                     .build()),
    HAFNIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.HAFNIUM, "Hf", 72, 178.49,
                                         212, 4, 6, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+4"), 6, "d-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>2</small></sup></html>",
                                               1.3, 0.0, 6.825))
                    .physical(new PhysicalData("2506", "4876", 25.73,
                                               144.154, 13.3))
                    .metadata(new Metadata(1923, "Dirk Coster and George de Hevesy",
                                           "7440-58-6", "https://pubchem.ncbi.nlm.nih.gov/element/Hafnium",
                                           "https://en.wikipedia.org/wiki/Hafnium"))
                    .build()),
    TANTALUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.TANTALUM, "Ta", 73, 180.9479,
                                          217, 5, 6, Keys.ElementProperties.TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+5"), 6, "d-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>3</small></sup></html>",
                                                1.5, 0.322, 7.89))
                     .physical(new PhysicalData("3290", "5731", 25.36,
                                                140.149, 16.4))
                     .metadata(new Metadata(1802, "Anders Gustaf Ekeberg", "7440-25-7",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Tantalum",
                                            "https://en.wikipedia.org/wiki/Tantalum"))
                     .build()),
    TUNGSTEN(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.TUNGSTEN, "W", 74, 183.84,
                                          210, 6, 6, Keys.ElementProperties.TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+6"), 6, "d-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>4</small></sup></html>",
                                                2.36, 0.815, 7.98))
                     .physical(new PhysicalData("3695", "5828", 24.27,
                                                132.017, 19.3))
                     .metadata(new Metadata(1783, "Juan José and Fausto Elhuyar", "7440-33-7",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Tungsten",
                                            "https://en.wikipedia.org/wiki/Tungsten"))
                     .build()),
    RHENIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.RHENIUM, "Re", 75, 186.207,
                                         217, 7, 6, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+7", "+6", "+4"), 6, "d-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>5</small></sup></html>",
                                               1.9, 0.15, 7.88))
                    .physical(new PhysicalData("3459", "5869", 25.48,
                                               136.835, 20.8))
                    .metadata(new Metadata(1925, "Walter Noddack, Ida Tacke, and Otto Berg",
                                           "7440-15-5", "https://pubchem.ncbi.nlm.nih.gov/element/Rhenium",
                                           "https://en.wikipedia.org/wiki/Rhenium"))
                    .build()),
    OSMIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.OSMIUM, "Os", 76, 190.2, 216,
                                        8, 6, Keys.ElementProperties.TRANSITION_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                              List.of("+4", "+3"), 6, "d-block",
                                              "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>6</small></sup></html>",
                                              2.2, 1.1, 8.7))
                   .physical(new PhysicalData("3306", "5285", 24.7,
                                              129.843, 22.57))
                   .metadata(new Metadata(1803, "Smithson Tennant", "7440-04-2",
                                          "https://pubchem.ncbi.nlm.nih.gov/element/Osmium",
                                          "https://en.wikipedia.org/wiki/Osmium"))
                   .build()),
    IRIDIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.IRIDIUM, "Ir", 77, 192.22,
                                         202, 9, 6, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+4", "+3"), 6, "d-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>7</small></sup></html>",
                                               2.2, 1.565, 9.1))
                    .physical(new PhysicalData("2719", "4701", 25.1,
                                               130.58, 22.42))
                    .metadata(new Metadata(1803, "Smithson Tennant", "7439-88-5",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Iridium",
                                           "https://en.wikipedia.org/wiki/Iridium"))
                    .build()),
    PLATINUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.PLATINUM, "Pt", 78, 195.08,
                                          209, 10, 6, Keys.ElementProperties.TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+4", "+2"), 6, "d-block",
                                                "<html>[Xe]6s<sup><small>1</small></sup>4f<sup><small>14</small></sup>5d<sup><small>9</small></sup></html>",
                                                2.28, 2.128, 9.0))
                     .physical(new PhysicalData("2041.55", "4098", 25.86,
                                                132.561, 21.46))
                     .metadata(new Metadata(1735, "Antonio de Ulloa", "7440-06-4",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Platinum",
                                            "https://en.wikipedia.org/wiki/Platinum"))
                     .build()),
    GOLD(new ElementBuilder()
                 .basic(new BasicData(Keys.Elements.GOLD, "Au", 79, 196.96657, 166,
                                      11, 6, Keys.ElementProperties.TRANSITION_METAL))
                 .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                            List.of("+3", "+1"), 6, "d-block",
                                            "<html>[Xe]6s<sup><small>1</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup></html>",
                                            2.54, 2.309, 9.226))
                 .physical(new PhysicalData("1337.33", "3129", 25.418,
                                            129.045, 19.282))
                 .metadata(new Metadata(0, null, "7440-57-5",
                                        "https://pubchem.ncbi.nlm.nih.gov/element/Gold",
                                        "https://en.wikipedia.org/wiki/Gold"))
                 .build()),
    MERCURY(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.MERCURY, "Hg", 80, 200.59, 209,
                                         12, 6, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.LIQUID,
                                               List.of("+2", "+1"), 6, "d-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup></html>",
                                               2.0, 0.0, 10.438))
                    .physical(new PhysicalData("234.32", "629.88", 27.983,
                                               139.503, 13.5336))
                    .metadata(new Metadata(0, "Ancient Egyptians", "7439-97-6",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Mercury",
                                           "https://en.wikipedia.org/wiki/Mercury_(element)"))
                    .build()),
    THALLIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.THALLIUM, "Tl", 81, 204.383, 196,
                                          13, 6, Keys.ElementProperties.POST_TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                                List.of("+3", "+1"), 6, "p-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup>6p<sup><small>1</small></sup></html>",
                                                1.62, 0.2, 6.108))
                     .physical(new PhysicalData("577", "1746", 26.32,
                                                128.78, 11.8))
                     .metadata(new Metadata(1861, "William Crookes", "7440-28-0",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Thallium",
                                            "https://en.wikipedia.org/wiki/Thallium"))
                     .build()),
    LEAD(new ElementBuilder()
                 .basic(new BasicData(Keys.Elements.LEAD, "Pb", 82, 207, 202, 14,
                                      6, Keys.ElementProperties.POST_TRANSITION_METAL))
                 .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                            List.of("+4", "+2"), 6, "p-block",
                                            "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup>6p<sup><small>2</small></sup></html>",
                                            2.33, 0.36, 7.417))
                 .physical(new PhysicalData("600.61", "2022", 26.65,
                                            128.62, 11.342))
                 .metadata(new Metadata(0, null, "7439-92-1",
                                        "https://pubchem.ncbi.nlm.nih.gov/element/Lead",
                                        "https://en.wikipedia.org/wiki/Lead"))
                 .build()),
    BISMUTH(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.BISMUTH, "Bi", 83, 208.98040,
                                         207, 15, 6, Keys.ElementProperties.POST_TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+5", "+3"), 6, "p-block",
                                               "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup>6p<sup><small>3</small></sup></html>",
                                               2.02, 0.946, 7.289))
                    .physical(new PhysicalData("544.55", "1837", 25.52,
                                               122.117, 9.807))
                    .metadata(new Metadata(1753, "Claude-Francois Geoffroy", "7440-69-9",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Bismuth",
                                           "https://en.wikipedia.org/wiki/Bismuth"))
                    .build()),
    POLONIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.POLONIUM, "Po", 84, 208.98243,
                                          197, 16, 6, Keys.ElementProperties.METALLOID))
                     .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                List.of("+4", "+2"), 6, "p-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup>6p<sup><small>4</small></sup></html>",
                                                2.0, 1.9, 8.417))
                     .physical(new PhysicalData("527", "1235", 26.4,
                                                null, 9.32))
                     .metadata(new Metadata(1898, "Marie Sklodowska Curie", "7440-08-6",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Polonium",
                                            "https://en.wikipedia.org/wiki/Polonium"))
                     .build()),
    ASTATINE(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.ASTATINE, "At", 85, 209.98715, 202,
                                          17, 6, Keys.ElementProperties.HALOGEN))
                     .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                List.of("+7", "+5", "+3", "+1", "-1"), 6, "p-block",
                                                "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup>6p<sup><small>5</small></sup></html>",
                                                2.2, 2.8, 9.5))
                     .physical(new PhysicalData("575", "610.15", null,
                                                null, 7.0))
                     .metadata(new Metadata(1940, "Dale R. Carson, K.R. MacKenzie and Emilio Segrè",
                                            "7440-68-8", "https://pubchem.ncbi.nlm.nih.gov/element/Astatine",
                                            "https://en.wikipedia.org/wiki/Astatine"))
                     .build()),
    RADON(new ElementBuilder()
                  .basic(new BasicData(Keys.Elements.RADON, "Rn", 86, 222.01758,
                                       220, 18, 6, Keys.ElementProperties.NOBLE_GAS))
                  .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.GAS,
                                             List.of("0"), 6, "p-block",
                                             "<html>[Xe]6s<sup><small>2</small></sup>4f<sup><small>14</small></sup>5d<sup><small>10</small></sup>6p<sup><small>6</small></sup></html>",
                                             null, 0.0, 10.745))
                  .physical(new PhysicalData("202", "211.45", 20.786,
                                             null, 0.00973))
                  .metadata(new Metadata(1900, "Friedrich Ernst Dorn", "10043-92-2",
                                         "https://pubchem.ncbi.nlm.nih.gov/element/Radon",
                                         "https://en.wikipedia.org/wiki/Radon"))
                  .build()),
    FRANCIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.FRANCIUM, "Fr", 87, 223.01973,
                                          348, 1, 7, Keys.ElementProperties.ALKALI_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                List.of("+1"), 7, "s-block",
                                                "<html>[Rn]7s<sup><small>1</small></sup></html>",
                                                0.7, 0.47, 3.9))
                     .physical(new PhysicalData("300", "953.15", null,
                                                null, 2.48))
                     .metadata(new Metadata(1939, "Marguerite Catherine Perey", "7440-73-5",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Francium",
                                            "https://en.wikipedia.org/wiki/Francium"))
                     .build()),
    RADIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.RADIUM, "Ra", 88, 226.02541, 283,
                                        2, 7, Keys.ElementProperties.ALKALINE_EARTH_METAL))
                   .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                              List.of("+2"), 7, "s-block",
                                              "<html>[Rn]7s<sup><small>2</small></sup></html>",
                                              0.9, null, 5.279))
                   .physical(new PhysicalData("973", "1413", null,
                                              null, 5.0))
                   .metadata(new Metadata(1898, "Marie Sklodowska Curie and Pierre Curie",
                                          "7440-14-4", "https://pubchem.ncbi.nlm.nih.gov/element/Radium",
                                          "https://en.wikipedia.org/wiki/Radium"))
                   .build()),
    ACTINIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.ACTINIUM, "Ac", 89, 227.02775,
                                          260, 4, 9, Keys.ElementProperties.ACTINIDE))
                     .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                List.of("+3"), 7, "f-block",
                                                "<html>[Rn]7s<sup><small>2</small></sup>6d<sup><small>1</small></sup></html>",
                                                1.1, null, 5.17))
                     .physical(new PhysicalData("1324", "3471", 27.2,
                                                null, 10.07))
                     .metadata(new Metadata(1899, "André-Louis Debierne", "7440-34-8",
                                            "https://pubchem.ncbi.nlm.nih.gov/element/Actinium",
                                            "https://en.wikipedia.org/wiki/Actinium"))
                     .build()),
    THORIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.THORIUM, "Th", 90, 232.038, 237,
                                         5, 9, Keys.ElementProperties.ACTINIDE))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+4"), 7, "f-block",
                                               "<html>[Rn]7s<sup><small>2</small></sup>6d<sup><small>2</small></sup></html>",
                                               1.3, null, 6.08))
                    .physical(new PhysicalData("2023", "5061", 26.23,
                                               113.041, 11.72))
                    .metadata(new Metadata(1828, "Jöns Jacob Berzelius", "7440-29-1",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Thorium",
                                           "https://en.wikipedia.org/wiki/Thorium"))
                    .build()),
    PROTACTINIUM(new ElementBuilder()
                         .basic(new BasicData(Keys.Elements.PROTACTINIUM, "Pa", 91, 231.03588,
                                              243, 6, 9, Keys.ElementProperties.ACTINIDE))
                         .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                    List.of("+5", "+4"), 7, "f-block",
                                                    "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>2</small></sup>6d<sup><small>1</small></sup></html>",
                                                    1.5, null, 5.89))
                         .physical(new PhysicalData("1845", "4300.1", null,
                                                    null, 15.37))
                         .metadata(new Metadata(1913, "Kasimir Fajans and O.H. Göhring", "7440-13-3",
                                                "https://pubchem.ncbi.nlm.nih.gov/element/Protactinium",
                                                "https://en.wikipedia.org/wiki/Protactinium"))
                         .build()),
    URANIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.URANIUM, "U", 92, 238.0289,
                                         240, 7, 9, Keys.ElementProperties.ACTINIDE))
                    .chemical(new ChemicalData(Keys.ElementProperties.PRIMORDIAL, Keys.ElementProperties.SOLID,
                                               List.of("+6", "+5", "+4", "+3"), 7, "f-block",
                                               "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>3</small></sup>6d<sup><small>1</small></sup></html>",
                                               1.38, null, 6.194))
                    .physical(new PhysicalData("1408", "4404", 27.665,
                                               116.225, 18.95))
                    .metadata(new Metadata(1789, "Martin Heinrich Klaproth", "7440-61-1",
                                           "https://pubchem.ncbi.nlm.nih.gov/element/Uranium",
                                           "https://en.wikipedia.org/wiki/Uranium"))
                    .build()),
    NEPTUNIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.NEPTUNIUM, "Np", 93, 237.048172,
                                           221, 8, 9, Keys.ElementProperties.ACTINIDE))
                      .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                 List.of("+6", "+5", "+4", "+3"), 7, "f-block",
                                                 "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>4</small></sup>6d<sup><small>1</small></sup></html>",
                                                 1.36, null, 6.266))
                      .physical(new PhysicalData("917", "4175", 29.46,
                                                 null, 20.25))
                      .metadata(new Metadata(1940, "Edwin M. McMillian and Philip H. Abelson",
                                             "7439-99-8", "https://pubchem.ncbi.nlm.nih.gov/element/Neptunium",
                                             "https://en.wikipedia.org/wiki/Neptunium"))
                      .build()),
    PLUTONIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.PLUTONIUM, "Pu", 94, 244.06420,
                                           243, 9, 9, Keys.ElementProperties.ACTINIDE))
                      .chemical(new ChemicalData(Keys.ElementProperties.FROM_DECAY, Keys.ElementProperties.SOLID,
                                                 List.of("+6", "+5", "+4", "+3"), 7, "f-block",
                                                 "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>6</small></sup></html>",
                                                 1.28, null, 6.06))
                      .physical(new PhysicalData("913", "3501", 35.5,
                                                 null, 19.84))
                      .metadata(new Metadata(1940, "Glenn T. Seaborg, Joseph W. Kennedy, Edward M. McMillan and Arthur C. Wohl",
                                             "7440-07-5", "https://pubchem.ncbi.nlm.nih.gov/element/Plutonium",
                                             "https://en.wikipedia.org/wiki/Plutonium"))
                      .build()),
    AMERICIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.AMERICIUM, "Am", 95, 243.061380,
                                           244, 10, 9, Keys.ElementProperties.ACTINIDE))
                      .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                 List.of("+6", "+5", "+4", "+3"), 7, "f-block",
                                                 "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>7</small></sup></html>",
                                                 1.3, null, 5.993))
                      .physical(new PhysicalData("1449", "2284", 28.0,
                                                 null, 13.69))
                      .metadata(new Metadata(1944, "Glenn T. Seaborg, Ralph A. James, Leon O. Morgan and Albert Ghiorso",
                                             "7440-35-9", "https://pubchem.ncbi.nlm.nih.gov/element/Americium",
                                             "https://en.wikipedia.org/wiki/Americium"))
                      .build()),
    CURIUM(new ElementBuilder()
                   .basic(new BasicData(Keys.Elements.CURIUM, "Cm", 96, 247.07035
                           , 245, 11, 9, Keys.ElementProperties.ACTINIDE))
                   .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                              List.of("+3"), 7, "f-block",
                                              "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>7</small></sup>6d<sup><small>1</small></sup></html>",
                                              1.3, null, 6.02))
                   .physical(new PhysicalData("1618", "3400", null,
                                              null, 13.51))
                   .metadata(new Metadata(1944, "Glenn T. Seaborg, Ralph A. James and Albert Ghiorso",
                                          "7440-51-9", "https://pubchem.ncbi.nlm.nih.gov/element/Curium",
                                          "https://en.wikipedia.org/wiki/Curium"))
                   .build()),
    BERKELIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.BERKELIUM, "Bk", 97, 247.07031,
                                           244, 12, 9, Keys.ElementProperties.ACTINIDE))
                      .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                 List.of("+4", "+3"), 7, "f-block",
                                                 "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>9</small></sup></html>",
                                                 1.3, null, 6.23))
                      .physical(new PhysicalData("1323", "2900.2", null,
                                                 null, 14.78))
                      .metadata(new Metadata(1949, "Stanley G. Thompson, Glenn T. Seaborg, Kenneth Street, Jr. and Albert Ghiorso",
                                             "7440-40-6", "https://pubchem.ncbi.nlm.nih.gov/element/Berkelium",
                                             "https://en.wikipedia.org/wiki/Berkelium"))
                      .build()),
    CALIFORNIUM(new ElementBuilder()
                        .basic(new BasicData(Keys.Elements.CALIFORNIUM, "Cf", 98, 251.07959,
                                             245, 13, 9, Keys.ElementProperties.ACTINIDE))
                        .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                   List.of("+3"), 7, "f-block",
                                                   "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>10</small></sup></html>",
                                                   1.3, null, 6.3))
                        .physical(new PhysicalData("1173", "1743.2", null,
                                                   null, 15.1))
                        .metadata(new Metadata(1950, "Stanley G. Thompson, Glenn T. Seaborg, Kenneth Street, Jr. and Albert Ghiorso",
                                               "7440-71-3", "https://pubchem.ncbi.nlm.nih.gov/element/Californium",
                                               "https://en.wikipedia.org/wiki/Californium"))
                        .build()),
    EINSTEINIUM(new ElementBuilder()
                        .basic(new BasicData(Keys.Elements.EINSTEINIUM, "Es", 99, 252.0830,
                                             245, 14, 9, Keys.ElementProperties.ACTINIDE))
                        .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                   List.of("+3"), 7, "f-block",
                                                   "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>11</small></sup></html>",
                                                   1.3, null, 6.42))
                        .physical(new PhysicalData("1133", "1269.2", null,
                                                   null, 8.84))
                        .metadata(new Metadata(1952, "A team of scientists led by Albert Ghiorso",
                                               "7429-92-7", "https://pubchem.ncbi.nlm.nih.gov/element/Einsteinium",
                                               "https://en.wikipedia.org/wiki/Einsteinium"))
                        .build()),
    FERMIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.FERMIUM, "Fm", 100, 257.09511, null,
                                         15, 9, Keys.ElementProperties.ACTINIDE))
                    .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                               List.of("+3"), 7, "f-block",
                                               "<html>[Rn]5f<sup><small>12</small></sup>7s<sup><small>2</small></sup></html>",
                                               1.3, null, 6.5))
                    .physical(new PhysicalData("1800", null, null,
                                               null, 9.7))
                    .metadata(new Metadata(1952, "A team of scientists led by Albert Ghiorso",
                                           "7440-72-4", "https://pubchem.ncbi.nlm.nih.gov/element/Fermium",
                                           "https://en.wikipedia.org/wiki/Fermium"))
                    .build()),
    MENDELEVIUM(new ElementBuilder()
                        .basic(new BasicData(Keys.Elements.MENDELEVIUM, "Md", 101, 258.09843, null,
                                             16, 9, Keys.ElementProperties.ACTINIDE))
                        .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                   List.of("+3", "+2"), 7, "f-block",
                                                   "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>13</small></sup></html>",
                                                   1.3, null, 6.58))
                        .physical(new PhysicalData("1100", null, null,
                                                   null, 10.3))
                        .metadata(new Metadata(1955, "Stanley G. Thompson, Glenn T. Seaborg, Bernard G. Harvey, Gregory R. Choppin and Albert Ghiorso",
                                               "7440-11-1", "https://pubchem.ncbi.nlm.nih.gov/element/Mendelevium",
                                               "https://en.wikipedia.org/wiki/Mendelevium"))
                        .build()),
    NOBELIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.NOBELIUM, "No", 102, 259.10100, null,
                                          17, 9, Keys.ElementProperties.ACTINIDE))
                     .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                List.of("+3", "+2"), 7, "f-block",
                                                "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup></html>",
                                                1.3, null, 6.65))
                     .physical(new PhysicalData("1100", null, null,
                                                null, 9.9))
                     .metadata(new Metadata(1957, "A group of scientists working at the Nobel Institute of Physics in Stockhlom, Sweden",
                                            "10028-14-5", "https://pubchem.ncbi.nlm.nih.gov/element/Nobelium",
                                            "https://en.wikipedia.org/wiki/Nobelium"))
                     .build()),
    LAWRENCIUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.LAWRENCIUM, "Lr", 103, 266.120, null,
                                            18, 9, Keys.ElementProperties.ACTINIDE))
                       .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                  List.of("+3"), 7, "d-block",
                                                  "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>1</small></sup></html>",
                                                  1.3, null, 4.96))
                       .physical(new PhysicalData("1900", null, null,
                                                  null, 14.4))
                       .metadata(new Metadata(1961, "Albert Ghiorso, Torbjørn Sikkeland, Almon E. Larsh and Robert M. Latimer",
                                              "22537-19-5", "https://pubchem.ncbi.nlm.nih.gov/element/Lawrencium",
                                              "https://en.wikipedia.org/wiki/Lawrencium"))
                       .build()),
    RUTHERFORDIUM(new ElementBuilder()
                          .basic(new BasicData(Keys.Elements.RUTHERFORDIUM, "Rf", 104, 267.122,
                                               null, 4, 7, Keys.ElementProperties.TRANSITION_METAL))
                          .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                     List.of("+4"), 7, "d-block",
                                                     "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>2</small></sup></html>",
                                                     null, null, 6.02))
                          .physical(new PhysicalData("2400", "5800", null,
                                                     null, 17.0))
                          .metadata(new Metadata(1964, "Scientists at the Joint Institute for Nuclear Research in Dubna, Russia",
                                                 "53850-36-5", "https://pubchem.ncbi.nlm.nih.gov/element/Rutherfordium",
                                                 "https://en.wikipedia.org/wiki/Rutherfordium"))
                          .build()),
    DUBNIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.DUBNIUM, "Db", 105, 268.126, null,
                                         5, 7, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                               List.of("+5", "+4", "+3"), 7, "d-block",
                                               "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>3</small></sup></html>",
                                               null, null, 6.8))
                    .physical(new PhysicalData(null, null, null,
                                               null, 21.6))
                    .metadata(new Metadata(1967, "Scientists at the Joint Institute for Nuclear Research in Dubna, Russia",
                                           "53850-35-4", "https://pubchem.ncbi.nlm.nih.gov/element/Dubnium",
                                           "https://en.wikipedia.org/wiki/Dubnium"))
                    .build()),
    SEABORGIUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.SEABORGIUM, "Sg", 106, 269.128, null,
                                            6, 7, Keys.ElementProperties.TRANSITION_METAL))
                       .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                  List.of("+6", "+5", "+4", "+3", "0"), 7, "d-block",
                                                  "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>4</small></sup></html>",
                                                  null, null, null))
                       .physical(new PhysicalData(null, null, null,
                                                  null, 23.5))
                       .metadata(new Metadata(1974, "A team of scientists led by Albert Ghiorso working at the Lawrence Berkeley Laboratory in Berkeley, California",
                                              "54038-81-2", "https://pubchem.ncbi.nlm.nih.gov/element/Seaborgium",
                                              "https://en.wikipedia.org/wiki/Seaborgium"))
                       .build()),
    BOHRIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.BOHRIUM, "Bh", 107, 270.133, null,
                                         7, 7, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                               List.of("+7", "+5", "+4", "+3"), 7, "d-block",
                                               "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>5</small></sup></html>",
                                               null, null, 7.7))
                    .physical(new PhysicalData(null, null, null,
                                               null, 26.5))
                    .metadata(new Metadata(1976, "Scientists working at the Joint Institute for Nuclear Research in Dubna, Russia",
                                           "54037-14-8", "https://pubchem.ncbi.nlm.nih.gov/element/Bohrium",
                                           "https://en.wikipedia.org/wiki/Bohrium"))
                    .build()),
    HASSIUM(new ElementBuilder()
                    .basic(new BasicData(Keys.Elements.HASSIUM, "Hs", 108, 269.1336, null,
                                         8, 7, Keys.ElementProperties.TRANSITION_METAL))
                    .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                               List.of("+8", "+6", "+5", "+4", "+3", "+2"), 7, "d-block",
                                               "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>6</small></sup></html>",
                                               null, null, 7.6))
                    .physical(new PhysicalData(null, null, null,
                                               null, 28.0))
                    .metadata(new Metadata(1984, "Peter Armbruster, Gottfried Münzenber and their team working at the Gesellschaft für Schwerionenforschung in Darmstadt, Germany",
                                           "54037-57-9", "https://pubchem.ncbi.nlm.nih.gov/element/Hassium",
                                           "https://en.wikipedia.org/wiki/Hassium"))
                    .build()),
    MEITNERIUM(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.MEITNERIUM, "Mt", 109, 277.154,
                                            null, 9, 7, Keys.ElementProperties.TRANSITION_METAL))
                       .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                  List.of("+9", "+8", "+6", "+4", "+3", "+1"), 7, "d-block",
                                                  "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>7</small></sup></html>",
                                                  null, null, null))
                       .physical(new PhysicalData(null, null, null,
                                                  null, 27.5))
                       .metadata(new Metadata(1982, "Peter Armbruster, Gottfried Münzenber and their team working at the Gesellschaft für Schwerionenforschung in Darmstadt, Germany",
                                              "54038-01-6", "https://pubchem.ncbi.nlm.nih.gov/element/Meitnerium",
                                              "https://en.wikipedia.org/wiki/Meitnerium"))
                       .build()),
    DARMSTADTIUM(new ElementBuilder()
                         .basic(new BasicData(Keys.Elements.DARMSTADTIUM, "Ds", 110, 282.166, null,
                                              10, 7, Keys.ElementProperties.TRANSITION_METAL))
                         .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                    List.of("+8", "+6", "+4", "+2", "0"), 7, "d-block",
                                                    "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>8</small></sup></html>",
                                                    null, null, null))
                         .physical(new PhysicalData(null, null, null,
                                                    null, 26.5))
                         .metadata(new Metadata(1994, "Peter Armbruster, Gottfried Münzenber and their team working at the Gesellschaft für Schwerionenforschung in Darmstadt, Germany",
                                                "54083-77-1", "https://pubchem.ncbi.nlm.nih.gov/element/Darmstadtium",
                                                "https://en.wikipedia.org/wiki/Darmstadtium"))
                         .build()),
    ROENTGENIUM(new ElementBuilder()
                        .basic(new BasicData(Keys.Elements.ROENTGENIUM, "Rg", 111, 282.169, null,
                                             11, 7, Keys.ElementProperties.TRANSITION_METAL))
                        .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                   List.of("+5", "+3", "+1", "-1"), 7, "d-block",
                                                   "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>0</small></sup></html>",
                                                   null, null, null))
                        .physical(new PhysicalData(null, null, null,
                                                   null, 23.5))
                        .metadata(new Metadata(1994, "Peter Armbruster, Gottfried Münzenber and their team working at the Gesellschaft für Schwerionenforschung in Darmstadt, Germany",
                                               "54386-24-2", "https://pubchem.ncbi.nlm.nih.gov/element/Roentgenium",
                                               "https://en.wikipedia.org/wiki/Roentgenium"))
                        .build()),
    COPERNICIUM(new ElementBuilder()
                        .basic(new BasicData(Keys.Elements.COPERNICIUM, "Cn", 112, 286.179, null,
                                             12, 7, Keys.ElementProperties.TRANSITION_METAL))
                        .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                   List.of("+2", "+1", "0"), 7, "d-block",
                                                   "<html>[Rn]7s<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>10</small></sup></html>",
                                                   null, null, null))
                        .physical(new PhysicalData(null, null, null,
                                                   null, 14.0))
                        .metadata(new Metadata(1996, "Peter Armbruster, Gottfried Münzenber and their team working at the Gesellschaft für Schwerionenforschung in Darmstadt, Germany",
                                               "54084-26-3", "https://pubchem.ncbi.nlm.nih.gov/element/Copernicium",
                                               "https://en.wikipedia.org/wiki/Copernicium"))
                        .build()),
    NIHONIUM(new ElementBuilder()
                     .basic(new BasicData(Keys.Elements.NIHONIUM, "Nh", 113, 286.182,
                                          null, 13, 7, Keys.ElementProperties.POST_TRANSITION_METAL))
                     .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                List.of("0"), 7, "p-block",
                                                "<html>[Rn]5f<sup><small>14</small></sup>6d<sup><small>10</small></sup>7s<sup><small>2</small></sup>7p<sup><small>1</small></sup></html>",
                                                null, null, null))
                     .physical(new PhysicalData("700", "1430", null,
                                                null, 16.0))
                     .metadata(new Metadata(2004, "Scientists at the RIKEN Nishina Center for Accelerator-based Science in Wako, Japan",
                                            "54084-70-7", "https://pubchem.ncbi.nlm.nih.gov/element/Nihonium",
                                            "https://en.wikipedia.org/wiki/Nihonium"))
                     .build()),
    FLEROVIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.FLEROVIUM, "Fl", 114, 290.192, null,
                                           14, 7, Keys.ElementProperties.POST_TRANSITION_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                 List.of("+6", "+4", "+2", "+1", "0"), 7, "p-block",
                                                 "<html>[Rn]7s<sup><small>2</small></sup>7p<sup><small>2</small></sup>5f<sup><small>14</small></sup>6d<sup><small>10</small></sup></html>",
                                                 null, null, null))
                      .physical(new PhysicalData(null, "210", null,
                                                 null, 11.4))
                      .metadata(new Metadata(1998, "Scientists at the Joint Institute for Nuclear Research in Dubna, Russia",
                                             "54085-16-4", "https://pubchem.ncbi.nlm.nih.gov/element/Flerovium",
                                             "https://en.wikipedia.org/wiki/Flerovium"))
                      .build()),
    MOSCOVIUM(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.MOSCOVIUM, "Mc", 115, 290.196, null,
                                           15, 7, Keys.ElementProperties.POST_TRANSITION_METAL))
                      .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                 List.of("+3", "+1"), 7, "p-block",
                                                 "<html>[Rn]7s<sup><small>2</small></sup>7p<sup><small>3</small></sup>5f<sup><small>14</small></sup>6d<sup><small>10</small></sup></html>",
                                                 null, null, null))
                      .physical(new PhysicalData("670", "1400", null,
                                                 null, 13.5))
                      .metadata(new Metadata(2003, "Scientists at the Joint Institute for Nuclear Research in Dubna, Russia",
                                             "54085-64-2", "https://pubchem.ncbi.nlm.nih.gov/element/Moscovium",
                                             "https://en.wikipedia.org/wiki/Moscovium"))
                      .build()),
    LIVERMORIUM(new ElementBuilder()
                        .basic(new BasicData(Keys.Elements.LIVERMORIUM, "Lv", 116, 293.205, null,
                                             16, 7, Keys.ElementProperties.POST_TRANSITION_METAL))
                        .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                   List.of("+4", "+2", "-2"), 7, "p-block",
                                                   "<html>[Rn]7s<sup><small>2</small></sup>7p<sup><small>4</small></sup>5f<sup><small>14</small></sup>6d<sup><small>10</small></sup></html>",
                                                   null, null, null))
                        .physical(new PhysicalData("637-780", "1035-1135", null,
                                                   null, 12.9))
                        .metadata(new Metadata(2000, "Scientists at the Joint Institute for Nuclear Research in Dubna, Russia, along with scientists from the U.S. Department of Energy's Lawrence Livermore National Laboratory",
                                               "54100-71-9", "https://pubchem.ncbi.nlm.nih.gov/element/Livermorium",
                                               "https://en.wikipedia.org/wiki/Livermorium"))
                        .build()),
    TENNESSINE(new ElementBuilder()
                       .basic(new BasicData(Keys.Elements.TENNESSINE, "Ts", 117, 294.211, null,
                                            17, 7, Keys.ElementProperties.HALOGEN))
                       .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.SOLID,
                                                  List.of("+5", "+3", "+1", "-1"), 7, "p-block",
                                                  "<html>[Rn]7s<sup><small>2</small></sup>7p<sup><small>5</small></sup>5f<sup><small>14</small></sup>6d<sup><small>10</small></sup></html>",
                                                  null, null, null))
                       .physical(new PhysicalData("623-823", "883", null,
                                                  null, 7.2))
                       .metadata(new Metadata(2010, "Scientists at the Joint Institute for Nuclear Research in Dubna, Russia, along with scientists from the U.S. Department of Energy's Lawrence Livermore National Laboratory and Oak Ridge National Laboratory",
                                              "54101-14-3", "https://pubchem.ncbi.nlm.nih.gov/element/Tennessine",
                                              "https://en.wikipedia.org/wiki/Tennessine"))
                       .build()),
    OGANESSON(new ElementBuilder()
                      .basic(new BasicData(Keys.Elements.OGANESSON, "Og", 118, 295.216, null,
                                           18, 7, Keys.ElementProperties.NOBLE_GAS))
                      .chemical(new ChemicalData(Keys.ElementProperties.SYNTHETIC, Keys.ElementProperties.GAS,
                                                 List.of("+6", "+4", "+2", "+1", "0", "-1"),
                                                 7, "p-block",
                                                 "<html>[Rn]7s<sup><small>2</small></sup>7p<sup><small>6</small></sup>5f<sup><small>14</small></sup>6d<sup><small>10</small></sup></html>",
                                                 null, null, null))
                      .physical(new PhysicalData(null, "350±30", null,
                                                 null, 7.0))
                      .metadata(new Metadata(2006, "Scientists at the Joint Institute for Nuclear Research in Dubna, Russia, along with scientists from the U.S. Department of Energy's Lawrence Livermore National Laboratory",
                                             "54144-19-3", "https://pubchem.ncbi.nlm.nih.gov/element/Oganesson",
                                             "https://en.wikipedia.org/wiki/Oganesson"))
                      .build());


    private final Element element;

    Elements(Element element) {
        this.element = element;
    }

    public Element get() {
        return element;
    }

}
