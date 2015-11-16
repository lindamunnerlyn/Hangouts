// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxe extends cwm
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final int b;

    public cxe(String s, int i)
    {
        a = s;
        b = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "setHangoutNotificationStatus build protobuf");
        }
        jej jej1 = new jej();
        jej1.a = a;
        jej1.b = Integer.valueOf(b);
        jej1.requestHeader = cvu.a(s, i, j, h);
        return jej1;
    }

    public String f()
    {
        return "hangouts/sethangoutnotificationstatus";
    }
}
