// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxo extends cvy
{

    private static final long serialVersionUID = 1L;
    public final long a;

    public cxo(String s, long l)
    {
        super(s);
        a = l;
    }

    public String a()
    {
        return "background_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            String s1 = c;
            long l = a;
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 77)).append("updateWatermark build protobuf conversationID=").append(s1).append(" watermark=").append(l).toString());
        }
        jft jft1 = new jft();
        jft1.a = cvu.a(c);
        jft1.b = Long.valueOf(a);
        jft1.requestHeader = cvu.a(s, i, j, h);
        return jft1;
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return ((cxo)cdl).c.equals(c);
    }

    public String f()
    {
        return "conversations/updatewatermark";
    }
}
