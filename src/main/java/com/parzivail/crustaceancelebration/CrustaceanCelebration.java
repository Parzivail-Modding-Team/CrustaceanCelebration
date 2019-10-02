package com.parzivail.crustaceancelebration;

import com.parzivail.crustaceancelebration.item.ItemCRecord;
import com.parzivail.crustaceancelebration.sound.SoundBank;
import com.parzivail.crustaceancelebration_gen.Version;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = CrustaceanCelebration.MODID, version = Version.VERSION)
public class CrustaceanCelebration
{
	public static final String MODID = "crustaceancelebration";
	private ItemCRecord recordCelebration;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(SoundBank.class);
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> r = event.getRegistry();
		r.register(recordCelebration = new ItemCRecord("celebration", SoundBank.RECORD_CELEBRATION));
	}

	@SubscribeEvent
	public void registerRenders(ModelRegistryEvent event)
	{
		registerRender(recordCelebration);
	}

	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
