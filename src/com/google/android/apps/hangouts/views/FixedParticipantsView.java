// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ahj;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import ani;
import ceu;
import cfa;
import eef;
import g;
import gbh;
import h;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            AvatarView

public class FixedParticipantsView extends LinearLayout
{

    private static final double a = Math.sqrt(2D);
    private static final double b = Math.sqrt(3D);
    private final LinearLayout c;
    private final LinearLayout d;
    private final int e;
    private final int f;
    private final int g;
    private final TextView h;

    public FixedParticipantsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, ahj.t, 0, 0);
        e = attributeset.getDimensionPixelSize(ahj.v, 36);
        f = attributeset.getDimensionPixelSize(ahj.x, 36);
        g = attributeset.getDimensionPixelSize(ahj.w, 12);
        attributeset.recycle();
        LayoutInflater.from(context).inflate(g.fT, this, true);
        c = (LinearLayout)findViewById(h.by);
        d = (LinearLayout)findViewById(h.bz);
        h = (TextView)findViewById(h.bA);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public void a()
    {
        c.removeAllViews();
        d.removeAllViews();
        setContentDescription(null);
    }

    public void a(ani ani, List list)
    {
        AvatarView avatarview;
        Object obj;
        int i;
        int i1;
        int j1;
        int k1;
        a();
        if (list == null || list.size() == 0)
        {
            return;
        }
        k1 = list.size();
        cfa cfa1;
        byte byte0;
        if (k1 > 4)
        {
            i1 = 3;
        } else
        {
            i1 = k1;
        }
        if (k1 > 3)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        j1 = 0;
_L6:
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        avatarview = new AvatarView(getContext());
        obj = (ceu)list.get(j1);
        cfa1 = ((ceu) (obj)).a;
        eef.a[cfa1.ordinal()];
        JVM INSTR tableswitch 1 2: default 116
    //                   1 256
    //                   2 262;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_262;
_L1:
        i = 0;
_L4:
        avatarview.a(i);
        if (((ceu) (obj)).a == cfa.d)
        {
            gbh.a(((ceu) (obj)).g());
            avatarview.a(((ceu) (obj)).f(), false, ani);
        } else
        {
            avatarview.a(((ceu) (obj)).b, ani);
        }
        if (k1 == 1)
        {
            i = f;
        } else
        {
            i = e;
        }
        obj = new android.widget.LinearLayout.LayoutParams(i, i, 1.0F);
        if (k1 >= 4 || k1 == 1 || j1 == 0 && k1 == 2)
        {
            ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, 0, 0, 0);
        } else
        if (k1 == 3 && j1 == 0)
        {
            ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(e / 2, 0, e / 2, 0);
        } else
        if (k1 == 3 && (j1 == 1 || j1 == 2))
        {
            int j = (int)Math.ceil((double)(e / 2) * b);
            ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, (e - j) * -1, 0, 0);
        } else
        if (k1 == 2 && j1 == 1)
        {
            int k = (int)Math.abs((double)e / a);
            ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(k, (e - k) * -1, 0, 0);
        } else
        {
            gbh.a("Incorrect avatar margin layout being calculated");
        }
        avatarview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        if (j1 < byte0)
        {
            c.addView(avatarview);
        } else
        {
            d.addView(avatarview);
        }
        j1++;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 1;
          goto _L4
        i = 2;
          goto _L4
        if (k1 > 4)
        {
            h.setLayoutParams(new android.widget.LinearLayout.LayoutParams(e, e, 1.0F));
            h.setTextSize(g);
            h.setText(String.valueOf(k1 - 3));
            h.setVisibility(0);
            d.addView(h);
        }
        ani = new String[list.size()];
        list = list.iterator();
        for (int l = 0; list.hasNext(); l++)
        {
            ani[l] = ((ceu)list.next()).e;
        }

        setContentDescription(g.a(ani, i1));
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
