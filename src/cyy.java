// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cyy extends cyq
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final long b;
    public final String c[] = null;

    public cyy(irx irx1)
    {
        a = irx1.a.a;
        if (irx1.b == null)
        {
            ebw.g("Babel", "DeleteConversationNotification without deteleAction");
            b = 0L;
        } else
        {
            b = g.a(irx1.b.c, 0L);
            if (g.a(irx1.b.a, 0) == 2)
            {
                c = irx1.b.d;
                return;
            }
        }
    }
}
