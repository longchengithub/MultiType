/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.drakeet.multitype.sample.weibo.content;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import me.drakeet.multitype.sample.R;
import me.drakeet.multitype.sample.weibo.ContentHolder;
import me.drakeet.multitype.sample.weibo.WeiboFrameProvider;

/**
 * @author drakeet
 */
public class SimpleImageViewProvider
    extends WeiboFrameProvider<SimpleImage, SimpleImageViewProvider.ViewHolder> {

    @Override
    protected ContentHolder onCreateContentViewHolder(
        @NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View contentView = inflater.inflate(R.layout.item_weibo_simple_image, parent, false);
        return new ViewHolder(contentView);
    }


    @Override
    protected void onBindContentViewHolder(
        @NonNull ViewHolder holder, @NonNull SimpleImage simpleImage) {
        holder.simpleImage.setImageResource(simpleImage.resId);
    }


    static class ViewHolder extends ContentHolder {

        private ImageView simpleImage;


        ViewHolder(View itemView) {
            super(itemView);
            simpleImage = (ImageView) itemView.findViewById(R.id.simple_image);
        }
    }
}