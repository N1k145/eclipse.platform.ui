/*******************************************************************************
 * Copyright (c) 2006, 2015 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.core.databinding.observable;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;

/**
 * Listener for generic change events. Note that the change events do not carry
 * information about the change, they only specify the affected observable. To
 * listen for specific change events, use more specific change listeners.
 *
 * @see IValueChangeListener
 * @see IListChangeListener
 * @see ISetChangeListener
 * @see IMapChangeListener
 *
 * @since 1.0
 */
@FunctionalInterface
public interface IChangeListener extends IObservablesListener {

	/**
	 * Handle a generic change to the given observable. The given event object
	 * must only be used locally in this method because it may be reused for
	 * other change notifications.
	 *
	 * @param event
	 */
	public void handleChange(ChangeEvent event);

}
