// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedList;

final class eas extends Thread
{

    final eaq a;

    eas(eaq eaq1)
    {
        a = eaq1;
        eaq1 = String.valueOf(eaq.b(eaq1));
        if (eaq1.length() != 0)
        {
            eaq1 = "NotificationPlayer-".concat(eaq1);
        } else
        {
            eaq1 = new String("NotificationPlayer-");
        }
        super(eaq1);
    }

    public void run()
    {
_L6:
        synchronized (eaq.d(a))
        {
            obj = (eat)eaq.d(a).removeFirst();
        }
        ((eat) (obj)).a;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 98
    //                   2 109;
           goto _L1 _L2 _L3
_L1:
        synchronized (eaq.d(a))
        {
            if (eaq.d(a).size() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            eaq.e(a);
            eaq.f(a);
        }
        return;
        obj;
        linkedlist;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        eaq.a(a, ((eat) (obj)));
        continue; /* Loop/switch isn't completed */
_L3:
        eaq.b(a, ((eat) (obj)));
        if (true) goto _L1; else goto _L4
_L4:
        linkedlist;
        JVM INSTR monitorexit ;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
