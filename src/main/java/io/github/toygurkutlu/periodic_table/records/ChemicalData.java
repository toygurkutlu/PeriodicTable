package io.github.toygurkutlu.periodic_table.records;

import java.util.List;

/**
 * Chemical data of the element. All data are taken from the element's PubChem and Wikipedia page.
 *
 * @param naturalOccurrence the occurrence of the element in the nature, taken from Wikipedia
 * @param standardState     the standard state (phase) of the element, taken from PubChem
 * @param oxidationStates the oxidation states of the element, taken from PubChem
 * @param period                the period of the element, taken from PubChem
 * @param block the end block of the electron configuration, taken from PubChem
 * @param electronConfiguration the electron configuration of the element, taken from PubChem
 * @param electronegativity the Pauling Scale Electronegativity as {@code Pauling Scale}, taken from PubChem
 * @param electronAffinity the electron affinity of the element as {@code eV}, taken from PubChem (R.T Myers, J. Chem. Edu., 1990)
 * @param ionizationEnergy the ionization energy of the element as {@code eV}, taken from PubChem (Jefferson Lab, U.S. Department of Energy)
 * @see BasicData
 * @see PhysicalData
 * @see Metadata
 * */
public record ChemicalData(
        String naturalOccurrence,
        String standardState,
        List<String> oxidationStates,
        int period,
        String block,
        String electronConfiguration,
        Double electronegativity,
        Double electronAffinity,
        Double ionizationEnergy
) {
}
