// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cvi extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cvi(String s)
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
            ebw.b("Babel_RequestWriter", "UndismissSuggestedContactsRequest()");
        }
        izj izj1 = new izj();
        izj1.requestHeader = ctq.a(null, true, s, i, j, h);
        if (!TextUtils.isEmpty(a))
        {
            s = new ivz();
            s.b = a;
            izj1.a = new ivz[1];
            izj1.a[0] = s;
        }
        return izj1;
    }

    public String g()
    {
        return "contacts/undismisssuggestedcontacts";
    }
}
