package io.github.toygurkutlu.periodic_table.records;

/**
 * Basic data of the element.
 *
 * @param name              the nameKey of the element
 * @param symbol            the symbol of the element
 * @param atomicNumber      the atomic number of the element
 * @param atomicMass        the atomic mass of the element as {@code u}
 * @param vanDerWaalsRadius the Van Der Waals radius as {@code pm}
 * @param groupNumber       the group number of the element, represents also x position of the element according to the periodic table
 * @param periodNumber      the period number of the element, represents also y position of the element according to the periodic table
 * @param elementClass    the classification of the element
 * @see ChemicalData
 * @see PhysicalData
 * @see Metadata
 */
public record BasicData(
        String name,
        String symbol,
        int atomicNumber,
        double atomicMass,
        Integer vanDerWaalsRadius,
        int groupNumber,
        int periodNumber,
        String elementClass
) {
}