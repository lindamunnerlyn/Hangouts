// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

final class dlx
    implements eka
{

    final dlw a;

    dlx(dlw dlw1)
    {
        a = dlw1;
        super();
    }

    public void a(int i)
    {
    }

    public void a_(Bundle bundle)
    {
        bundle = ((Bundle) (dlw.a(a)));
        bundle;
        JVM INSTR monitorenter ;
        if (!dlw.b()) goto _L2; else goto _L1
_L1:
        if (a.a != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        int i = 0;
_L3:
        int j = dlw.b(a);
        ebw.b("Babel_medialoader", (new StringBuilder(87)).append("GmsAvatarLoader: People client onConnected. waiting = ").append(i).append(" numClient=").append(j).toString());
_L2:
        Object obj;
        obj = a.a;
        a.a = null;
        bundle;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            for (bundle = ((Set) (obj)).iterator(); bundle.hasNext(); dlw.a(a, ((dnc) (obj))))
            {
                obj = (dnc)bundle.next();
            }

        }
        break MISSING_BLOCK_LABEL_153;
        i = a.a.size();
          goto _L3
        Exception exception;
        exception;
        bundle;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
