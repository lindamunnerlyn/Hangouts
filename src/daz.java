// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public final class daz
{

    private static final boolean a = false;
    private final gms b;

    public daz(Context context)
    {
        b = (gms)hgx.a(context, gms);
    }

    private void b(int i, long l)
    {
        if (i == -1)
        {
            return;
        } else
        {
            b.b(i).c("cachehash_client_hash", l).d();
            return;
        }
    }

    private void c(int i, long l)
    {
        if (i == -1)
        {
            return;
        } else
        {
            b.b(i).c("cachehash_latest_rollup_version", l).d();
            return;
        }
    }

    private void d(int i)
    {
        if (i == -1)
        {
            return;
        } else
        {
            b.b(i).b("cachehash_update_ids", null).d();
            return;
        }
    }

    public long a(int i)
    {
        if (i == -1)
        {
            return -1L;
        } else
        {
            return b.a(i).a("cachehash_client_hash", -1L);
        }
    }

    public void a(int i, long l)
    {
        if (i != -1)
        {
            long l1 = b.a(i).a("cachehash_client_hash", -1L);
            if (l1 != -1L)
            {
                b.b(i).c("cachehash_client_hash", l1 + l).d();
                return;
            }
            if (a)
            {
                ebw.b("Babel", "Fail to udpate the client hash by hash_diff from the server, because the original client hash is UNKNOWN_HASH.");
                return;
            }
        }
    }

    public void a(int i, long l, long l1)
    {
        if (i == -1)
        {
            return;
        } else
        {
            b(i, l);
            c(i, l1);
            d(i);
            return;
        }
    }

    public boolean a(int i, String s)
    {
        Set set;
        if (i != -1)
        {
            if ((set = b.a(i).c("cachehash_update_ids")) != null && set.contains(s))
            {
                return true;
            }
        }
        return false;
    }

    public long b(int i)
    {
        if (i == -1)
        {
            return -1L;
        } else
        {
            return b.a(i).a("cachehash_latest_rollup_version", -1L);
        }
    }

    public void b(int i, String s)
    {
        if (i == -1)
        {
            return;
        }
        Object obj = b.a(i).c("cachehash_update_ids");
        if (obj == null)
        {
            obj = new HashSet();
        } else
        {
            obj = new HashSet(((java.util.Collection) (obj)));
        }
        ((Set) (obj)).add(s);
        b.b(i).b("cachehash_update_ids", ((Set) (obj))).d();
    }

    public void c(int i)
    {
        if (i == -1)
        {
            return;
        } else
        {
            b(i, -1L);
            c(i, -1L);
            d(i);
            return;
        }
    }

    static 
    {
        hik hik = ebw.n;
    }
}
