package io.github.toygurkutlu.periodic_table;

import io.github.toygurkutlu.periodic_table.records.*;

public class ElementBuilder {

    private BasicData basic;
    private ChemicalData chemical;
    private PhysicalData physical;
    private Metadata metadata;

    public ElementBuilder basic(BasicData basic) {
        this.basic = basic;
        return this;
    }

    public ElementBuilder chemical(ChemicalData chemical) {
        this.chemical = chemical;
        return this;
    }

    public ElementBuilder physical(PhysicalData physical) {
        this.physical = physical;
        return this;
    }

    public ElementBuilder metadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Element build() {
        return new Element(basic, chemical, physical, metadata);
    }
}