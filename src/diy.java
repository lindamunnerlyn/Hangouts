// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

public final class diy extends djb
{

    final String a;
    final int b;

    public diy(czf czf1)
    {
        a = czf1.a;
        b = czf1.b;
    }

    public diy(String s, int i)
    {
        a = s;
        b = i;
    }

    private void b(aoe aoe1)
    {
        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("updateConversationNotificationLevelLocally conversationId: ");
            String s1 = a;
            int i = b;
            ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 31 + String.valueOf(s1).length())).append(s).append(s1).append(" notificationLevel: ").append(i).toString());
        }
        aoe1.a();
        aoe1.a(a, b);
        c(aoe1);
        aoe1.b();
        aoe1.c();
        return;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }

    private void c(aoe aoe1)
    {
        for (Iterator iterator = aoe1.ai(a).iterator(); iterator.hasNext(); aoe1.a((String)iterator.next(), b)) { }
    }

    public void a(aoe aoe1)
    {
        b(aoe1);
    }

    public void a(aoe aoe1, dfb dfb1)
    {
        b(aoe1);
        if (aoe.a(a))
        {
            switch (b)
            {
            default:
                return;

            case 10: // '\n'
                aoe1.m(a, 8L);
                aoe1.l(a, 16L);
                return;

            case 20: // '\024'
            case 30: // '\036'
                aoe1.l(a, 8L);
                break;
            }
            aoe1.m(a, 16L);
            return;
        } else
        {
            dfb1.a(new cul(a, b));
            return;
        }
    }
}
