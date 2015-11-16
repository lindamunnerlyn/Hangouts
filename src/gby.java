// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

final class gby extends gbk
{

    final gbs a;
    private final ggi b;
    private final boolean c;
    private final gjl e;

    gby(gbs gbs1, ggi ggi1, boolean flag, gjl gjl)
    {
        a = gbs1;
        super(gbk.d);
        b = ggi1;
        c = flag;
        e = gjl;
    }

    private transient Pair b()
    {
        Object obj;
        try
        {
            gkc.b("vclib", "AuthenticationTask.doInBackgroundTimed");
            obj = gbs.b(a).getApplicationContext();
            obj = b.a(((Context) (obj)), "oauth2:https://www.googleapis.com/auth/hangouts ");
            gkc.b("vclib", "Got authToken for hangouts");
            obj = Pair.create(obj, null);
        }
        catch (eie eie1)
        {
            gkc.b("vclib", "Got authException", eie1);
            return Pair.create(null, eie1.b());
        }
        catch (eib eib1)
        {
            gkc.b("vclib", "Error in getToken", eib1);
            return null;
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return ((Pair) (obj));
    }

    protected Object a()
    {
        return b();
    }

    protected void onPostExecute(Object obj)
    {
        obj = (Pair)obj;
        gkc.b("vclib", "AuthenticationTask.onPostExecute");
        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        gkc.b("vclib", "AuthenticationTask cancelled");
_L4:
        return;
_L2:
        gbs.a(a, null);
        if (obj == null)
        {
            a.a(1000, null);
            return;
        }
        if (((Pair) (obj)).first != null)
        {
            gbs.b(a, (String)((Pair) (obj)).first);
            gbs.g(a).a(gbs.c(a), System.currentTimeMillis());
            if (c)
            {
                gbs.a(a, e);
                return;
            }
        } else
        {
            a.a(46, "User authentication is required.");
            Iterator iterator = gbs.h(a).iterator();
            while (iterator.hasNext()) 
            {
                ((gci)iterator.next()).a((Intent)((Pair) (obj)).second);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
