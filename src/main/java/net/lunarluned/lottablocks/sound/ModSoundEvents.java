package net.lunarluned.lottablocks.sound;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.lunarluned.lottablocks.LottaBlocks;

public class ModSoundEvents {

// Sound Registry:

    // - Block Sounds:

    public static final SoundEvent BLOCK_AMETHYST_BRICKS_BREAK = registerSoundEvent("block.amethyst_bricks.break");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_STEP = registerSoundEvent("block.amethyst_bricks.step");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_PLACE = registerSoundEvent("block.amethyst_bricks.place");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_HIT = registerSoundEvent("block.amethyst_bricks.hit");
    public static final SoundEvent BLOCK_AMETHYST_BRICKS_FALL = registerSoundEvent("block.amethyst_bricks.fall");

    public static final SoundEvent BLOCK_TUFF_BRICKS_BREAK = registerSoundEvent("block.tuff_bricks.break");
    public static final SoundEvent BLOCK_TUFF_BRICKS_STEP = registerSoundEvent("block.tuff_bricks.step");
    public static final SoundEvent BLOCK_TUFF_BRICKS_PLACE = registerSoundEvent("block.tuff_bricks.place");
    public static final SoundEvent BLOCK_TUFF_BRICKS_HIT = registerSoundEvent("block.tuff_bricks.hit");
    public static final SoundEvent BLOCK_TUFF_BRICKS_FALL = registerSoundEvent("block.tuff_bricks.fall");

    public static final SoundEvent BLOCK_LAVA_LAMP_BREAK = registerSoundEvent("block.lava_lamp.break");
    public static final SoundEvent BLOCK_LAVA_LAMP_STEP = registerSoundEvent("block.lava_lamp.step");
    public static final SoundEvent BLOCK_LAVA_LAMP_PLACE = registerSoundEvent("block.lava_lamp.place");
    public static final SoundEvent BLOCK_LAVA_LAMP_HIT = registerSoundEvent("block.lava_lamp.hit");
    public static final SoundEvent BLOCK_LAVA_LAMP_FALL = registerSoundEvent("block.lava_lamp.fall");

    public static final SoundEvent BLOCK_PAPER_LANTERN_BREAK = registerSoundEvent("block.paper_lantern.break");
    public static final SoundEvent BLOCK_PAPER_LANTERN_STEP = registerSoundEvent("block.paper_lantern.step");
    public static final SoundEvent BLOCK_PAPER_LANTERN_PLACE = registerSoundEvent("block.paper_lantern.place");
    public static final SoundEvent BLOCK_PAPER_LANTERN_HIT = registerSoundEvent("block.paper_lantern.hit");
    public static final SoundEvent BLOCK_PAPER_LANTERN_FALL = registerSoundEvent("block.paper_lantern.fall");

    // Sound Groups:

    public static final SoundType AMETHYST_BRICKS = new SoundType(1f, 1f,
    ModSoundEvents.BLOCK_AMETHYST_BRICKS_BREAK, ModSoundEvents.BLOCK_AMETHYST_BRICKS_STEP, ModSoundEvents.BLOCK_AMETHYST_BRICKS_PLACE,
    ModSoundEvents.BLOCK_AMETHYST_BRICKS_HIT, ModSoundEvents.BLOCK_AMETHYST_BRICKS_FALL);

    public static final SoundType TUFF_BRICKS = new SoundType(1f, 1f,
    ModSoundEvents.BLOCK_TUFF_BRICKS_BREAK, ModSoundEvents.BLOCK_TUFF_BRICKS_STEP, ModSoundEvents.BLOCK_TUFF_BRICKS_PLACE,
    ModSoundEvents.BLOCK_TUFF_BRICKS_HIT, ModSoundEvents.BLOCK_TUFF_BRICKS_FALL);

    public static final SoundType LAVA_LAMP = new SoundType(1f, 1f,
    ModSoundEvents.BLOCK_LAVA_LAMP_BREAK, ModSoundEvents.BLOCK_LAVA_LAMP_STEP, ModSoundEvents.BLOCK_LAVA_LAMP_PLACE,
    ModSoundEvents.BLOCK_LAVA_LAMP_HIT, ModSoundEvents.BLOCK_LAVA_LAMP_FALL);

    public static final SoundType PAPER_LANTERN = new SoundType(1f, 1f,
    ModSoundEvents.BLOCK_PAPER_LANTERN_BREAK, ModSoundEvents.BLOCK_PAPER_LANTERN_STEP, ModSoundEvents.BLOCK_PAPER_LANTERN_PLACE,
    ModSoundEvents.BLOCK_PAPER_LANTERN_HIT, ModSoundEvents.BLOCK_PAPER_LANTERN_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(LottaBlocks.MOD_ID, name);
        SoundEvent se = SoundEvent.createVariableRangeEvent(id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, se);
    }

    public static void registerSounds() {
        System.out.println("Registering Sounds for " + LottaBlocks.MOD_ID);
    }
}
