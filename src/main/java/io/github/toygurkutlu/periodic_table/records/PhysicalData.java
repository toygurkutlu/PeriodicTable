package io.github.toygurkutlu.periodic_table.records;

/**
 * The physical data of the element. All data are taken from the element's PubChem and Wikipedia page.
 *
 * @param meltingPoint         the melting point of the element as {@code K (Kelvin)}, taken from PubChem
 * @param boilingPoint         the boiling point of the element as {@code K (Kelvin)}, taken from PubChem
 * @param molarHeatCapacity    the molar heat capacity of the element as {@code J/(mol·K)}, taken from Wikipedia
 * @param specificHeatCapacity the specific heat capacity of the element as {@code J/(kg·K)}, taken from Wikipedia
 * @param density              the density of the element as {@code g/cm3}, taken from PubChem
 * @see BasicData
 * @see ChemicalData
 * @see Metadata
 */
public record PhysicalData(
        String meltingPoint,
        String boilingPoint,
        Double molarHeatCapacity,
        Double specificHeatCapacity,
        Double density
) {

}
