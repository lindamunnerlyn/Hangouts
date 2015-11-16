// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cxm extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cxm(String s)
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
            eev.b("Babel_RequestWriter", "UndismissSuggestedContactsRequest()");
        }
        jfo jfo1 = new jfo();
        jfo1.requestHeader = cvu.a(null, true, s, i, j, h);
        if (!TextUtils.isEmpty(a))
        {
            s = new jce();
            s.b = a;
            jfo1.a = new jce[1];
            jfo1.a[0] = s;
        }
        return jfo1;
    }

    public String f()
    {
        return "contacts/undismisssuggestedcontacts";
    }
}
