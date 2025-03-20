package net.codingcats.emmys.item;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> EMERALD_ARMOR_MATERIAL = register("emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            attribute.put(ArmorItem.Type.BOOTS, 5);
            attribute.put(ArmorItem.Type.LEGGINGS, 7);
            attribute.put(ArmorItem.Type.CHESTPLATE, 9);
            attribute.put(ArmorItem.Type.HELMET, 5);
            attribute.put(ArmorItem.Type.BODY, 11);
            }), 16, 2, 0.1f, () -> );
