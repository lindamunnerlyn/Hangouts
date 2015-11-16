// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axn
    implements efc
{

    final ave a;
    private boolean b;
    private int c;

    axn(ave ave1)
    {
        a = ave1;
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
                if (ave.W())
                {
                    ebw.b("Conv", "[ConversationFragment] startBlocking: stop loading");
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
                    if (ave.W())
                    {
                        ebw.b("Conv", "[ConversationFragment] endBlocking: restart loading");
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
