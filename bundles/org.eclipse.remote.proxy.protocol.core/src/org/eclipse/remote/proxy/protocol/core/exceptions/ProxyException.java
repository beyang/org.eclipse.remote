/*******************************************************************************
 * Copyright (c) 2016 Oak Ridge National Laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.remote.proxy.protocol.core.exceptions;

public class ProxyException extends Exception {

	private static final long serialVersionUID = 1L;

    public ProxyException(String message) {
        super(message);
    }
}
