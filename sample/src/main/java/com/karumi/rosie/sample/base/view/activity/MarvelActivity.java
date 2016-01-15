/*
 *  Copyright (C) 2015 Karumi.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.karumi.rosie.sample.base.view.activity;

import android.support.annotation.Nullable;
import butterknife.OnClick;
import com.karumi.rosie.sample.R;
import com.karumi.rosie.view.RosieActivity;

public abstract class MarvelActivity extends RosieActivity {
  @Override protected abstract int getLayoutId();

  @Nullable @OnClick(R.id.iv_toolbar_back) public void onBackButtonClicked() {
    finish();
  }

}
