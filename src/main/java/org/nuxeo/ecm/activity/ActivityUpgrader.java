/*
 * (C) Copyright 2012 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Thomas Roger (troger@nuxeo.com)
 */

package org.nuxeo.ecm.activity;

/**
 * Helper to do upgrades on the existing Activities if needed.
 *
 * @author <a href="mailto:troger@nuxeo.com">Thomas Roger</a>
 * @since 5.7
 */
public interface ActivityUpgrader {

    void setName(String name);

    String getName();

    void setOrder(int order);

    int getOrder();

    /**
     * Do the actual upgrade of the existing activities.
     */
    void doUpgrade(ActivityStreamService activityStreamService);
}
