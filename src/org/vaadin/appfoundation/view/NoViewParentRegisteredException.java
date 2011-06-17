package org.vaadin.appfoundation.view;

/**
 * This exception is thrown, if we try to activate a view through the
 * ViewHandler, but a parent for the view hasn't been defined.
 * 
 * @author Kim
 * 
 */
public class NoViewParentRegisteredException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8596133476108114648L;

	private Object viewId;
	
	public NoViewParentRegisteredException() {
		super("A view must have a parent defined before it can be activated");
	}

	/**
	 * Set the viewId of the view which doesn't have a parent defined
	 * 
	 * @param viewId
	 */
	public void setViewId(Object viewId) {
		this.viewId = viewId;
	}

	/**
	 * Get the viewId of the view which couldn't be activated due to a missing
	 * parent
	 * 
	 * @return
	 */
	public Object getViewId() {
		return viewId;
	}

}
