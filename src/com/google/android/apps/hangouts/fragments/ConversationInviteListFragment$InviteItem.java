// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import aoa;
import aon;
import aqn;
import aqs;
import com.google.android.apps.hangouts.views.FadeImageView;
import dpn;
import edf;
import edq;
import eef;
import eev;
import gdv;
import h;
import hlp;

// Referenced classes of package com.google.android.apps.hangouts.fragments:
//            ConversationInviteListFragment

public class  extends RelativeLayout
    implements aqs
{

    private String a;
    private aoa b;
    private FadeImageView c;
    private aqn d;
    private String e;
    private eef f;

    private void a()
    {
        if (d != null)
        {
            d.b();
            d = null;
        }
        c.a(false, aon.c());
        if (f != null)
        {
            f.b();
            f = null;
        }
        e = null;
    }

    public void a(aoa aoa1, String s)
    {
        b = aoa1;
        a = s;
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (ConversationInviteListFragment.c())
        {
            String s;
            if (eef1 == null)
            {
                s = null;
            } else
            {
                s = eef1.toString();
            }
            if (edf == null)
            {
                edf = null;
            } else
            {
                edf = edf.toString();
            }
            edf = String.valueOf(edf);
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 71 + String.valueOf(edf).length())).append("InviteItem setImageBitmap ").append(s).append("gifImage=").append(edf).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).toString());
        }
        if (d != aqn1)
        {
            if (eef1 != null)
            {
                eef1.b();
            }
        } else
        {
            d = null;
            if (flag)
            {
                f = eef1;
                eef1 = c;
                if (!flag1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                eef1.a(flag, f.e());
                return;
            }
        }
    }

    public void a(String s, aoa aoa1)
    {
        if (TextUtils.isEmpty(s))
        {
            a();
        } else
        if (!TextUtils.equals(s, e))
        {
            a();
            e = s;
            d = new aqn((new edq(s, aoa1.a())).a(aon.b()).d(true).b(true), this, true, a);
            if (((dpn)hlp.a(getContext(), dpn)).a(d))
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
        c = (FadeImageView)findViewById(h.F);
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }
}
