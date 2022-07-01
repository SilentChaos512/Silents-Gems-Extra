package net.silentchaos512.extragems.setup;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.util.Lazy;
import net.silentchaos512.extragems.ExtraGemsMod;
import net.silentchaos512.gems.GemsBase;
import net.silentchaos512.gems.block.*;
import net.silentchaos512.gems.config.GemsConfig;
import net.silentchaos512.gems.config.OreConfig;
import net.silentchaos512.gems.item.GemBlockItem;
import net.silentchaos512.gems.item.GemItem;
import net.silentchaos512.gems.setup.Registration;
import net.silentchaos512.gems.util.Gems;
import net.silentchaos512.gems.world.GemsWorldFeatures;
import net.silentchaos512.lib.registry.BlockRegistryObject;
import net.silentchaos512.lib.registry.ItemRegistryObject;
import net.silentchaos512.lib.util.NameUtils;
import net.silentchaos512.utils.Color;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public enum ExtraGems {
    GARNET(0xE5381D, // 8
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    AMBER(0xE6A31D, // 39
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    GREEN_SAPPHIRE(0x1DE53F, // 130
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    PHOSPHOPHYLLITE(0x1DE682, // 150
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    AQUAMARINE(0x1DE6E6, // 180
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    TANZANITE(0x1D1DE5, // 240
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    AGATE(0xE61DE6, // 300
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    MORGANITE(0xFF89EB, // 310
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    ONYX(0x2F2F2F, // 0
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    OPAL(0xE4E4E4, // 0
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    JASPER(0xA38800, // 50
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    ZIRCON(0xA3A300, // 60
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    MALACHITE(0x00A035, // 140
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    EUCLASE(0x006BA0, // 200
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    BENITOITE(0x001BA3, // 230
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    LEPIDOLITE(0xA3007A, // 315
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    AMETRINE(0xA00050, // 330
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    MOONSTONE(0x898989, // 0
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    PYROPE(0xFF4574, // 345
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    CORAL(0xFF5545, // 5
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    SUNSTONE(0xFF7445, // 15
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    CATS_EYE(0xFFC145, // 40
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    YELLOW_DIAMOND(0xFFFF45, // 60
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    JADE(0xA2FF45, // 90
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    CHRYSOPRASE(0x64FF45, // 110
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    APATITE(0x45FFD1, // 165
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    FLUORITE(0x45D1FF, // 195
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    SODALITE(0x5445FF, // 245
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    KUNZITE(0xFF45E0, // 310
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    TEKTITE(0x8F7C6B, // 28
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    ),
    PEARL(0xE2E8F1, // 215
            Rarity.COMMON,
            OreConfig.empty(),
            OreConfig.empty(),
            OreConfig.empty()
    );

    private final Color color;
    private final Rarity rarity;

    // World/ore generation
    private final Map<ResourceKey<Level>, OreConfig.Defaults> oreConfigDefaults = new HashMap<>();
    private final Map<ResourceKey<Level>, OreConfig> oreConfigs = new HashMap<>();
    private final Map<ResourceKey<Level>, Lazy<Holder<ConfiguredFeature<OreConfiguration, ?>>>> oreConfiguredFeatures = new HashMap<>();
    private final Map<ResourceKey<Level>, Lazy<Holder<PlacedFeature>>> orePlacedFeatures = new HashMap<>();

    // Blocks
    BlockRegistryObject<GemOreBlock> ore;
    BlockRegistryObject<GemOreBlock> deepslateOre;
    BlockRegistryObject<GemOreBlock> netherOre;
    BlockRegistryObject<GemOreBlock> endOre;
    BlockRegistryObject<GemBlock> block;

    // Items
    ItemRegistryObject<GemItem> item;

    // Tags
    final TagKey<Block> blockTag;
    final TagKey<Block> oreTag;
    final TagKey<Block> modOresTag;
    final TagKey<Item> blockItemTag;
    final TagKey<Item> oreItemTag;
    final TagKey<Item> modOresItemTag;
    final TagKey<Item> itemTag;

    ExtraGems(int colorIn, Rarity rarity, OreConfig.Defaults overworldOres, OreConfig.Defaults netherOres, OreConfig.Defaults endOres) {
        this.color = new Color(colorIn);
        this.rarity = rarity;

        this.oreConfigDefaults.put(Level.OVERWORLD, overworldOres);
        this.oreConfigDefaults.put(Level.NETHER, netherOres);
        this.oreConfigDefaults.put(Level.END, endOres);

        for (ResourceKey<Level> level : List.of(Level.OVERWORLD, Level.NETHER, Level.END)) {
            this.oreConfiguredFeatures.put(level, Lazy.of(() -> createOreConfiguredFeature(level)));
            this.orePlacedFeatures.put(level, Lazy.of(() -> createOrePlacedFeature(level)));
        }

        String name = this.getName();
        this.blockTag = BlockTags.create(NameUtils.forgeId("storage_blocks/" + name));
        this.oreTag = BlockTags.create(NameUtils.forgeId("ores/" + name));
        this.modOresTag = BlockTags.create(ExtraGemsMod.getId("ores/" + name));

        this.blockItemTag = ItemTags.create(NameUtils.forgeId("storage_blocks/" + name));
        this.oreItemTag = ItemTags.create(NameUtils.forgeId("ores/" + name));
        this.modOresItemTag = ItemTags.create(ExtraGemsMod.getId("ores/" + name));
        this.itemTag = ItemTags.create(NameUtils.forgeId("gems/" + name));
    }

    public String getName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public int getColor() {
        return color.getColor();
    }

    public float[] getColorArray() {
        return new float[]{color.getRed(), color.getGreen(), color.getBlue()};
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Component getDisplayName() {
        return new TranslatableComponent("gem.silentgemsextra." + this.getName());
    }

    //region World generation

    public Holder<ConfiguredFeature<OreConfiguration, ?>> getOreConfiguredFeature(ResourceKey<Level> level) {
        return this.oreConfiguredFeatures.getOrDefault(level, this.oreConfiguredFeatures.get(Level.OVERWORLD)).get();
    }

    public Holder<PlacedFeature> getOrePlacedFeature(ResourceKey<Level> level) {
        return this.orePlacedFeatures.getOrDefault(level, this.orePlacedFeatures.get(Level.OVERWORLD)).get();
    }

    public OreConfig getOreConfig(ResourceKey<Level> level) {
        return this.oreConfigs.getOrDefault(level, this.oreConfigs.get(Level.OVERWORLD));
    }

    public OreConfig.Defaults getOreConfigDefaults(ResourceKey<Level> level) {
        return this.oreConfigDefaults.getOrDefault(level, this.oreConfigDefaults.get(Level.OVERWORLD));
    }

    public static void buildOreConfigs(ForgeConfigSpec.Builder builder) {
        for (ExtraGems gem : ExtraGems.values()) {
            gem.oreConfigs.put(Level.OVERWORLD, new OreConfig(builder,
                    gem.getName() + ".overworld",
                    gem.getOreConfigDefaults(Level.OVERWORLD)));
            gem.oreConfigs.put(Level.NETHER, new OreConfig(builder,
                    gem.getName() + ".the_nether",
                    gem.getOreConfigDefaults(Level.NETHER)));
            gem.oreConfigs.put(Level.END, new OreConfig(builder,
                    gem.getName() + ".the_end",
                    gem.getOreConfigDefaults(Level.END)));
        }
    }

    private Holder<ConfiguredFeature<OreConfiguration, ?>> createOreConfiguredFeature(ResourceKey<Level> level) {
        OreConfig config = this.getOreConfig(level);
        String configName;

        OreConfiguration oreConfiguration;
        if (level == Level.NETHER) {
            oreConfiguration = new OreConfiguration(OreFeatures.NETHERRACK, netherOre.get().defaultBlockState(), config.getSize(), config.getDiscardChanceOnAirExposure());
            configName = getName() + "_nether_ore";
        } else if (level == Level.END) {
            oreConfiguration = new OreConfiguration(GemsWorldFeatures.BASE_STONE_END, endOre.get().defaultBlockState(), config.getSize(), config.getDiscardChanceOnAirExposure());
            configName = getName() + "_end_ore";
        } else {
            ImmutableList<OreConfiguration.TargetBlockState> targetList = ImmutableList.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ore.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, deepslateOre.get().defaultBlockState()));
            oreConfiguration = new OreConfiguration(targetList, config.getSize(), config.getDiscardChanceOnAirExposure());
            configName = getName() + "_ore";
        }

        return FeatureUtils.register(ExtraGemsMod.MOD_ID + ":" + configName, Feature.ORE, oreConfiguration);
    }

    private Holder<PlacedFeature> createOrePlacedFeature(ResourceKey<Level> level) {
        OreConfig config = getOreConfig(level);
        Holder<ConfiguredFeature<OreConfiguration, ?>> configuredFeature = getOreConfiguredFeature(level);

        String configName;
        if (level == Level.NETHER) {
            configName = getName() + "_nether_ore";
        } else if (level == Level.END) {
            configName = getName() + "_end_ore";
        } else {
            configName = getName() + "_ore";
        }

        return PlacementUtils.register(ExtraGemsMod.MOD_ID + ":" + configName, configuredFeature, List.of(
                CountPlacement.of(config.getCount()),
                RarityFilter.onAverageOnceEvery(config.getRarity()),
                InSquarePlacement.spread(),
                HeightRangePlacement.triangle(VerticalAnchor.absolute(config.getMinHeight()), VerticalAnchor.absolute(config.getMaxHeight())),
                BiomeFilter.biome()
        ));
    }

    //endregion

    //region Block, Item, and Tag getters

    public GemOreBlock getOre() {
        return ore.get();
    }

    public GemOreBlock getDeepslateOre() {
        return deepslateOre.get();
    }

    public GemOreBlock getNetherOre() {
        return netherOre.get();
    }

    public GemOreBlock getEndOre() {
        return endOre.get();
    }

    public GemBlock getBlock() {
        return block.get();
    }

    public GemItem getItem() {
        return item.get();
    }

    public TagKey<Block> getOreTag() {
        return oreTag;
    }

    public TagKey<Block> getModOresTag() {
        return modOresTag;
    }

    public TagKey<Block> getBlockTag() {
        return blockTag;
    }

    public TagKey<Item> getOreItemTag() {
        return oreItemTag;
    }

    public TagKey<Item> getModOresItemTag() {
        return modOresItemTag;
    }

    public TagKey<Item> getBlockItemTag() {
        return blockItemTag;
    }

    public TagKey<Item> getItemTag() {
        return itemTag;
    }

    //endregion

    public static void registerBlocks() {
        for (ExtraGems gem : values())
            gem.ore = registerBlock(gem.getName() + "_ore", () ->
                    new GemOreBlock(gem, 2, "gem_ore", BlockBehaviour.Properties.of(Material.STONE)
                            .strength(3f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));

        for (ExtraGems gem : values())
            gem.deepslateOre = registerBlock("deepslate_" + gem.getName() + "_ore", () ->
                    new GemOreBlock(gem, 2, "deepslate_gem_ore", BlockBehaviour.Properties.copy(gem.ore.get())
                            .strength(4.5f, 3f)
                            .sound(SoundType.DEEPSLATE)));

        for (ExtraGems gem : values())
            gem.netherOre = registerBlock(gem.getName() + "_nether_ore", () ->
                    new GemOreBlock(gem, 3, "gem_nether_ore", BlockBehaviour.Properties.copy(gem.ore.get())
                            .strength(4f)
                            .sound(SoundType.NETHER_ORE)));

        for (ExtraGems gem : values())
            gem.endOre = registerBlock(gem.getName() + "_end_ore", () ->
                    new GemOreBlock(gem, 4, "gem_end_ore", BlockBehaviour.Properties.copy(gem.ore.get())
                            .strength(6f)));

        for (ExtraGems gem : values())
            gem.block = registerBlock(gem.getName() + "_block", () ->
                    new GemBlock(gem, "gem_block", BlockBehaviour.Properties.of(Material.METAL)
                            .strength(4, 30)
                            .sound(SoundType.METAL)));
    }

    public static void registerItems() {
        for (ExtraGems gem : values())
            gem.item = registerItem(gem.getName(), () ->
                    new GemItem(gem, "gem", new Item.Properties().tab(GemsBase.ITEM_GROUP)));
    }

    private static <T extends Block> BlockRegistryObject<T> registerBlockNoItem(String name, Supplier<T> block) {
        return new BlockRegistryObject<>(ExtraBlocks.BLOCKS.register(name, block));
    }

    private static <T extends Block> BlockRegistryObject<T> registerBlock(String name, Supplier<T> block) {
        return registerBlock(name, block, ExtraGems::defaultBlockItem);
    }

    private static <T extends Block> BlockRegistryObject<T> registerBlock(String name, Supplier<T> block, Function<BlockRegistryObject<T>, Supplier<BlockItem>> item) {
        BlockRegistryObject<T> ret = registerBlockNoItem(name, block);
        if (item != null) {
            ExtraItems.ITEMS.register(name, item.apply(ret));
        }
        return ret;
    }

    private static <T extends Item> ItemRegistryObject<T> registerItem(String name, Supplier<T> item) {
        return new ItemRegistryObject<>(ExtraItems.ITEMS.register(name, item));
    }

    private static Supplier<BlockItem> defaultBlockItem(BlockRegistryObject<?> block) {
        return () -> new GemBlockItem(block.get(), new Item.Properties().tab(GemsBase.ITEM_GROUP));
    }
}
