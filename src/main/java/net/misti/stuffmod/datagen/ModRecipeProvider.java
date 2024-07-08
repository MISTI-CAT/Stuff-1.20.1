package net.misti.stuffmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.misti.stuffmod.StuffMod;
import net.misti.stuffmod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.RUNE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_SWORD), Ingredient.ofItems(Items.NETHERITE_INGOT), RecipeCategory.MISC, ModItems.RUNESWORD)
                .criterion(hasItem(ModItems.RUNE_TEMPLATE), conditionsFromItem(ModItems.RUNE_TEMPLATE))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, Identifier.of(StuffMod.MOD_ID, "netherite_sword_to_rune_sword"));
    }
}
