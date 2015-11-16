// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dkq extends hdj
{

    private static final hkl a = new hkl("debug.plus.frontend.url", "www.googleapis.com/plusi/v3/ozInternal/");
    private static final hkl b = new hkl("debug.conserver.frontend.url", "www.googleapis.com/chat/v1android/");
    private static final hkl c = new hkl("debug.conserver.upload.url", "www.googleapis.com/upload/chat/v1android/");

    public dkq()
    {
    }

    public String a(String s)
    {
        if ("plusi".equals(s))
        {
            return a.a();
        }
        if ("hangouts".equals(s))
        {
            return b.a();
        }
        if ("hangouts-upload".equals(s))
        {
            return c.a();
        } else
        {
            return null;
        }
    }

}
