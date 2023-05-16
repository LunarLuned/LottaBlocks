package net.lunarluned.lottablocks.block.custom_blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class LavaLampBlock extends ModPillarBlock {
    public LavaLampBlock(Properties settings) {
        super(settings);
    }

    public void animateTick(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, RandomSource randomSource) {
        if (randomSource.nextInt(200) == 0) {
            level.playLocalSound((double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 0.5D, (double) blockPos.getZ() + 0.5D, SoundEvents.LAVA_AMBIENT, SoundSource.BLOCKS, 1.0F, randomSource.nextFloat() * 0.4F + 0.8F, false);
        }
    }
}
