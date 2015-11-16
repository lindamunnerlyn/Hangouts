// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cva extends cui
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final int b;

    public cva(String s, int i)
    {
        a = s;
        b = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "setHangoutNotificationStatus build protobuf");
        }
        iye iye1 = new iye();
        iye1.a = a;
        iye1.b = Integer.valueOf(b);
        iye1.requestHeader = ctq.a(s, i, j, h);
        return iye1;
    }

    public String g()
    {
        return "hangouts/sethangoutnotificationstatus";
    }
}
