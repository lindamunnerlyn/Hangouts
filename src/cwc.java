// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cwc extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cwc(String s)
    {
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "DismissSuggestedContactsRequest()");
        }
        iym iym1 = new iym();
        iym1.requestHeader = cvu.a(null, true, s, i, j, h);
        if (!TextUtils.isEmpty(a))
        {
            s = new jce();
            s.b = a;
            iym1.a = new jce[1];
            iym1.a[0] = s;
        }
        return iym1;
    }

    public String f()
    {
        return "contacts/dismisssuggestedcontacts";
    }
}
