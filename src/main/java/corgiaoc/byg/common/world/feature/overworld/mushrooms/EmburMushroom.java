package corgiaoc.byg.common.world.feature.overworld.mushrooms;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGMushroomConfig;
import corgiaoc.byg.common.world.feature.overworld.mushrooms.util.BYGAbstractMushroomFeature;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class EmburMushroom extends BYGAbstractMushroomFeature<BYGMushroomConfig> {

    public EmburMushroom(Codec<BYGMushroomConfig> configIn) {
        super(configIn);
    }

    protected boolean placeMushroom(ISeedReader worldIn, Random rand, BlockPos pos, boolean isMushroom, BYGMushroomConfig config) {
        BlockState STEM = config.getStemProvider().getState(rand, pos);
        BlockState MUSHROOM = config.getMushroomProvider().getState(rand, pos);
        BlockState MUSHROOM2 = config.getMushroom2Provider().getState(rand, pos);
        BlockState MUSHROOM3 = config.getMushroom3Provider().getState(rand, pos);
        BlockState POLLEN = config.getPollenProvider().getState(rand, pos);
        int randTreeHeight = 14 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxBuildHeight()) {
            if (!isDesiredGroundwDirtTag(config, worldIn, pos.below(), BYGBlocks.EMBUR_NYLIUM)) {
                return false;
            } else if (!this.isAnotherMushroomLikeThisNearby(worldIn, pos, randTreeHeight, 0, STEM.getBlock(), MUSHROOM.getBlock(), isMushroom)) {
                return false;
            } else if (!this.doesMushroomHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isMushroom)) {
                return false;
            } else {
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 0, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 1, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 2, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 3, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 4, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 5, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 6, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 7, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 8, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 9, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 10, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 11, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 12, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 13, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 14, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 3, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 4, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 4, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 5, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 5, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(5, 6, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 6, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 6, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 6, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 7, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(5, 7, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 7, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 7, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 8, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(4, 8, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 8, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(3, 9, -3));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 9, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 9, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 10, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 10, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 10, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 11, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 11, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 12, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 13, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 14, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 14, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 15, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 15, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 15, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 15, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 16, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 16, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 17, -2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(2, 17, 2));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-2, 18, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 5, -4));
                this.leafs2(worldIn, mainmutable.set(pos).move(6, 5, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(7, 5, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 5, -3));
                this.leafs2(worldIn, mainmutable.set(pos).move(5, 5, -3));
                this.leafs2(worldIn, mainmutable.set(pos).move(6, 5, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(7, 5, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 5, -2));
                this.leafs2(worldIn, mainmutable.set(pos).move(4, 5, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(7, 5, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 5, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 5, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(6, 5, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 6, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 6, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(6, 6, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(6, 6, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(6, 6, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(6, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, 2));
                this.leafs2(worldIn, mainmutable.set(pos).move(1, 7, 2));
                this.leafs2(worldIn, mainmutable.set(pos).move(3, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 7, 3));
                this.leafs2(worldIn, mainmutable.set(pos).move(3, 7, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 7, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 7, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 7, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 7, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 9, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 11, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 11, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, -3));
                this.leafs2(worldIn, mainmutable.set(pos).move(2, 11, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 11, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, -2));
                this.leafs2(worldIn, mainmutable.set(pos).move(2, 11, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 11, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, -1));
                this.leafs2(worldIn, mainmutable.set(pos).move(0, 11, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 11, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -1));
                this.leafs2(worldIn, mainmutable.set(pos).move(-2, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 13, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, 1));
                this.leafs2(worldIn, mainmutable.set(pos).move(-2, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, 3));
                this.leafs2(worldIn, mainmutable.set(pos).move(-2, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 14, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 17, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, 1));
                this.leafs2(worldIn, mainmutable.set(pos).move(1, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, 2));
                this.leafs2(worldIn, mainmutable.set(pos).move(1, 17, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 17, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, 3));
                this.leafs2(worldIn, mainmutable.set(pos).move(3, 17, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 17, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 17, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 18, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 18, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 18, -3));
                this.leafs2(worldIn, mainmutable.set(pos).move(-3, 18, -3));
                this.leafs2(worldIn, mainmutable.set(pos).move(-2, 18, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 18, -2));
                this.leafs2(worldIn, mainmutable.set(pos).move(-1, 18, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 18, -1));
                this.leafs2(worldIn, mainmutable.set(pos).move(-2, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 18, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 18, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 18, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 18, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 18, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 19, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 19, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 19, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 19, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 19, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 19, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 20, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 20, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 20, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 20, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 20, -1));
            }
        }
        return true;
    }

    private void leafs2(ISeedReader reader, BlockPos pos) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(reader, pos, Blocks.SHROOMLIGHT.defaultBlockState());
        }
    }
}