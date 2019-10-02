package com.parzivail.crustaceancelebration.item;

import com.parzivail.crustaceancelebration.CrustaceanCelebration;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCRecord extends ItemRecord
{
	private final String displayName;

	public ItemCRecord(String name, SoundEvent soundIn)
	{
		super(name, soundIn);

		this.displayName = "item." + CrustaceanCelebration.MODID + ".record." + name + ".desc";

		setUnlocalizedName(CrustaceanCelebration.MODID + ".record");
		setRegistryName(CrustaceanCelebration.MODID + ":record_" + name);
	}

	@SideOnly(Side.CLIENT)
	public String getRecordNameLocal()
	{
		return I18n.translateToLocal(this.displayName);
	}
}
