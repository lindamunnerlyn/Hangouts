// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctw extends cui
{

    private static final long serialVersionUID = 1L;
    public final int a;

    public ctw(int i)
    {
        a = i;
        if (ebw.a("Babel_RequestWriter", 3))
        {
            ebw.d("Babel_RequestWriter", "declineAllInvitesRequest constructor");
        }
    }

    public String a()
    {
        return "event_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ebw.a("Babel_RequestWriter", 3))
        {
            ebw.d("Babel_RequestWriter", "declineAllInvitesRequest build protobuf");
        }
        irs irs1 = new irs();
        irs1.requestHeader = ctq.a(null, true, s, i, j, h);
        s = new irt();
        s.b = Integer.valueOf(a);
        irs1.a = new irt[1];
        irs1.a[0] = s;
        return irs1;
    }

    public void a(ani ani, dbo dbo)
    {
        super.a(ani, dbo);
    }

    public String g()
    {
        return "conversations/declineallinvites";
    }

    public int o()
    {
        return 4;
    }
}
