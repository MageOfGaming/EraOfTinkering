package com.eraoftinkering.datagen;

import com.eraoftinkering.registries.Items;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractStationSlotLayoutProvider;
import slimeknights.tconstruct.tools.TinkerToolParts;

public class EomToolSlotLayout extends AbstractStationSlotLayoutProvider {
    public EomToolSlotLayout(DataGenerator generator) {
        super(generator);
    }

    /**
     * Function to add all relevant layouts
     */
    @Override
    protected void addLayouts() {
        defineModifiable(Items.SAW)
                .sortIndex(SORT_HARVEST)
                .addInputItem(TinkerToolParts.broadBlade, 46, 38)
                .addInputItem(TinkerToolParts.toolHandle, 28, 56)
                .build();

        defineModifiable(Items.HAMMER)
                .sortIndex(SORT_HARVEST)
                .addInputItem(TinkerToolParts.hammerHead, 28, 38)
                .addInputItem(TinkerToolParts.toolHandle, 46, 56)
                .build();

        defineModifiable(Items.FILE)
                .sortIndex(SORT_HARVEST)
                .addInputItem(TinkerToolParts.smallBlade, 28, 38)
                .addInputItem(TinkerToolParts.toughHandle, 46, 56)
                .build();

        defineModifiable(Items.SCREWDRIVER)
                .sortIndex(SORT_HARVEST)
                .addInputItem(TinkerToolParts.broadBlade, 46, 38)
                .addInputItem(TinkerToolParts.toughHandle, 28, 56)
                .build();

        defineModifiable(Items.WRENCH)
                .sortIndex(SORT_HARVEST)
                .addInputItem(Items.WRENCH_HEAD, 46, 38)
                .addInputItem(TinkerToolParts.toughHandle, 28, 56)
                .build();
    }

    @Override
    public String getName() {
        return "Era of Tinkering Tool Station layout";
    }
}
