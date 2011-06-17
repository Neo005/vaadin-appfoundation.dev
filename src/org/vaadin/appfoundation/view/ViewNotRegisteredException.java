package org.vaadin.appfoundation.view;

/**
 * This exception is thrown, if we try to activate a view which hasn't been
 * registered.
 * 
 * @author Kim
 * 
 */
public class ViewNotRegisteredException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8596133476108114648L;

	private Object viewId;

	public ViewNotRegisteredException() {
		super("A view must be registered before it can be activated");
	}

	/**
	 * Set the viewId of the view which hasn't been registered
	 * 
	 * @param viewId
	 */
	public void setViewId(Object viewId) {
		this.viewId = viewId;
	}

	/**
	 * Get the viewId of the view which wasn't registered before activation.
	 * 
	 * @return
	 */
	public Object getViewId() {
		return viewId;
	}

}
