package openmods.sync;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import openmods.interfaces.IProxy;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public interface ISyncableObject {
	public boolean isDirty();

	public void markClean();

	public void markDirty();

	public void readFromStream(DataInput stream) throws IOException;

	public void writeToStream(DataOutput stream, boolean fullData) throws IOException;

	public void resetChangeTimer(IProxy proxy, World world);

	public int getTicksSinceChange(IProxy proxy, World world);

	public void writeToNBT(NBTTagCompound nbt, String name);

	public void readFromNBT(NBTTagCompound nbt, String name);
}
