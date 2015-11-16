// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvk extends ctu
{

    private static final long serialVersionUID = 1L;
    public final long a;

    public cvk(String s, long l)
    {
        super(s);
        a = l;
    }

    public String a()
    {
        return "background_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            String s1 = c;
            long l = a;
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 77)).append("updateWatermark build protobuf conversationID=").append(s1).append(" watermark=").append(l).toString());
        }
        izo izo1 = new izo();
        izo1.a = ctq.a(c);
        izo1.b = Long.valueOf(a);
        izo1.requestHeader = ctq.a(s, i, j, h);
        return izo1;
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return ((cvk)ccg).c.equals(c);
    }

    public String g()
    {
        return "conversations/updatewatermark";
    }
}
