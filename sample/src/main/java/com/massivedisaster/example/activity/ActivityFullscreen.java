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

import android.support.v4.app.Fragment;

import com.massivedisaster.activitymanager.AbstractFragmentActivity;
import com.massivedisaster.example.activitymanager.R;
import com.massivedisaster.example.fragment.FragmentSplash;

/**
 * Activity in fullscreen mode.
 */
public class ActivityFullscreen extends AbstractFragmentActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fullscreen;
    }

    @Override
    protected int getContainerViewId() {
        return R.id.frmContainer;
    }

    @Override
    protected Class<? extends Fragment> getDefaultFragment() {
        return FragmentSplash.class;
    }
}
