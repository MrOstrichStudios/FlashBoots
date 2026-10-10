package mc.mrostrich.flashboots;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mc.mrostrich.flashboots.ModItems;

public class FlashBoots implements ModInitializer {
	public static final String MOD_ID = "flashboots";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		 ModItems.registerItems();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
