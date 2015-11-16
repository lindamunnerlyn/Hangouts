// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import aoa;
import cbt;
import cgd;
import eep;
import g;
import h;
import java.util.List;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            FixedParticipantsGalleryView

public class HangoutEventMessageListItemView extends RelativeLayout
    implements cbt
{

    List a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private FixedParticipantsGalleryView e;
    private CharSequence f;
    private long g;
    private aoa h;

    public HangoutEventMessageListItemView(Context context)
    {
        this(context, null);
    }

    public HangoutEventMessageListItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public long a()
    {
        return g;
    }

    public void a(long l)
    {
        g = l;
    }

    public void a(CharSequence charsequence, long l, aoa aoa1, List list, int i)
    {
        f = charsequence;
        a(l);
        h = aoa1;
        if (a != null || list != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j != 0)
        {
            a = list;
        }
        c.setText(f);
        d.setText(g.b(g, System.currentTimeMillis(), false));
        d.setContentDescription(g.b(g, System.currentTimeMillis(), true));
        charsequence = h.b();
        boolean flag;
        int k;
        boolean flag1;
        if (a != null)
        {
            flag1 = a.contains(charsequence);
        } else
        {
            flag1 = false;
        }
        if (!flag1 || a != null && a.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = com.google.android.apps.hangouts.R.drawable.ca;
        if (flag)
        {
            i = com.google.android.apps.hangouts.R.drawable.bQ;
        } else
        if (i == 1)
        {
            i = com.google.android.apps.hangouts.R.drawable.bP;
        } else
        {
            i = k;
        }
        b.setImageResource(i);
        if (j != 0)
        {
            e.a(h, a, charsequence);
        }
        return;
_L2:
        if (a == null || list == null || a.size() != list.size())
        {
            j = 1;
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
        do
        {
            if (j >= a.size())
            {
                break;
            }
            if (!((cgd)a.get(j)).a((cgd)list.get(j)))
            {
                j = 1;
                continue; /* Loop/switch isn't completed */
            }
            j++;
        } while (true);
        j = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View b()
    {
        return this;
    }

    public void c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        eep.a(stringbuilder, c.getText());
        eep.a(stringbuilder, d.getContentDescription());
        setContentDescription(stringbuilder);
    }

    public void onFinishInflate()
    {
        b = (ImageView)findViewById(h.cC);
        c = (TextView)findViewById(h.fX);
        e = (FixedParticipantsGalleryView)findViewById(h.cf);
        d = (TextView)findViewById(h.U);
    }
}
