// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

final class bsj extends View
{

    static final float a[][] = {
        {
            0.0F, 0.0F, 0.0F
        }, {
            0.4F, 0.0F, 0.0F
        }, {
            0.6F, 0.4F, 0.0F
        }, {
            0.8F, 0.6F, 0.4F
        }, {
            1.0F, 0.8F, 0.6F
        }, {
            1.0F, 1.0F, 1.0F
        }
    };
    static final float b[][] = {
        {
            0.0F, 0.0F, 0.0F
        }, {
            0.25F, 0.0F, 0.0F
        }, {
            0.5F, 0.25F, 0.0F
        }, {
            0.75F, 0.5F, 0.25F
        }, {
            1.0F, 0.75F, 0.5F
        }, {
            1.0F, 1.0F, 1.0F
        }
    };
    static final int c[];
    private ImageView d[];
    private int e;

    bsj(Context context, ViewGroup viewgroup)
    {
        super(context);
        inflate(getContext(), g.gm, viewgroup);
        d = new ImageView[c.length];
        for (int i = 0; i < c.length; i++)
        {
            d[i] = (ImageView)viewgroup.findViewById(c[i]);
        }

        e = 0;
    }

    static 
    {
        c = (new int[] {
            h.cD, h.cE, h.cF
        });
    }
}
