// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cty extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cty(String s)
    {
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "DismissSuggestedContactsRequest()");
        }
        ish ish1 = new ish();
        ish1.requestHeader = ctq.a(null, true, s, i, j, h);
        if (!TextUtils.isEmpty(a))
        {
            s = new ivz();
            s.b = a;
            ish1.a = new ivz[1];
            ish1.a[0] = s;
        }
        return ish1;
    }

    public String g()
    {
        return "contacts/dismisssuggestedcontacts";
    }
}
