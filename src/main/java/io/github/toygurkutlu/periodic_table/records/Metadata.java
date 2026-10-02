package io.github.toygurkutlu.periodic_table.records;

/**
 * Metadata of the element.
 *
 * @param yearDiscovered the discovered year of the element
 * @param discoverer     the discoverer of the element
 * @param casNo          the {@code  Chemical Abstracts Service (CAS)} number of the element
 * @param pubChemURL     the PubChem link of the element
 * @param wikipediaURL   the Wikipedia link of the element
 * @see BasicData
 * @see ChemicalData
 * @see PhysicalData
 */
public record Metadata(int yearDiscovered,
                       String discoverer,
                       String casNo,
                       String pubChemURL,
                       String wikipediaURL) {

}
