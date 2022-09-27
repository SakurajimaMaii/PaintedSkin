package org.alee.demo.skin.compat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.alee.component.skin.factory2.IExpandedFactory2;
import org.alee.component.skin.service.ThemeSkinService;
import org.alee.demo.skin.basic.ability.widget.BackButton;

/**
 * 摘要
 *
 * <p> 详细描述
 *
 * @author MingYu.Liu
 * created in 2022/9/23
 */
public final class BackButtonCompat {

    public static void init() {
        ThemeSkinService.getInstance().getCreateViewInterceptor().add(new BackButtonFactory());
    }


    private static class BackButtonFactory implements IExpandedFactory2 {

        /**
         * {@link BackButton} 类名
         */
        private final static String CLASS_NAME = BackButton.class.getName();

        /**
         * 创建View
         *
         * @param originalView 上一个IExpandedFactory生成的View
         * @param parent       父View
         * @param name         名称
         * @param context      {@link Context}
         * @param attrs        {@link AttributeSet}
         *
         * @return 生成的View
         */
        @NonNull
        @Override
        public View onCreateView(@Nullable View originalView, @Nullable View parent, @NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
            return TextUtils.equals(CLASS_NAME, name) ? new BackButton(context, attrs) : originalView;
        }
    }
}