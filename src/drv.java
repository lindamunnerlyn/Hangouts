// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.libraries.social.settings.CheckBoxPreference;

final class drv extends bgs
{

    final drt d;
    private final int e;
    private final boolean f;

    drv(drt drt1, int i, boolean flag)
    {
        d = drt1;
        super();
        e = i;
        f = flag;
    }

    public String a()
    {
        return d.getActivity().getString(l.jf);
    }

    protected void a(did did1)
    {
        super.a(did1);
        did1 = (daj)did1.c();
        int i = drt.e(d).a();
        Boolean boolean1 = did1.k();
        if (boolean1 != null)
        {
            boolean flag = g.a(boolean1, false);
            drt.a(d).a(flag);
            drt.f(d).b(i, flag);
        }
        did1 = did1.l();
        if (did1 != null)
        {
            boolean flag1 = g.a(did1, false);
            drt.b(d).a(flag1);
            drt.f(d).a(i, flag1);
        }
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        if (e == 2)
        {
            exception = drt.a(d);
            boolean flag;
            if (!f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            exception.a(flag);
        }
    }

    public int b()
    {
        return RealTimeChatService.a(drt.d(d), e, f);
    }

    public void c()
    {
        if (!j())
        {
            Toast.makeText(drt.g(d), l.jh, 0).show();
            return;
        } else
        {
            Toast.makeText(drt.h(d), l.jg, 0).show();
            return;
        }
    }

    public Class e()
    {
        return cxg;
    }

    public Class f()
    {
        return daj;
    }
}
