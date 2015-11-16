// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

final class ine
    implements ind
{

    private static final UUID a = UUID.randomUUID();
    private final ilr b;
    private final gsi c;
    private final Executor d;
    private final kxx e;
    private final ConcurrentMap f = new ConcurrentHashMap(2, 0.75F, 1);

    ine(ilr ilr1, gsi gsi1, Executor executor, kxx kxx)
    {
        b = ilr1;
        c = gsi1;
        d = executor;
        e = kxx;
    }

    static ConcurrentMap a(ine ine1)
    {
        return ine1.f;
    }

    static kxx b(ine ine1)
    {
        return ine1.e;
    }

    static Executor c(ine ine1)
    {
        return ine1.d;
    }

    public void a(String s)
    {
        imy imy1 = ino.b();
        if (imy1 != null)
        {
            s = String.valueOf(imy1.b());
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
            Object obj = kvl.newBuilder().a(ino.a()).j().b(uuid.getLeastSignificantBits()).a(c.a()).a(s);
            imx imx1 = new imx(uuid, this, c, ((kvm) (obj)), true);
            s = new ArrayList();
            s.add(((kvm) (obj)).e());
            f.put(uuid, Collections.synchronizedList(s));
            ino.a(imx1);
            obj = b.a(imx1);
            ((jsj) (obj)).a(new inf(this, uuid, s, ((jsj) (obj))), d);
            return;
        }
    }

}
