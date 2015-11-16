// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

public final class dkl extends dko
{

    final String a;
    final int b;

    public dkl(dnl dnl1)
    {
        a = dnl1.a;
        b = dnl1.b;
    }

    public dkl(String s, int i)
    {
        a = s;
        b = i;
    }

    private void b(aow aow1)
    {
        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("updateConversationNotificationLevelLocally conversationId: ");
            String s1 = a;
            int i = b;
            eev.c("Babel", (new StringBuilder(String.valueOf(s).length() + 31 + String.valueOf(s1).length())).append(s).append(s1).append(" notificationLevel: ").append(i).toString());
        }
        aow1.a();
        aow1.a(a, b);
        c(aow1);
        aow1.b();
        aow1.c();
        return;
        Exception exception;
        exception;
        aow1.c();
        throw exception;
    }

    private void c(aow aow1)
    {
        for (Iterator iterator = aow1.ah(a).iterator(); iterator.hasNext(); aow1.a((String)iterator.next(), b)) { }
    }

    public void a(aow aow1)
    {
        b(aow1);
    }

    public void a(aow aow1, dgk dgk1)
    {
        b(aow1);
        if (aow.a(a))
        {
            switch (b)
            {
            default:
                return;

            case 10: // '\n'
                aow1.l(a, 8L);
                aow1.k(a, 16L);
                return;

            case 20: // '\024'
            case 30: // '\036'
                aow1.k(a, 8L);
                break;
            }
            aow1.l(a, 16L);
            return;
        } else
        {
            dgk1.a(new cwp(a, b));
            return;
        }
    }
}
