package openmods.gui.listener;

import openmods.gui.component.BaseComponent;

@FunctionalInterface
public interface IMouseDownListener extends IListenerBase {
	void componentMouseDown(BaseComponent component, int x, int y, int button);
}