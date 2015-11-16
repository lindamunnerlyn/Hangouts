// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

final class gem extends gdy
{

    final geg a;
    private final gji b;
    private final boolean c;
    private final gmn e;

    gem(geg geg1, gji gji1, boolean flag, gmn gmn)
    {
        a = geg1;
        super(gdy.d);
        b = gji1;
        c = flag;
        e = gmn;
    }

    private transient Pair b()
    {
        Object obj;
        try
        {
            gne.a(3, "vclib", "AuthenticationTask.doInBackgroundTimed");
            obj = geg.b(a).getApplicationContext();
            obj = b.a(((Context) (obj)), "oauth2:https://www.googleapis.com/auth/hangouts ");
            gne.a(3, "vclib", "Got authToken for hangouts");
            obj = Pair.create(obj, null);
        }
        catch (elf elf1)
        {
            gne.a("vclib", "Got authException", elf1);
            return Pair.create(null, elf1.b());
        }
        catch (elc elc1)
        {
            gne.a("vclib", "Error in getToken", elc1);
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
        gne.a(3, "vclib", "AuthenticationTask.onPostExecute");
        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        gne.a(3, "vclib", "AuthenticationTask cancelled");
_L4:
        return;
_L2:
        geg.a(a, null);
        if (obj == null)
        {
            a.b(1000, null);
            return;
        }
        if (((Pair) (obj)).first != null)
        {
            geg.b(a, (String)((Pair) (obj)).first);
            geg.g(a).a(geg.c(a), System.currentTimeMillis());
            if (c)
            {
                geg.a(a, e);
                return;
            }
        } else
        {
            a.b(46, "User authentication is required.");
            Iterator iterator = geg.h(a).iterator();
            while (iterator.hasNext()) 
            {
                ((gew)iterator.next()).a((Intent)((Pair) (obj)).second);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
