// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

final class iti
    implements ith
{

    private static final UUID a = UUID.randomUUID();
    private final ire b;
    private final gwu c;
    private final Executor d;
    private final joj e;
    private final ConcurrentMap f = new ConcurrentHashMap(2, 0.75F, 1);

    iti(ire ire1, gwu gwu1, Executor executor, joj joj)
    {
        b = ire1;
        c = gwu1;
        d = executor;
        e = joj;
    }

    static ConcurrentMap a(iti iti1)
    {
        return iti1.f;
    }

    static joj b(iti iti1)
    {
        return iti1.e;
    }

    static Executor c(iti iti1)
    {
        return iti1.d;
    }

    public void a(String s)
    {
        itc itc1 = its.b();
        if (itc1 != null)
        {
            s = String.valueOf(itc1.b());
            if (s.length() != 0)
            {
                s = "Already associated with a trace: ".concat(s);
            } else
            {
                s = new String("Already associated with a trace: ");
            }
            throw new IllegalStateException(s);
        } else
        {
            UUID uuid = UUID.randomUUID();
            Object obj = ldp.newBuilder().a(its.a()).j().b(uuid.getLeastSignificantBits()).a(c.a()).a(s);
            itb itb1 = new itb(uuid, this, c, ((ldq) (obj)), true);
            s = new ArrayList();
            s.add(((ldq) (obj)).e());
            f.put(uuid, Collections.synchronizedList(s));
            its.a(itb1);
            obj = b.a(itb1);
            ((kak) (obj)).a(new itj(this, uuid, s, ((kak) (obj))), d);
            return;
        }
    }

}
