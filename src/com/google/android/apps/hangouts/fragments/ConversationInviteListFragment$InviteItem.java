// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import ani;
import anv;
import apw;
import aqb;
import com.google.android.apps.hangouts.views.FadeImageView;
import dmt;
import eab;
import eam;
import ebh;
import ebw;
import gbh;
import h;
import hgx;

// Referenced classes of package com.google.android.apps.hangouts.fragments:
//            ConversationInviteListFragment

public class  extends RelativeLayout
    implements aqb
{

    private String a;
    private ani b;
    private FadeImageView c;
    private apw d;
    private String e;
    private ebh f;

    private void a()
    {
        if (d != null)
        {
            d.b();
            d = null;
        }
        c.a(false, anv.c());
        if (f != null)
        {
            f.b();
            f = null;
        }
        e = null;
    }

    public void a(ani ani1, String s)
    {
        b = ani1;
        a = s;
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        gbh.a(eab);
        if (ConversationInviteListFragment.c())
        {
            String s;
            if (ebh1 == null)
            {
                s = null;
            } else
            {
                s = ebh1.toString();
            }
            if (eab == null)
            {
                eab = null;
            } else
            {
                eab = eab.toString();
            }
            eab = String.valueOf(eab);
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 71 + String.valueOf(eab).length())).append("InviteItem setImageBitmap ").append(s).append("gifImage=").append(eab).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).toString());
        }
        if (d != apw1)
        {
            if (ebh1 != null)
            {
                ebh1.b();
            }
        } else
        {
            d = null;
            if (flag)
            {
                f = ebh1;
                ebh1 = c;
                if (!flag1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ebh1.a(flag, f.e());
                return;
            }
        }
    }

    public void a(String s, ani ani1)
    {
        if (TextUtils.isEmpty(s))
        {
            a();
        } else
        if (!TextUtils.equals(s, e))
        {
            a();
            e = s;
            d = new apw((new eam(s, ani1.a())).a(anv.b()).d(true).b(true), this, true, a);
            if (((dmt)hgx.a(getContext(), dmt)).a(d))
            {
                d = null;
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        a();
        super.onDetachedFromWindow();
    }

    public void onFinishInflate()
    {
        c = (FadeImageView)findViewById(h.G);
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }
}
