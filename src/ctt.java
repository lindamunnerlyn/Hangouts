// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctt extends ctu
{

    private static final long serialVersionUID = 1L;
    public final boolean a;
    public final long b;

    public ctt(String s, long l, boolean flag)
    {
        super(s);
        b = l;
        a = flag;
    }

    public String a()
    {
        return "event_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            String s1 = c;
            boolean flag = a;
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 27)).append("Archive conversation ").append(s1).append(" ").append(flag).toString());
        }
        ivn ivn1 = new ivn();
        ivn1.requestHeader = ctq.a(s, i, j, h);
        ivn1.a = ctq.a(c);
        ivn1.c = Long.valueOf(b);
        if (a)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        ivn1.b = Integer.valueOf(i);
        return ivn1;
    }

    public String g()
    {
        return "conversations/modifyconversationview";
    }
}
