// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dne extends dmw
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final long b;
    public final String c[] = null;

    public dne(iyc iyc1)
    {
        a = iyc1.a.a;
        if (iyc1.b == null)
        {
            eev.g("Babel", "DeleteConversationNotification without deteleAction");
            b = 0L;
        } else
        {
            b = g.a(iyc1.b.c, 0L);
            if (g.a(iyc1.b.a, 0) == 2)
            {
                c = iyc1.b.d;
                return;
            }
        }
    }
}
