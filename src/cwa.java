// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwa extends cwm
{

    private static final long serialVersionUID = 1L;
    public final int a;

    public cwa(int i)
    {
        a = i;
        if (eev.a("Babel_RequestWriter", 3))
        {
            eev.d("Babel_RequestWriter", "declineAllInvitesRequest constructor");
        }
    }

    public String a()
    {
        return "event_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (eev.a("Babel_RequestWriter", 3))
        {
            eev.d("Babel_RequestWriter", "declineAllInvitesRequest build protobuf");
        }
        ixx ixx1 = new ixx();
        ixx1.requestHeader = cvu.a(null, true, s, i, j, h);
        s = new ixy();
        s.b = Integer.valueOf(a);
        ixx1.a = new ixy[1];
        ixx1.a[0] = s;
        return ixx1;
    }

    public void a(aoa aoa, dcx dcx)
    {
        super.a(aoa, dcx);
    }

    public String f()
    {
        return "conversations/declineallinvites";
    }

    public int n()
    {
        return 4;
    }
}
