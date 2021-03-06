/*
 * Copyright 2016 Patrick J
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.pddstudio.networkingdemo.adapters.items;
/*
 * This Class was created by Patrick J
 * on 21.02.16. For more Details and licensing information
 * have a look at the README.md
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mikepenz.fastadapter.items.AbstractItem;
import com.pddstudio.networkingdemo.R;
import com.pddstudio.networkutils.model.ScanResult;

public class ScanResultItem extends AbstractItem<ScanResultItem, ScanResultItem.ViewHolder> {

    private final ScanResult scanResult;

    public ScanResultItem(ScanResult scanResult) {
        this.scanResult = scanResult;
    }

    @Override
    public int getType() {
        return R.id.scan_result_item;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_scan_result;
    }

    @Override
    public void bindView(ViewHolder viewHolder) {
        super.bindView(viewHolder);
        viewHolder.targetAddressView.setText(scanResult.getIpAddress());
        viewHolder.targetNameView.setText(scanResult.getHostName());
        viewHolder.targetReachableView.setText(scanResult.isReachable() + "");
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {

        TextView targetAddressView;
        TextView targetNameView;
        TextView targetReachableView;

        public ViewHolder(View itemView) {
            super(itemView);
            targetAddressView = (TextView) itemView.findViewById(R.id.targetAddressView);
            targetNameView = (TextView) itemView.findViewById(R.id.targetNameView);
            targetReachableView = (TextView) itemView.findViewById(R.id.targetReachableView);
        }
    }

}
