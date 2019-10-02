package com.parzivail.crustaceancelebration.sound;

import com.parzivail.crustaceancelebration.CrustaceanCelebration;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class SoundBank
{
	public static SoundEvent RECORD_CELEBRATION = registerSound("record.celebration");

	@SubscribeEvent
	public static void registerSoundEvents(RegistryEvent.Register<SoundEvent> event)
	{
		IForgeRegistry<SoundEvent> r = event.getRegistry();
		r.register(RECORD_CELEBRATION);
	}

	private static SoundEvent registerSound(String soundId)
	{
		return new SoundEvent(new ResourceLocation(CrustaceanCelebration.MODID, soundId)).setRegistryName(soundId);
	}
}
