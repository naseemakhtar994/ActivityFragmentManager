/*
 * Activity Fragment Manager - A library to help android developer working easily with activities and fragments
 * Copyright (C) 2017 ActivityFragmentManager.
 *
 * ActivityFragmentManager is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or any later version.
 *
 * ActivityFragmentManager is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with ActivityFragmentManager. If not, see <http://www.gnu.org/licenses/>.
 */

package com.massivedisaster.example.activity;

import com.massivedisaster.activitymanager.AbstractFragmentActivity;
import com.massivedisaster.example.activitymanager.R;

/**
 * Activity Manager
 * Created by jms on 27/04/16.
 */
public class ActivityPrimaryTheme extends AbstractFragmentActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_primary;
    }

    @Override
    protected int getContainerViewId() {
        return R.id.frmContainer;
    }

}
