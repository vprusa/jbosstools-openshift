/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.openshift.io.core.model;

public class AccountModelAdapter implements IAccountModelListener {

	@Override
	public void accountAdded(IAccountModel source, IAccount account) {
	}

	@Override
	public void accountRemoved(IAccountModel source, IAccount account) {
	}

	@Override
	public void clusterAdded(IAccountModel source, ICluster cluster) {
	}

	@Override
	public void clusterRemoved(IAccountModel source, ICluster cluster) {
	}
}
