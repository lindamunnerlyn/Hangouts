// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.libraries.social.settings.CheckBoxPreference;

final class dpc extends bgg
{

    final dpa d;
    private final int e;
    private final boolean f;

    dpc(dpa dpa1, int i, boolean flag)
    {
        d = dpa1;
        super();
        e = i;
        f = flag;
    }

    public String a()
    {
        return d.getActivity().getString(l.jM);
    }

    protected void a(dgu dgu1)
    {
        super.a(dgu1);
        dgu1 = (cyf)dgu1.c();
        int i = dpa.e(d).a();
        Boolean boolean1 = dgu1.k();
        if (boolean1 != null)
        {
            boolean flag = g.a(boolean1, false);
            dpa.a(d).a(flag);
            dpa.f(d).b(i, flag);
        }
        dgu1 = dgu1.l();
        if (dgu1 != null)
        {
            boolean flag1 = g.a(dgu1, false);
            dpa.b(d).a(flag1);
            dpa.f(d).a(i, flag1);
        }
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        if (e == 2)
        {
            exception = dpa.a(d);
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
        return RealTimeChatService.a(dpa.d(d), e, f);
    }

    public void c()
    {
        if (!j())
        {
            ebr.a(d.getActivity(), l.jO);
            return;
        } else
        {
            ebr.a(d.getActivity(), l.jN);
            return;
        }
    }

    public Class e()
    {
        return cvc;
    }

    public Class f()
    {
        return cyf;
    }
}
