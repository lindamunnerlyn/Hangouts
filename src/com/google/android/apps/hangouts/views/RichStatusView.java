// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bka;
import cey;
import csw;
import ebr;
import ebw;
import edv;
import egj;
import g;
import gbh;
import h;
import hhb;
import l;

public class RichStatusView extends LinearLayout
{

    private static final boolean a = false;
    private static int b = -1;
    private static int c = -1;
    private final egj d[];
    private AnimationDrawable e;
    private cey f;
    private csw g;

    public RichStatusView(Context context)
    {
        super(context);
        d = new egj[3];
        if (b < 0)
        {
            b = getResources().getDimensionPixelSize(g.eI);
        }
        if (c < 0)
        {
            c = getResources().getDimensionPixelSize(g.eH);
        }
    }

    public RichStatusView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new egj[3];
        if (b < 0)
        {
            b = getResources().getDimensionPixelSize(g.eI);
        }
        if (c < 0)
        {
            c = getResources().getDimensionPixelSize(g.eH);
        }
    }

    public static void a(RichStatusView richstatusview)
    {
        int i = 0;
_L3:
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (richstatusview.d[i].b.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        i = 1;
_L4:
        if (i != 0)
        {
            richstatusview.setVisibility(0);
            return;
        } else
        {
            richstatusview.setVisibility(8);
            return;
        }
_L2:
        i++;
          goto _L3
        i = 0;
          goto _L4
    }

    public String a(Context context)
    {
        switch (g.b())
        {
        default:
            return null;

        case 1: // '\001'
            return context.getString(l.g);

        case 2: // '\002'
            return context.getString(l.h);

        case 3: // '\003'
            return context.getString(l.f);
        }
    }

    public void a()
    {
        d[1].a(false);
        d[2].a(false);
    }

    public void a(int i)
    {
        if (i == 1)
        {
            i = getResources().getColor(g.dp);
        } else
        {
            i = getResources().getColor(g._flddo);
        }
        d[0].b(i);
        d[1].b(i);
        d[2].b(i);
    }

    public void a(cey cey)
    {
        f = cey;
    }

    public void a(csw csw1)
    {
        g = csw1;
    }

    public void a(StringBuilder stringbuilder)
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = getContext();
        if (d[2].a)
        {
            String s = a(((Context) (obj)));
            if (s != null)
            {
                ebr.a(stringbuilder, s);
            }
        }
        if (!d[1].a)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (g.c())
        {
        default:
            obj = null;
            break;

        case 100: // 'd'
            break; /* Loop/switch isn't completed */

        case 200: 
            break MISSING_BLOCK_LABEL_112;
        }
_L4:
        if (obj != null)
        {
            ebr.a(stringbuilder, ((CharSequence) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj = ((Context) (obj)).getString(l.d);
          goto _L4
        obj = ((Context) (obj)).getString(l.e);
          goto _L4
    }

    public void a(boolean flag)
    {
label0:
        {
            egj egj1 = d[0];
            if (egj1.a != flag)
            {
                egj1.a(flag);
                if (!flag)
                {
                    break label0;
                }
                e.start();
            }
            return;
        }
        e.stop();
    }

    public void b(boolean flag)
    {
        float f1;
        int i;
        if (flag)
        {
            f1 = 0.4F;
        } else
        {
            f1 = 1.0F;
        }
        for (i = 0; i < 3; i++)
        {
            d[i].c.setAlpha(f1);
        }

    }

    public boolean b()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (g == null) goto _L2; else goto _L1
_L1:
        if (a)
        {
            String s = String.valueOf(f);
            String s1 = String.valueOf(g);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 44 + String.valueOf(s1).length())).append("Showing presence: mParticipantId=").append(s).append(", presence=").append(s1).toString());
        }
        g.c();
        JVM INSTR lookupswitch 2: default 120
    //                   100: 209
    //                   200: 216;
           goto _L3 _L4 _L5
_L3:
        int i = 0;
_L10:
        flag1 = d[1].a(i, getResources().getColor(g.dO));
        g.b();
        JVM INSTR tableswitch 1 3: default 176
    //                   1 223
    //                   2 230
    //                   3 237;
           goto _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_237;
_L6:
        i = ((flag) ? 1 : 0);
_L11:
        flag1 = d[2].a(i, getResources().getColor(g.dO)) | (flag1 | false);
_L2:
        return flag1;
_L4:
        i = com.google.android.apps.hangouts.R.drawable.bH;
          goto _L10
_L5:
        i = com.google.android.apps.hangouts.R.drawable.bL;
          goto _L10
_L7:
        i = com.google.android.apps.hangouts.R.drawable.bG;
          goto _L11
_L8:
        i = com.google.android.apps.hangouts.R.drawable.bJ;
          goto _L11
        i = com.google.android.apps.hangouts.R.drawable.bx;
          goto _L11
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        d[0] = new egj(this, h.fz, h.bg, c);
        d[1] = new egj(this, h.fx, h.fw, b);
        d[2] = new egj(this, h.fv, h.fu, b);
        ImageView imageview = d[0].c;
        gbh.b(imageview);
        Object obj = getContext();
        if (obj instanceof bka)
        {
            obj = (bka)obj;
        } else
        if (obj instanceof hhb)
        {
            obj = (bka)((hhb)obj).getBaseContext();
        } else
        {
            gbh.a("Unknown type of context");
            obj = null;
        }
        e = edv.b(((bka) (obj)));
        imageview.setBackgroundDrawable(e);
    }

    static 
    {
        hik hik = ebw.w;
    }
}
