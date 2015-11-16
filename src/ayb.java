// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ayb
    implements eie
{

    final avv a;
    private boolean b;
    private int c;

    ayb(avv avv1)
    {
        a = avv1;
        super();
        b = false;
        c = 0;
    }

    public void a()
    {
        b = true;
        c = c + 1;
        em em1;
        if (a.getActivity() != null)
        {
            if ((em1 = a.getLoaderManager().b(2)) != null)
            {
                if (avv.W())
                {
                    eev.b("Conv", "[ConversationFragment] startBlocking: stop loading");
                }
                em1.v();
                return;
            }
        }
    }

    public void b()
    {
        c = c - 1;
        if (c <= 0)
        {
            b = false;
            if (a.getActivity() != null)
            {
                em em1 = a.getLoaderManager().b(2);
                if (em1 != null)
                {
                    if (avv.W())
                    {
                        eev.b("Conv", "[ConversationFragment] endBlocking: restart loading");
                    }
                    em1.s();
                    return;
                }
            }
        }
    }

    public boolean c()
    {
        return b;
    }
}
