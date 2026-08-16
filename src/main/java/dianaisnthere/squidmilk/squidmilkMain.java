package dianaisnthere.squidmilk;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class squidmilkMain implements ModInitializer, ClientModInitializer {

	//public static final String MOD_ID = HalpLibe.registerMod("squidmilk", true);
	//public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//private static final Key KEY = Key.of(MOD_ID);

	@Override
	public void onInitialize() {

		//CommonEvents.RECIPES_NAMESPACE_INIT.listen(KEY, () -> {
		//	RecipeBuilder.initNameSpace(MOD_ID);
		//	RecipeBuilder.getRecipeNamespace(MOD_ID);
		//});

		//LOGGER.info("Squid Milk initialized");
	}

	@Override
	public void onInitializeClient() {
		//LOGGER.info("SDOF initialized client");
	}
}
