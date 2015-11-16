// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ahb;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import aoa;
import cgd;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            AvatarView

public class FixedParticipantsGalleryView extends LinearLayout
{

    private final int a;
    private final int b;
    private final int c;

    public FixedParticipantsGalleryView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getTheme().obtainStyledAttributes(attributeset, ahb.t, 0, 0);
        a = context.getDimensionPixelSize(ahb.v, 1);
        b = context.getDimensionPixelSize(ahb.u, 0);
        c = context.getInt(ahb.y, 100);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public void a()
    {
        removeAllViews();
    }

    public void a(aoa aoa, List list, cgd cgd1)
    {
        removeAllViews();
        if (list != null)
        {
            list = list.iterator();
            int i = 0;
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = (cgd)list.next();
                if (cgd1 == null || !cgd1.a(((cgd) (obj))))
                {
                    AvatarView avatarview = new AvatarView(getContext());
                    avatarview.a(((cgd) (obj)), aoa);
                    obj = new android.widget.LinearLayout.LayoutParams(a, a, 1.0F);
                    ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(b, b, b, b);
                    obj.gravity = 16;
                    obj.weight = 0.0F;
                    avatarview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                    addView(avatarview);
                    i++;
                }
            } while (i < c);
        }
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int l1 = getChildCount();
        int k1 = Math.min((k - i) / (b + a), l1);
        int i1 = 0;
        int j1;
        do
        {
            j1 = k1;
            if (i1 >= k1)
            {
                break;
            }
            getChildAt(i1).setVisibility(0);
            i1++;
        } while (true);
        for (; j1 < l1; j1++)
        {
            getChildAt(j1).setVisibility(8);
        }

        super.onLayout(flag, i, j, k, l);
    }
}
