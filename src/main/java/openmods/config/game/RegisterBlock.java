package openmods.config.game;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import openmods.item.ItemOpenBlock;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RegisterBlock {
	String DEFAULT = "[default]";
	String NONE = "[none]";

	@interface RegisterTileEntity {
		String name();

		Class<? extends TileEntity> cls();

		boolean main() default false;
	}

	// if left default, will use field type
	Class<? extends Block> type() default Block.class;

	String id();

	boolean registerItemBlock() default true;

	Class<? extends ItemBlock> itemBlock() default ItemOpenBlock.class;

	Class<? extends TileEntity> tileEntity() default TileEntity.class;

	RegisterTileEntity[] tileEntities() default {};

	String unlocalizedName() default DEFAULT;

	boolean isEnabled() default true;

	boolean isConfigurable() default true;

	boolean registerDefaultItemModel() default true;

	boolean addToModCreativeTab() default true;

	Class<? extends ICustomItemModelProvider> customItemModels() default ICustomItemModelProvider.class;

	String[] legacyIds() default {};
}
