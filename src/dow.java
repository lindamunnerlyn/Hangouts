// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Set;

final class dow
    implements end
{

    final dou a;

    dow(dou dou1)
    {
        a = dou1;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        synchronized (dou.a(a))
        {
            connectionresult = String.valueOf(connectionresult);
            eev.g("Babel_medialoader", (new StringBuilder(String.valueOf(connectionresult).length() + 51)).append("GmsAvatarLoader: People client connection failure: ").append(connectionresult).toString());
            connectionresult = a.a;
            a.a = null;
        }
        if (connectionresult != null)
        {
            for (connectionresult = connectionresult.iterator(); connectionresult.hasNext(); dou.b(a, ((dpw) (obj))))
            {
                obj = (dpw)connectionresult.next();
            }

        }
        break MISSING_BLOCK_LABEL_113;
        connectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw connectionresult;
    }
}
