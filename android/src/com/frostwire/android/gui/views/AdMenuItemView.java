/*

 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011-2016, FrostWire(R). All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.frostwire.android.gui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.frostwire.android.R;

/**
 * @author gubatron
 * @author aldenml
 *
 */
public class AdMenuItemView extends RelativeLayout {

    private TextView textThumbnail;
    private TextView textHeadline;
    private TextView textSubtitle;
    private RelativeLayout menuAd;

    public AdMenuItemView(Context context, AttributeSet set) {
        super(context, set);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        View.inflate(getContext(), R.layout.view_ad_menuitem, this);

        if (isInEditMode()) {
            return;
        }

        menuAd = (RelativeLayout) findViewById(R.id.view_ad_menu_item_ad);
        textHeadline = (TextView) findViewById(R.id.view_ad_menu_item_headline);
        textSubtitle = (TextView) findViewById(R.id.view_ad_menu_item_subtitle);
        textThumbnail = (TextView) findViewById(R.id.view_ad_menu_item_thumbnail);

        textHeadline.setText(R.string.support_frostwire);
        textSubtitle.setText(R.string.save_bandwidth);
        textThumbnail.setText(R.string.ad_free);
    }
}

